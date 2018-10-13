/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author ZHONG HAO LIN CHEN, ADRIAN DAVID MORILLAS MARCO, CLARA EUGENIA PALOMARES CALVO
 */
public class Circunscripcion {
    private String Nombre;
    private int Poblacion;
    private int Escannos;

    public Circunscripcion(String Nombre, int Poblacion, int Escannos) {
        this.Nombre = Nombre;
        this.Poblacion = Poblacion;
        this.Escannos = Escannos;
    }

    public Circunscripcion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public int getPoblacion (){
       return this.Poblacion;
    }

    public void setPoblacion (int poblacion){
        this.Poblacion = poblacion;
    }
     
    public int getEscannos (){
       return this.Escannos;
    }

    public void setEscannos (int escannos){
        this.Escannos = escannos;
    }
}
