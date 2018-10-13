package proyecto;
/**
 * @descripcion Main de prueba.
 */
import java.util.ArrayList;
import proyectoVentana.jfPrincipal;
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ZONA DE PRUEBAS */
        /* Pruebas de Votante-Militante-Simpatizante
        Votante a, b;
        a = new Militante("Paquito", "Perez", 30, "Cerrajero", 'H',"Partido",60.5, "GPU");
        b = new Simpatizante("Marta", "Sanchez", 23, "Estudiante", 'M', "PArtido");
        
        System.out.println("Votante A:");
        System.out.println("Nombre: " + a.getNombre() + " " + a.getApellidos());
        System.out.println("Profesion: " + a.getProfesion() + ". Edad: " + a.getEdad());
        System.out.println("Ha votado a " + a.getSiglas());
        a.EnviarEncuesta();
        System.out.println("Votante B:");
        System.out.println("Nombre: " + b.getNombre() + " " + b.getApellidos());
        System.out.println("Profesion: " + b.getProfesion() + ". Edad: " + b.getEdad());
        System.out.println("Ha votado a " + b.getSiglas());
        b.EnviarEncuesta(); */
        
        /* Pruebas de TablaVotos, TablaEscanos y sus Items
        int i;
        TablaVotos tv = new TablaVotos();
        TablaEscanos te = new TablaEscanos();
        tv.addItem("PP", 100000);
        tv.addItem("PSOE", 20000);
        tv.addItem("Podemos", 18000);
        ArrayList<String> a = tv.getPartidos();
        for (i = 0; i < tv.getSize(); i++) {
            System.out.println("Partido: "+a.get(i)+"\t Votos: "+tv.getVotosPartido(a.get(i)));
        }
        System.out.println("Partido: Ciudadanos Votos; "+tv.getVotosPartido("Ciudadanos"));
        System.out.println("_-_-_-_-_-_-_-_-_");
        te.addItem("PP", 123);
        te.addItem("PSOE", 90);
        te.addItem("Podemos", 69);
        a = te.getPartidos();
        for (i = 0; i < tv.getSize(); i++) {
            System.out.println("Partido: "+a.get(i)+" Votos: "+te.getEscanosPartido(a.get(i)));
        }
        System.out.println("Partido: Ciudadanos Votos; "+te.getEscanosPartido("Ciudadanos")); */
        
        /* Pruebas de eleccion y creacion de listas */        
        
        
        //Eleccion e = new Eleccion("Eleccion de prueba", 35);
        /*
        System.out.println("Elección: "+e.getName()+" con "+e.getEscanos()+" escanos.");
        Militante m = new Militante("Protoito", "Perez", 50, "Banquero", 'H', "PP", 43, "Carnn.txt");
        PartidoPolitico pal = new PartidoPolitico("Partido Popular", "PP", "logo.png", m);
        PartidoPolitico pal2 = new PartidoPolitico("Part. Socialista", "PSOE", "logo.png", m);
        PartidoPolitico pal3 = new PartidoPolitico("Part. De ", "PD", "logo.png", m);
        PartidoPolitico pal4 = new PartidoPolitico("Part. Prueba", "PPO", "logo.png", m);
        e.addCircunscripcion("Peñalara del campo", 120000, 12);
        e.addCircunscripcion("Ciempozuelos", 200000, 23);
        pal.CargarListas();
        pal.ElaborarListas(e);
        pal2.CargarListas();
        pal2.ElaborarListas(e);
        pal3.CargarListas();
        pal3.ElaborarListas(e);
        pal4.CargarListas();
        pal4.ElaborarListas(e);
        e.rellenaTablas();
        e.ImprimirTablaGlobalEscanos();
        e.ImprimirTablaGlobalVotos();
        Historico h = new Historico();
        h.addEleccion(e);
        h.ConsultarResultados(pal);
        h.ConsultarResultados(pal2);
        h.ConsultarResultados(pal3);
        h.ConsultarResultados(pal4);
        e.ImprimirListasElectos();
        e.ImprimirMayorias();
        */
        
        //ZONA DE PRUEBA DEL SISTEMA D'HONDT
        /*
        e.addCircunscripcion("Talavera de la Reina", 500000, 35);
        TablaVotos tv = new TablaVotos();
        tv.addItem("Podemos", 300000);
        tv.addItem("PSOE", 200000);
        tv.addItem("PP", 125000);
        tv.addItem("C's", 50000);
        tv.addItem("CiU", 24000);
        tv.addItem("IU", 20000);
        tv.addItem("CoCa", 5000);
        TablaEscanos te = e.getCircuns().get(0).CalcularResultado(tv);
        e.getCircuns().get(0).ImprimirTablaEscanos();
        e.rellenaTablas();
        e.ImprimirTablaGlobalEscanos();
        e.ImprimirTablaGlobalVotos();
        

        */
        
        //Creamos la primera ventana principal y la hacemos visible
        jfPrincipal jfPrinc = new jfPrincipal();
        jfPrinc.setVisible(true);
    }
}
