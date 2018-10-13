package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: Histórico de todas las elecciones, permite sacar datos
 *                 de un cierto partido político.
 */
public class Historico {
    
    private ArrayList<Eleccion> elecciones;
    
    /* Constructor */
    public Historico() {
        elecciones = new ArrayList();
    }
    
    /* Handlers */
    public void addEleccion(Eleccion elec) {
        this.elecciones.add(elec);
    }
    
    public ArrayList<Eleccion> getElecciones() {
        return this.elecciones;
    }
    
    /* Otros métodos */
    // Consulta resultados de un partido politico.
    // Devuelve para el partido recibido: Votos totales, escaños totales
    public void ConsultarResultados(PartidoPolitico par) {
        
        System.out.println("Resultados del partido politico "+par.getNombre()+" de siglas "+par.getSiglas());
        for (Eleccion e : elecciones) {
            TablaVotos tv = e.getTablaVotos();
            TablaEscanos te = e.getTablaEscanos();
            // Comprobar si el partido está en la tabla de votos.
            for(ItemTablaVotos itv : tv.getItems()) {
                if (par.getSiglas().compareTo(itv.getSiglas()) == 0) {
                    System.out.println("Elección "+e.getName()+". Votos: "+itv.getVotos());
                }
            }
            // Comprobar si el partido está en la tabla de escaños.
            for(ItemTablaEscanos ite : te.getItems()) {
                if (par.getSiglas().compareTo(ite.getSiglas()) == 0) {
                    System.out.println("Elección "+e.getName()+". Escanos: "+ite.getEscanos());
                }
            }
        }
     //TO DO: Guardar la elección y todos los resultados en fichero         
    }   
    
    public String ConsultarResultadosI(PartidoPolitico par) {
        String h = "";
        String h2 = "";
        String h3 = "";        
        System.out.println("Resultados del partido politico "+par.getNombre()+" de siglas "+par.getSiglas());
        h = "Resultados del partido politico "+par.getNombre()+" de siglas "+par.getSiglas()+"\n";
        for (Eleccion e : elecciones) {
            TablaVotos tv = e.getTablaVotos();
            TablaEscanos te = e.getTablaEscanos();
            // Comprobar si el partido está en la tabla de votos.
            for(ItemTablaVotos itv : tv.getItems()) {
                if (par.getSiglas().compareTo(itv.getSiglas()) == 0) {
                    System.out.println("Elección "+e.getName()+". Votos: "+itv.getVotos());
                    h2 = "Elección "+e.getName()+". Votos: "+itv.getVotos() + "\n";
                }
            }
            // Comprobar si el partido está en la tabla de escaños.
            for(ItemTablaEscanos ite : te.getItems()) {
                if (par.getSiglas().compareTo(ite.getSiglas()) == 0) {
                    System.out.println("Elección "+e.getName()+". Escanos: "+ite.getEscanos());
                    h3 = "Elección "+e.getName()+". Escanos: "+ite.getEscanos() + "\n";
                }
            }
        }
        
        return h+h2+h3;
     //TO DO: Guardar la elección y todos los resultados en fichero         
    } 
}
