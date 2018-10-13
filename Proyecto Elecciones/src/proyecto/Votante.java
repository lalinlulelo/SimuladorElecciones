package proyecto;

/**
 * @descripcion: Votante, clase abstracta de la que heredan 
 * Militante y Simpatizante. 
 * Almacena las siglas del partido al que vota, en vez del partido.
 * Tiene los handlers de cada atributo privado.
 */
public abstract class Votante {
    private String nombre;
    private String apellidos;
    private int edad;
    private String profesion;
    private char genero;
    private String siglas;
    /* Encuestas. Pueden rellenarse para cada tipo de Votante  */
    private String[] encuestas = {"Encuesta para Militantes", 
                                  "Encuesta para Simpatizantes"};
    private double cuota;
    private String carnet;
    
    String tipo;
    
    /* Método abstracto que hace que la clase sea abstracta    */
    /* Militante y Simpatizante necesitan rellenar este método */
    /* de maneras distintas.                                   */
    abstract void EnviarEncuesta();
    
    /* Handlers */
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setApellidos(String a) {
        this.apellidos = a;
    }
    
    public void setEdad(int e) {
        this.edad = e;
    }
    
    public void setProfesion(String p) {
        this.profesion = p;
    }
    
    public void setGenero(char g) {
        this.genero = g;
    }
    
    public void setSiglas(String s) {
        this.siglas = s;
    }
    
    public void setEncuestas (String[] e) {
        this.encuestas = e;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public String getProfesion() {
        return this.profesion;
    }
    
    public char getGenero() {
        return this.genero;
    }
    
    public String getSiglas() {
        return this.siglas;
    }
    
    public String[] getEncuestas() {
        return this.encuestas;
    }

    
    
    //Esto es para una parte de la interfaz
    public double getCuota() {
        return this.cuota;
    }

    public String getCarnet() {
        return this.carnet;
    }
    
    public void setCuota(double c){
        this.cuota = c;
    }
    
    public void setCarnet(String c) {
        this.carnet = c;
    }

    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String text) {
        this.tipo = text;
    }
}
