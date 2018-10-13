package proyecto;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * @descripcion: PartidoPolitico, clase que hereda de FormacionPolitica.
 * Almacena nombres, siglas y logo. 
 * Tiene los handlers de cada atributo privado.
 */
public class PartidoPolitico extends FormacionPolitica {
    private Militante secretario;
    private ArrayList<Votante> votantes;
    private ArrayList<Militante> militantes;
    private Lista listMili; //Militantes que se presentan por el partido
    
    /* Constructor */
    public PartidoPolitico(){
    
    }
    public PartidoPolitico(String n, String si, String l, Militante sec) {
        this.setNombre(n);
        this.setSiglas(si);
        this.setLogo(l);
        this.secretario = sec;
        this.votantes = new ArrayList();
        this.militantes = new ArrayList();
        this.setReadyListas();
    }
    
    public PartidoPolitico(String n, String si, String l) {
        this.setNombre(n);
        this.setSiglas(si);
        this.setLogo(l);        
        this.votantes = new ArrayList();
        this.militantes = new ArrayList();
        this.setReadyListas();
    }
    
    /* Handlers */
    public void setSecretario(Militante s) {
        this.secretario = s;
    }
    
    public void addVotantes(Votante v) {
        this.votantes.add(v);
    }
    
    public void addMilitantes(Militante m) {
        this.militantes.add(m);
    }
    
    public Militante getSecretario() {
        return this.secretario;
    }
    
    public ArrayList<Votante> getVotantes() {
        return this.votantes;
    }
    
    public ArrayList<Militante> getMilitantes() {
        return this.militantes;
    }
    
    /* Otros métodos */
    /* Cargar listas de un partido politico de fichero dado por terminal */
    public void CargarListas() {
        File a = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            /* Abrimos el fichero y creamos el buffer de lectura. */
            Scanner sca = new Scanner(System.in);
            System.out.println("Nombre del fichero para partido "+this.getSiglas()+": ");
            String n = sca.next();
            a = new File(n);
            fr = new FileReader(a);
            br = new BufferedReader(fr);
            /* Dado que hay un militante por línea, leemos líneas */
            String l;
            while ((l = br.readLine()) != null) {
                String[] l2 = l.split(":");
                System.out.println(l);
                Militante m = new Militante(l2[0], l2[1], 
                        Integer.parseInt(l2[2]), l2[3], 
                        l2[4].charAt(0), l2[5], Integer.parseInt(l2[6]), l2[7]);
                this.militantes.add(m);
                this.votantes.add(m);
                this.militantes.add(m);
                this.votantes.add(m);
                this.votantes.add(m);
            }
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getLocalizedMessage());
        }
    }
     public void CargarListasI(String s) {
        File a = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            /* Abrimos el fichero y creamos el buffer de lectura. */
            /*Scanner sca = new Scanner(System.in);
            System.out.println("Nombre del fichero para partido "+this.getSiglas()+": ");
            String n = sca.next();
            */
            a = new File(s);
            fr = new FileReader(a);
            br = new BufferedReader(fr);
            /* Dado que hay un militante por línea, leemos líneas */
            String l;
            while ((l = br.readLine()) != null) {
                String[] l2 = l.split(":");
                System.out.println(l);
                Militante m = new Militante(l2[0], l2[1], 
                        Integer.parseInt(l2[2]), l2[3], 
                        l2[4].charAt(0), l2[5], Integer.parseInt(l2[6]), l2[7]);
                this.militantes.add(m);
                this.votantes.add(m);
                this.militantes.add(m);
                this.votantes.add(m);
                this.votantes.add(m);
            }
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getLocalizedMessage());
        }
    }
    /* Para cada votante, se lanzan encuestas */
    public void LanzarEncuestas() {
        int i;
        for (i = 0; i < this.votantes.size(); i++) {
            Votante vot = this.votantes.get(i);
            vot.EnviarEncuesta();
        }
    }
    
    @Override
    /* Crear listas para cada circunscripcion en eleccion */
    public void ElaborarListas(Eleccion elec) {
        int i, acc = 0;
        //FileWriter fileOut=new FileWriter(elec);
        //BufferedWriter buffer=new BufferedWriter (fileOut);
        //PrintWriter salida=new PrintWriter (buffer);
        // Recorremos cada circunscripcion
        for (EleccionCirc ec : elec.getCircuns()) {
            Lista l = new Lista("EC "+this.getSiglas()+ec.getNombre(), this);
            // Añadimos militantes a la lista hasta que se acaben los militantes
            // o se completen todos los puestos (tantos como escaños).
            i = 0;
            while ((i<ec.getEscanos()) && (acc < this.militantes.size())) {
                l.AddElemento(this.militantes.get(acc));
                i++;
                acc++;
            }
            // Añadimos la lista creada a las del partido y a la EleccionCirc
            this.getListas().add(l);
            ec.addListaCand(l);
        }
    }
}
