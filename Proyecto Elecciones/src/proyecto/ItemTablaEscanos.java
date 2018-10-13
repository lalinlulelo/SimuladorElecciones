package proyecto;

/**
 * @descripcion: Elemento de TablaEscanos. Almacena las siglas de un partido 
 * y también los escanos de ese partido. Hay handlers.
 */
public class ItemTablaEscanos {
    private String siglas;
    private int escanos;
    
    /* Constructor */
    public ItemTablaEscanos(){
    
    }
    public ItemTablaEscanos(String s) {
        this.siglas = s;
        this.escanos = 0;
    }
    
    public ItemTablaEscanos(String s, int e) {
        this.siglas = s;
        this.escanos = e;
    }
    
    /* Handlers */
    public String getSiglas() {
        return this.siglas;
    }
    
    public int getEscanos() {
        return this.escanos;
    }
    
    public void setSiglas(String s) {
        this.siglas = s;
        return;
    }
      
    public void setEscanos(int e) {
        this.escanos = e;
        return;
    }
}