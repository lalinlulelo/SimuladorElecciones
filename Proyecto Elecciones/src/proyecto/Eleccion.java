package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: Clase que almacena todas las circunscripciones.
 *                 También se almacenan los datos electorales generales.
 */
public class Eleccion {
    
    private String nombre;
    private double participacion;
    private int escanos;
    private TablaVotos resultado_total_votos;
    private TablaEscanos resultado_total_escanos;
    private ArrayList<EleccionCirc> eleccircuns;
    
    /* Constructor */
    public Eleccion(){
        //this.escanos = escanos;
        this.resultado_total_votos = new TablaVotos();
        this.resultado_total_escanos = new TablaEscanos();
        this.eleccircuns = new ArrayList();
    
    }
    public Eleccion(String n, int escanos) {
        this.nombre = n;
        this.escanos = escanos;
        this.resultado_total_votos = new TablaVotos();
        this.resultado_total_escanos = new TablaEscanos();
        this.eleccircuns = new ArrayList();
    }
    
    /* Handlers */
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setParticipacion(double p) {
        this.participacion = p;
    }
    
    public void setEscanos(int e) {
        this.escanos = e;
    }
    
    public String getName() {
        return this.nombre;
    }
    
    public double getParticipacion () {
        return this.participacion;
    }
    
    public int getEscanos() {
        return this.escanos;
    }
    
    public TablaVotos getTablaVotos() {
        return this.resultado_total_votos;
    }
    
    public TablaEscanos getTablaEscanos() {
        return this.resultado_total_escanos;
    }
    
    public void addCircunscripcion(String s, int p, int esc) {
        EleccionCirc aux = new EleccionCirc(s, p, esc);
        this.eleccircuns.add(aux);        
    }
    
    public ArrayList<EleccionCirc> getCircuns() {
        return this.eleccircuns;
    }
    
    /* Otros metodos */    
    // Completar la tabla de votos y escaños de circunscipciones y eleccion.
    public void rellenaTablas() {
        // Recorremos todas las circunscripciones.
        for (EleccionCirc ecir : this.eleccircuns) {
            // Crear nueva tabla de votos y recorrerla
            TablaVotos tv = ecir.SimularResultados();
            for (ItemTablaVotos itv : tv.getItems()) {
                int encontrado = 0;
                for (ItemTablaVotos itv2 : this.resultado_total_votos.getItems()) {
                    // Si ya estaban las siglas, sumamos
                    if (itv2.getSiglas().equals(itv.getSiglas())) {
                        itv2.setVotos(itv2.getVotos()+itv.getVotos());
                        encontrado = 1;
                        break;
                    }
                }
                // Si no se ha encontrado, se crea uno nuevo
                if (encontrado == 0) {
                        this.resultado_total_votos.addItem(itv.getSiglas(), itv.getVotos());
                }
            }
            System.out.println("Tabla de Votos llena: "+this.resultado_total_votos.getItems().size());
            // Crear nueva tabla de escanos y recorrerla
            TablaEscanos te = ecir.CalcularResultado(tv);
            for (ItemTablaEscanos ite : te.getItems()) {
                int encontrado = 0;
                for (ItemTablaEscanos ite2 : this.resultado_total_escanos.getItems()) {
                    // Si ya estaban las siglas, sumamos
                    if (ite2.getSiglas().equals(ite.getSiglas())) {
                        ite2.setEscanos(ite2.getEscanos()+ite.getEscanos());
                        encontrado = 1;
                        break;
                    }
                }
                //  Si no se ha encontrado, se crea uno nuevo
                if (encontrado == 0) {
                    this.resultado_total_escanos.addItem(ite.getSiglas(), ite.getEscanos());
                }
            }
            System.out.println("Tabla de Escanos llena: "+te.getItems().size());
            // Calculamos la lista de militantes electos
            ecir.CalcularListas(te);
            System.out.println("Listas calculadas "+ecir.getListaElectos().size());
        }
    }
                
    public void ImprimirTablaGlobalVotos() {
        System.out.println("Tabla de votos para la eleccion '"+this.nombre+"':");
        for (ItemTablaVotos itv : this.resultado_total_votos.getItems()) {           
            System.out.println("Partido: "+itv.getSiglas()+" obtiene "+itv.getVotos()+" votos");
        }
    }
    
