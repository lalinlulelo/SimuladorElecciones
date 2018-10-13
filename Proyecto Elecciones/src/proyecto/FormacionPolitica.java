package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: FormacionPolitica, clase abstracta de la que heredan 
 * PartidoPolitico y Coalicion. Almacena nombres, siglas y logo. 
 * Tiene los handlers de cada atributo privado.
 */
public abstract class FormacionPolitica {
    private String nombre;
    private String siglas;
    private String logo;
    private ArrayList<Lista> listas;
    private ArrayList<ListaPart> listaPart = new ArrayList();
    
    abstract void ElaborarListas(Eleccion elec);
    
    /* Handlers */
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setSiglas(String s) {
        this.siglas = s;
    }
    
    public void setLogo(String l) {
        this.logo = l;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getSiglas() {
        return this.siglas;
    }
    
    public String getLogo() {
        return this.logo;
    }
    
    public void addLista(Lista l) {
        this.listas.add(l);
    }
    
    public ArrayList<Lista> getListas() {
        return this.listas;
    }
    
    /* Inicializa el ArrayList de Lista */
    public void setReadyListas() {
        this.listas = new ArrayList();
    }
    
    public void addPartido(ListaPart listPartPoli) {
        this.listaPart.add(listPartPoli);
    }
}
