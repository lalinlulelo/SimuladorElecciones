package proyecto;
import java.util.ArrayList;
import java.util.Random;

/**
 * @descripcion: Eleccion en una circunscripcion. 
 * Almacena datos sobre la circunscripcion, las listas y los resultados
 * electorales a nivel local.
 * 
 */
public class EleccionCirc {
    private String nombre;
    private int poblacion;
    private int escanos;
    private double participacion;
    private TablaVotos resultados_votos;
    private TablaEscanos resultados_escanos;
    private ArrayList<Lista> listas_cand;
    private ArrayList<Lista> listas_elec;
    private int votos_blanco;
    
    /* Constructor */
    public EleccionCirc(){
    
    
    }
    
    public EleccionCirc(String n, int pob, int esc) {
        this.nombre = n;
        this.poblacion = pob;
        this.escanos = esc;
        this.resultados_votos = new TablaVotos();
        this.resultados_escanos = new TablaEscanos();
        this.listas_cand = new ArrayList();
        this.listas_elec = new ArrayList();
    }

    /* Handlers */
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setPoblacion(int p) {
        this.poblacion = p;
    }
    
    public void setEscanos(int e) {
        this.escanos = e;
    }
    
    public void setParticipacion(double p) {
        this.participacion = p;
    }
    
    public void setVotosBlanco(int v) {
        this.votos_blanco = v;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getPoblacion() {
        return this.poblacion;
    }
    
    public int getEscanos() {
        return this.escanos;
    }
    
    public double getParticipacion() {
        return this.participacion;
    }
    
    public int getVotosBlanco() {
        return this.votos_blanco;
    }
    
    public ArrayList<Lista> getListaElectos() {
        return this.listas_elec;
    }
    
    public void addListaCand(Lista l) {
        this.listas_cand.add(l);
    }
    
    /* Otros metodos */
    // Genera resultados de manera aleatoria y los almacena.
    public TablaVotos SimularResultados() {
        int votos_totales;
        // Simular una participacion (aleatoria...)
        Random rnd = new Random();
        this.participacion = rnd.nextDouble()*100; // Fijar dato entre 0 y 99.
        // Sacar el numero de votos
        votos_totales = ((int) this.participacion)*this.poblacion/100;
        // Reparto de votos entre listas aleatoriamente
        int i, porrepartir = votos_totales, votos_asignados;
        for (Lista laux : this.listas_cand) {
            // Asignamos ciertos votos a cada partido
            votos_asignados = ((int)(rnd.nextDouble()*100))*porrepartir/100;
            //System.out.println("Votos asignados: "+votos_asignados+" de "+votos_totales);
            this.resultados_votos.addItem(laux.getFP().getSiglas(), votos_asignados);
            porrepartir -= votos_asignados;
        }
        // Los que sobran, se dejan en blanco.
        this.votos_blanco = porrepartir;
        return resultados_votos;
    }
    
    // Calcula escaños a partir de la tabla de votos
    public TablaEscanos CalcularResultado(TablaVotos res_votos) {
        // Repartir los escaños con el método D'Hondt
        // Reservar el array de escanos a 0.
        int[] esc = new int[res_votos.getSize()];
        for (int i = 0; i < res_votos.getSize(); i++) {
            esc[i] = 0;
        }
        // Repartir los escaños con el método.
        int es_repartidos = 0;
        while (es_repartidos != this.escanos) {
            // Seleccionar quien se lleva el nuevo escaño.
            int max = res_votos.getItems().get(0).getVotos()/(esc[0]+1);
            int partido = 0;
            // Pasamos por todos nos votos para elegir el máximo.
            for (int j = 1; j < res_votos.getSize(); j++) {
                //System.out.println("Partido "+res_votos.getItems().get(j).getSiglas()
                        //+" con "+esc[j]+" escaños.");
                if (res_votos.getItems().get(j).getVotos()/(esc[j]+1) > max) {
                    max = res_votos.getItems().get(j).getVotos()/(esc[j]+1);
                    partido = j;
                }
                if (j == res_votos.getSize()-1) {
                    //System.out.println("De entre todos he elegido a: "+partido);
                }
            }
            esc[partido] += 1;
            es_repartidos++;
        }
        // Guardar los datos obtenidos
        for (int i = 0; i < res_votos.getSize(); i++) {
            this.resultados_escanos.addItem(res_votos.getItems().get(i).getSiglas(), esc[i]);
            //System.out.println("A "+res_votos.getItems().get(i).getSiglas());
        }
        return resultados_escanos; 
    }
    
    // Calcula listas de militantes con escaño
    public void CalcularListas(TablaEscanos res_escanos) {
        // Recorremos cada entrada que tiene escaños
        for (ItemTablaEscanos ite : res_escanos.getItems()) {
            // Recorremos el vector de listas de candidatos 
            for (Lista laux : this.listas_cand) {
                System.out.println(laux.toString());
                System.out.println(ite.getSiglas());
                if (laux.getFP().getSiglas().equals(ite.getSiglas())) {
                    int i;
                    Lista l = new Lista("Escaños selectos", laux.getFP());
                    ArrayList<Militante> mil = laux.getElementos();
                    // Seleccionamos los militantes primeros
                    for (i = 0; (i < ite.getEscanos()) && (i < mil.size()); i++) {
                        l.AddElemento(mil.get(i));  
                    }
                    // Guardamos la lista
                    this.listas_elec.add(l);
                }
            }
        }
    }
    
    public void ImprimirTablaVotos() {
        System.out.println("Tabla de votos para la circunscripción "+this.nombre+":");
        for (ItemTablaVotos itv : this.resultados_votos.getItems()) {
            System.out.println("Partido: "+itv.getSiglas()+" obtiene "+itv.getVotos()+" votos");
        }
    }
    
    public void ImprimirTablaEscanos() {
        System.out.println("Tabla de escaños para la circunscripción "+nombre+":");
        for (ItemTablaEscanos ite : this.resultados_escanos.getItems()) {
            System.out.println("Partido: "+ite.getSiglas()+" obtiene "+ite.getEscanos()+ " escanos");
        }
    }
}
