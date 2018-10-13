package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: TablaEscanos, clase que acumula elementos ItemTablaEscanos.
 * Cada fila de esta tabla es un ItemTablaEscanos. Se han creado handlers.
 */
public class TablaEscanos {
    private ArrayList<ItemTablaEscanos> items;
    
    /* Constructor */
    public TablaEscanos() {
        items = new ArrayList();
    }
    
    /* Handlers */
    public void addItem(ItemTablaEscanos it) {
        this.items.add(it);
        //return;
    }
    
    public void addItem(String sig, int votos) {
        ItemTablaEscanos aux = new ItemTablaEscanos(sig, votos);
        this.addItem(aux);
        //return;
    }
    
    public ArrayList<ItemTablaEscanos> getItems() {
        return this.items;
    }
    
    /* Devuelve la cantidad de entradas en la tabla de escanos */
    public int getSize() {
        return this.items.size();
    }
}
