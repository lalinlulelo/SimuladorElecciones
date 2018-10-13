package proyecto;

/**
 * @descripcion: Militante, clase que hereda de Votante.
 * Tiene cuota y carnet, además de los atributos. También tiene handlers.
 * Sobreescribe EnviarEncuesta para Militante.
 */
public class Militante extends Votante {
    /* Variables propias */
    private double cuota;
    private String carnet;
    private PartidoPolitico f= new PartidoPolitico();
    
    /* Constructor */
    public Militante(){
    
    
    }
    public Militante(String n, String a, int e, String p, char g, String s, double c, String ca) {
        this.setNombre(n);
        this.setApellidos(a);
        this.setEdad(e);
        this.setProfesion(p);
        this.setGenero(g);
        this.setSiglas(s);
        this.cuota = c;
        this.carnet = ca;
    }
    
    @Override
    void EnviarEncuesta() {
        /* Enviar encuesta 0 */
        System.out.println(this.getEncuestas()[0]);
        return;
    }

    /* Handlers */
    public void setCuota(double c){
        this.cuota = c;
    }
    
    public void setCarnet(String c) {
        this.carnet = c;
    }
    
    public double getCuota() {
        return this.cuota;
    }
    
    public String getCarnet() {
        return this.carnet;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String text) {
        this.tipo = text;
    }
}
