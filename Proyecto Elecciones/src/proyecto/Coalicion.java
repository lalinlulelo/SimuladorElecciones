package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: Coalicion, clase que hereda de FormacionPolitica.
 * Almacena nombres, siglas, logo y partidos en coalición. 
 * Tiene los handlers de cada atributo privado.
 */
public class Coalicion extends FormacionPolitica {
    
    private ArrayList<PartidoPolitico> form;
    private ArrayList<PartidoPolitico> lista = new ArrayList(); 
    private ArrayList<ListaPart> lista2 = new ArrayList();
    
    /* Constructor */
    
    public Coalicion(){
        this.form = new ArrayList();
        this.setReadyListas();
    }
    
    /* Handlers */
    public void addPartidos(PartidoPolitico par) {
        this.form.add(par);
    }
    
    public void addPartido(PartidoPolitico pp){
        lista.add(pp);
    }
    
    public ArrayList<PartidoPolitico> getPartidos() {
        return this.form;
    }
    
    /* Otros métodos */
    @Override
    /* Crear listas para cada circunscripcion en eleccion */
    public void ElaborarListas(Eleccion elec) {
        int i; // Contador de escanos asignados en cada circunscripcion.
        int j; // Contador para saber si pasamos por todos los partidos.
        int k; // Contador de próximo partido a mirar para meter militante en lista.
        int n_part = this.form.size(); // Cantidad de partidos.
        // Array donde están asignados partidos con cantidad de militantes disponibles.
        int candidatos_quedan[] = new int[n_part];
        ArrayList<EleccionCirc> elcir = elec.getCircuns();
        
        // Rellenamos la cantidad de militantes disponibles.
        for (i = 0; i < n_part; i++)
            candidatos_quedan[i] = this.form.get(i).getMilitantes().size();
        
        // Recorremos cada circunscripcion, creando una lista conjunta para ella
        for (EleccionCirc ec : elec.getCircuns()) {
            // Creamos una lista para rellenar
            Lista l = new Lista("ECcoa "+this.getSiglas()+ec.getNombre(), this);
            i = 0; // Cantidad de huecos en la lista a rellenar.
            k = 0; // Partido político del que intentar obtener un militante.
                   // Debe hacerse cíclico para no salirse del conjunto de partidos.
            while (i < ec.getEscanos()) {
                // Buscamos el primer partido politico con algún militante disponible.
                for (j = 0; j < n_part; j++, k++) {
                    if (candidatos_quedan[k%n_part] != 0) {
                        // Si algún partido tiene disponibles,
                        // lo tomamos y bajamos los candidatos disponibles.
                        Militante m = this.form.get(k%n_part).getMilitantes().get(candidatos_quedan[k%n_part]-1);
                        candidatos_quedan[k%n_part] -= 1;
                        l.AddElemento(m);
                        i++;
                        k++;
                        break;
                    }
                }
                // Si no hay partidos politicos con candidatos, no se siguen haciendo listas.
                if (j == n_part) {
                    break;
                }
            }
            // Añadimos la lista creada a las del partido y a la EleccionCirc.
            this.getListas().add(l);
            ec.addListaCand(l);
        
            
        }
    }
}
