/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author ZHONG HAO LIN CHEN
 */
public class ListaPart extends ArrayList<PartidoPolitico>{
    private String descripcion;
    private ArrayList<PartidoPolitico> lista = new ArrayList();
    
    public ListaPart(String d){
        this.descripcion = d;
    }

    public ListaPart() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void addPartido(PartidoPolitico pp){
        lista.add(pp);
    }
}
