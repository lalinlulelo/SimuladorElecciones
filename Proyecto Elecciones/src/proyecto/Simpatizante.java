package proyecto;

/**
 * @descripcion: Simpatizante, clase que hereda de Votante.
 * Sobreescribe EnviarEncuesta para Simpatizante.
 */
public class Simpatizante extends Votante {
    
    /* Constructor */
    public Simpatizante(){
    
    }
    public Simpatizante(String n, String a, int e, String p, char g, String s) {
        this.setNombre(n);
        this.setApellidos(a);
        this.setEdad(e);
        this.setProfesion(p);
        this.setGenero(g);
        this.setSiglas(s);
    }
    
    @Override
    public void EnviarEncuesta() {
        /* Enviamos la encuesta 1 */
        System.out.println(this.getEncuestas()[1]);
        return;
    }
}