        public String ImprimirTablaGlobalVotosI() {
        System.out.println("Tabla de votos para la eleccion '"+this.nombre+"':");
        String mensajeVotos = "Tabla de votos para la eleccion '"+this.nombre+"': \n";
        String mensajeVotost = "";
        for (ItemTablaVotos itv : this.resultado_total_votos.getItems()) {           
            String mensajeVotos2 = "Partido: "+itv.getSiglas()+" obtiene "+itv.getVotos()+" votos \n";
            System.out.println("Partido: "+itv.getSiglas()+" obtiene "+itv.getVotos()+" votos");
            mensajeVotost = mensajeVotost + mensajeVotos2;
        }
        
        return mensajeVotos + mensajeVotost;
    }
    
    public void ImprimirTablaGlobalEscanos() {
        System.out.println("Tabla de escanos para la eleccion '"+this.nombre+"':");
        for (ItemTablaEscanos ite : this.resultado_total_escanos.getItems()) {
            System.out.println("Partido: "+ite.getSiglas()+" obtiene "+ite.getEscanos()+" escanos");
        }
    }
    
    public String ImprimirTablaGlobalEscanosI() {      
        System.out.println("Tabla de escanos para la eleccion '"+this.nombre+"':");
        String mensajeEscanos = "Tabla de escanos para la eleccion '"+this.nombre+"': \n";
        String mensajeEscanost = "";
        for (ItemTablaEscanos ite : this.resultado_total_escanos.getItems()) {
            String mensajeEscanos2 = "Partido: "+ite.getSiglas()+" obtiene "+ite.getEscanos()+" escanos \n";
            System.out.println("Partido: "+ite.getSiglas()+" obtiene "+ite.getEscanos()+" escanos");
            mensajeEscanost = mensajeEscanost + mensajeEscanos2;
        }
        return mensajeEscanos + mensajeEscanost;
    }
    
  
    public void ImprimirListasElectos() {
        System.out.println("Tabla de electos para la eleccion '"+this.nombre+"':");
        for (EleccionCirc ecir : this.eleccircuns) {
            System.out.println("En la circunscripción "+ecir.getNombre()+": ");
            for (Lista lst : ecir.getListaElectos()) {
                for (int i=0; i<lst.getElementos().size();) {
                    Militante mil= new Militante();
                    mil= lst.getElementos().get(i);
                    if(i==0)
                        System.out.println("Partido: "+lst.getFP().getSiglas()+": " +mil.getNombre()+" "+mil.getApellidos());
                    i=lst.getElementos().indexOf(mil);
                    if(i<lst.getElementos().size()&&i!=0)
                        System.out.println("Partido: "+lst.getFP().getSiglas()+": " +lst.getElementos().get(i).getNombre()+" "+lst.getElementos().get(i).getApellidos());
                    i++;
                    i++;
                }
            }
        }
    }
    
