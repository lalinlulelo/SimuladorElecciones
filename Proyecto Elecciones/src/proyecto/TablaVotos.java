package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: TablaVotos, clase que acumula elementos ItemTablaVotos.
 * Cada fila de esta tabla es un ItemTablaVotos. Se han creado handlers.
 */
public class TablaVotos {
    private ArrayList<ItemTablaVotos> items;
    
    /* Constructor */
    public TablaVotos() {
        items = new ArrayList();
    }
    
    /* Handlers */
    public void addItem(ItemTablaVotos it) {
        this.items.add(it);
        return;
    }
    
    public void addItem(String sig, int votos) {
        ItemTablaVotos aux = new ItemTablaVotos(sig, votos);
        this.addItem(aux);
        return;
    }
    
    public ArrayList<ItemTablaVotos> getItems() {
        return this.items;
    }
    
    /* Devuelve la cantidad de entradas en la tabla de votos */
    public int getSize() {
        return this.items.size();
    }

}
