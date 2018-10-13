package proyecto;
import java.util.ArrayList;

/**
 * @descripcion: Lista de Militantes de una Formación Política.
 * Se ha añadido una referencia a partido politico, por simplicidad.
 * Tiene handlers.
 * @author 
 */
public class Lista extends ArrayList<Votante>{
    private String descripcion;
    private FormacionPolitica fpol;
    private ArrayList<Militante> elementos;
    private ArrayList<Simpatizante> elementos2;
    
    /* Constructor */
    public Lista(){
    
    
    }
    public Lista(String n, FormacionPolitica fpol) {
        this.descripcion = n;
        this.fpol = fpol;
        this.elementos = new ArrayList();
    }
   
    /* Handlers */
    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    
    public void setFP(FormacionPolitica fp) {
        this.fpol = fp;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public FormacionPolitica getFP() {
        return this.fpol;
    }
    
    public void AddElemento(Militante m) {
        this.elementos.add(m);
        return;
    }
    
    public ArrayList<Militante> getElementos() {
        return this.elementos;
    }
    
    public void AddElemento2(Simpatizante s) {
        this.elementos2.add(s);
        return;
    }
    
    public ArrayList<Simpatizante> getElementos2() {
        return this.elementos2;
    }
}