        public ArrayList<ArrayList> ImprimirListasElectosI() {
        ArrayList<ArrayList>aux= new ArrayList();//Puntero a  fila
        ArrayList<String>Circuns = new ArrayList(); //puntero a Circuns
        ArrayList<String>Partido = new ArrayList(); //puntero a Partido
        ArrayList<String>MilitanteNombre = new ArrayList();//Puntero a nombre del militante
        ArrayList<String>MilitanteApellidos= new ArrayList();//Puntero al apellido del militante
        
        String E="";
        String E2="";
        String E3="";
        String E4="";
        System.out.println("Tabla de electos para la eleccion '"+this.nombre+"':");
        //E = "Tabla de electos para la eleccion '"+this.nombre+"': \n";
        for (EleccionCirc ecir : this.eleccircuns) {
            //System.out.println("En la circunscripción "+ecir.getNombre()+": ");
            E2 = "En la circunscripción "+ecir.getNombre()+": \n";
            Circuns.add(ecir.getNombre());
            for (Lista lst : ecir.getListaElectos()) {
                for (int i=0; i<lst.getElementos().size();) {
                    Militante mil= new Militante();
                    mil= lst.getElementos().get(i);
                    if(i==0){
                       // System.out.println("Partido: "+lst.getFP().getSiglas()+": " +mil.getNombre()+" "+mil.getApellidos());
                        E3 = "Partido: "+lst.getFP().getSiglas()+": " +mil.getNombre()+" "+mil.getApellidos()+"\n";
                        Partido.add(lst.getFP().getSiglas());
                        MilitanteNombre.add(mil.getNombre());
                        MilitanteApellidos.add(mil.getApellidos());
                    }
                    i=lst.getElementos().indexOf(mil);
                    if(i<lst.getElementos().size()&&i!=0){
                        //System.out.println("Partido: "+lst.getFP().getSiglas()+": " +lst.getElementos().get(i).getNombre()+" "+lst.getElementos().get(i).getApellidos());
                        E4 = "Partido: "+lst.getFP().getSiglas()+": " +lst.getElementos().get(i).getNombre()+" "+lst.getElementos().get(i).getApellidos()+"\n";
                        Partido.add(lst.getFP().getSiglas());
                        MilitanteNombre.add(mil.getNombre());
                        MilitanteApellidos.add(mil.getApellidos());
                    }
                    i++;
                    i++;
                }
            }
        }
        aux.add(MilitanteNombre);
        aux.add(MilitanteApellidos);
        aux.add(Partido);
        aux.add(Circuns);
        return aux;
    }
            
