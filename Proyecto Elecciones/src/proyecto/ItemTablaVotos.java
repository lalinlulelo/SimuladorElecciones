package proyecto;

/**
 * @descripcion: Elemento de TablaVotos. Almacena las siglas de un partido 
 * y también los votos de ese partido. Hay handlers.
 */
public class ItemTablaVotos {
    private String siglas;
    private int votos;
    
    /* Constructores */
    public ItemTablaVotos(){
    
    
    }
    public ItemTablaVotos(String s) { 
        this.siglas = s;
        this.votos = 0;
    }
    
    public ItemTablaVotos(String s, int v) {
        this.siglas = s;
        this.votos = v;
    }
    
    /* Handlers */
    public String getSiglas() {
        return this.siglas;
    }
    
    public int getVotos() {
        return this.votos;
    }
    
    public void setSiglas(String s) {
        this.siglas = s;
        return;
    }
    
    public void setVotos(int v) {
        this.votos = v;
        return;
    }
}