    // Imprime mayorías, solo mirando los 4 primeros partidos más votados
    public void ImprimirMayorias() {

        System.out.println("Posibles mayorias: ");
        int min = (this.escanos/2)+1;
        // Tomamos solo los 4 primeros partidos.
        // Ordenamos quedandonos con los 4 de más escaños.
        TablaEscanos tesc = new TablaEscanos();
        for (ItemTablaEscanos ite : this.resultado_total_escanos.getItems()) {
            if (tesc.getSize() < 4) {
                tesc.addItem(ite);
            }
            else {
                for(ItemTablaEscanos ite2 : tesc.getItems()) {
                    if (ite.getEscanos() > ite2.getEscanos()) {
                        int index = tesc.getItems().indexOf(ite2);
                        tesc.getItems().set(index, ite);
                        break;
                    }
                }
            }
        }
        int i, j, k, l;
        // Miramos las combinaciones que dan mayoría absoluta.
        // Para un único partido
        for (i = 0; i < tesc.getSize(); i++) {
            ItemTablaEscanos ite = tesc.getItems().get(i);
            if (ite.getEscanos() >= min) {
                System.out.println("Partido " + ite.getSiglas() + " en solitario");
                System.out.println("\tObtiene mayoría con "+ite.getEscanos()+" escaños.");
                
            }
            // Para dos partidos
            for (j = i+1; j < tesc.getSize(); j++) {
                ItemTablaEscanos ite2 = tesc.getItems().get(j);
                if (ite.getEscanos() + ite2.getEscanos() >= min) {
                    if(ite.getEscanos()==0||ite2.getEscanos()==0){
                        break;
                    }
                    System.out.println("Union de "+ite.getSiglas()+" y "+ite2.getSiglas());
                    System.out.println("\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos())+" escaños.");
                }
                // Para tres partidos
                for (k = j+1; k < tesc.getSize(); k++) {
                    ItemTablaEscanos ite3 = tesc.getItems().get(k);
                    if (ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos() >= min) {
                        if(ite.getEscanos()==0||ite2.getEscanos()==0||ite3.getEscanos()==0){
                        break;
                    }
                        System.out.println("Union de "+ite.getSiglas()+", "+ite2.getSiglas()+" y "+ite3.getSiglas());
                        System.out.println("\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos())+" escaños.");
                    }
                    // Para cuatro partidos
                    for (l = k+1; l < tesc.getSize(); l++) {
                        ItemTablaEscanos ite4 = tesc.getItems().get(l);
                        if (ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos()+ite4.getEscanos() >= min) {
                            if(ite.getEscanos()==0||ite2.getEscanos()==0||ite3.getEscanos()==0||ite4.getEscanos()==0){
                            break;
                            }
                            System.out.println("Union de "+ite.getSiglas()+", "+ite2.getSiglas()+", "+ite3.getSiglas()+" y "+ite4.getSiglas());
                            System.out.println("\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos()+ite4.getEscanos())+" escaños.");
                        }
                    }
                }
            }
        }
    }
    
    public ArrayList<String> ImprimirMayoriasI() {
        ArrayList<String>aux= new ArrayList();
        String s="";
        String ss="";
        String sss="";
        String ssss="";
        //System.out.println("Posibles mayorias: ");
        int min = (this.escanos/2)+1;
        // Tomamos solo los 4 primeros partidos.
        // Ordenamos quedandonos con los 4 de más escaños.
        TablaEscanos tesc = new TablaEscanos();
        for (ItemTablaEscanos ite : this.resultado_total_escanos.getItems()) {
            if (tesc.getSize() < 4) {
                tesc.addItem(ite);
            }
            else {
                for(ItemTablaEscanos ite2 : tesc.getItems()) {
                    if (ite.getEscanos() > ite2.getEscanos()) {
                        int index = tesc.getItems().indexOf(ite2);
                        tesc.getItems().set(index, ite);
                        break;
                    }
                }
            }
        }
        int i, j, k, l;
        // Miramos las combinaciones que dan mayoría absoluta.
        // Para un único partido
        for (i = 0; i < tesc.getSize(); i++) {
            ItemTablaEscanos ite = tesc.getItems().get(i);
            if (ite.getEscanos() >= min) {
                //System.out.println("Partido " + ite.getSiglas() + " en solitario");
                //System.out.println("\tObtiene mayoría con "+ite.getEscanos()+" escaños.");
               s ="Partido " + ite.getSiglas() + " en solitario"+" \n"+"\tObtiene mayoría con "+ite.getEscanos()+" escaños.";
            }
            // Para dos partidos
            for (j = i+1; j < tesc.getSize(); j++) {
                ItemTablaEscanos ite2 = tesc.getItems().get(j);
                if (ite.getEscanos() + ite2.getEscanos() >= min) {
                    if(ite.getEscanos()==0||ite2.getEscanos()==0){
                        break;
                    }
                   // System.out.println("Union de "+ite.getSiglas()+" y "+ite2.getSiglas());
                    //System.out.println("\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos())+" escaños.");
                    ss="Union de "+ite.getSiglas()+" y "+ite2.getSiglas()+" \n"+"\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos())+" escaños.";
                }
                // Para tres partidos
                for (k = j+1; k < tesc.getSize(); k++) {
                    ItemTablaEscanos ite3 = tesc.getItems().get(k);
                    if (ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos() >= min) {
                        if(ite.getEscanos()==0||ite2.getEscanos()==0||ite3.getEscanos()==0){
                        break;
                    }
                        //System.out.println("Union de "+ite.getSiglas()+", "+ite2.getSiglas()+" y "+ite3.getSiglas());
                        //System.out.println("\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos())+" escaños.");
                        sss="Union de "+ite.getSiglas()+", "+ite2.getSiglas()+" y "+ite3.getSiglas()+"\n"+"\tObtienen mayoría con "
                                +(ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos())+" escaños.";
                    }
                    // Para cuatro partidos
                    for (l = k+1; l < tesc.getSize(); l++) {
                        ItemTablaEscanos ite4 = tesc.getItems().get(l);
                        if (ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos()+ite4.getEscanos() >= min) {
                            if(ite.getEscanos()==0||ite2.getEscanos()==0||ite3.getEscanos()==0||ite4.getEscanos()==0){
                        break;
                    }
                            //System.out.println("Union de "+ite.getSiglas()+", "+ite2.getSiglas()+", "+ite3.getSiglas()+" y "+ite4.getSiglas());
                            //System.out.println("\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos()+ite4.getEscanos())+" escaños.");
                        ssss="Union de "+ite.getSiglas()+", "+ite2.getSiglas()+", "+ite3.getSiglas()+" y "+ite4.getSiglas()+" \n"+
                                "\tObtienen mayoría con "+(ite.getEscanos()+ite2.getEscanos()+ite3.getEscanos()+ite4.getEscanos())+" escaños.";
                        }
                    }
                }
            }
        }
        aux.add(s);
        aux.add(ss);
        aux.add(sss);
        aux.add(ssss);
        return aux;
    }
}
