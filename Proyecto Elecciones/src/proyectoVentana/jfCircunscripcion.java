/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoVentana;

import proyecto.Circunscripcion;
import proyecto.EleccionCirc;
import proyecto.PartidoPolitico;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZHONG HAO LIN CHEN, ADRIAN DAVID MORILLAS MARCO, CLARA EUGENIA PALOMARES CALVO
 */
public class jfCircunscripcion extends javax.swing.JFrame {

    ArrayList<Circunscripcion> listCirc;
    ArrayList<EleccionCirc> listaCircElecc;
    Vector datos = new Vector();
    DefaultTableModel tmodelCirc = new DefaultTableModel();
    
    /**
     * Creates new form jfCircunscripcion
     */
    public jfCircunscripcion() {
        initComponents();
        
        //Centrar la ventana
        this.setLocationRelativeTo(null);
        
        listCirc = new ArrayList<Circunscripcion>(); //Creamos una nueva lista de circunscripciones
        this.listaCircElecc= new ArrayList<EleccionCirc>();
        tmodelCirc.addColumn("Nombre");
        tmodelCirc.addColumn("Poblacion");
        tmodelCirc.addColumn("Esannos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelPoblacion = new javax.swing.JLabel();
        jLabelEscannos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPoblacion = new javax.swing.JTextField();
        jTextFieldEscannos = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCirc = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();
        jButtonGuardarCirc = new javax.swing.JButton();
        jButtonCargarCirc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomFichero = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabelNombre.setText("Nombre");

        jLabelPoblacion.setText("Poblacion");

        jLabelEscannos.setText("Escaños");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Circunscripciones");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTableCirc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Poblacion", "Escaños"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCirc);

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonGuardarCirc.setText("Guardar lista de circunscrpciones");
        jButtonGuardarCirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCircActionPerformed(evt);
            }
        });

        jButtonCargarCirc.setText("Cargar lista de Circunscrpciones");
        jButtonCargarCirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarCircActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del fichero a guardar o cargar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCargarCirc, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(jButtonGuardarCirc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelPoblacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEscannos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPoblacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jTextFieldEscannos))))
                        .addGap(245, 245, 245))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNomFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(242, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoblacion)
                    .addComponent(jTextFieldPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEscannos)
                    .addComponent(jTextFieldEscannos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButtonAgregar)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGuardarCirc)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCargarCirc)
                            .addComponent(jTextFieldNomFichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        Circunscripcion circ = new Circunscripcion();
        EleccionCirc circ2= new EleccionCirc();    
             //Le asignamos el nombre, siglas y logo del texto que hemos rellenado en la interfaz
             circ.setNombre(jTextFieldNombre.getText()); 
             circ.setPoblacion(Integer.parseInt(jTextFieldPoblacion.getText()));
             circ.setEscannos(Integer.parseInt(jTextFieldEscannos.getText()));
             circ2.setNombre(jTextFieldNombre.getText());
             circ2.setPoblacion(Integer.parseInt(jTextFieldPoblacion.getText()));
             circ2.setEscanos(Integer.parseInt(jTextFieldEscannos.getText()));
             listCirc.add(circ);
             this.listaCircElecc.add(circ2);
             
             //A la hora de rellenar la tabla tambien le añadiremos lo que hemos escrito en la barra de texto
             Vector datos = new Vector();
             datos.addElement(jTextFieldNombre.getText());
             datos.addElement(Integer.parseInt(jTextFieldPoblacion.getText()));
             datos.addElement(Integer.parseInt(jTextFieldEscannos.getText()));
             
             tmodelCirc.addRow(datos);
             
             jTableCirc.setModel(tmodelCirc);
             
            //Imprimir por consola Circunscripcion añadida
            System.out.print(" Nombre:"+jTextFieldNombre.getText());
            System.out.print(" Poblacion:"+jTextFieldPoblacion.getText());
            System.out.println(" Escaños:"+jTextFieldEscannos.getText()); 
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonGuardarCircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCircActionPerformed
        this.Guardar();// TODO add your handling code here:
        this.Guardar2();
    }//GEN-LAST:event_jButtonGuardarCircActionPerformed

    private void jButtonCargarCircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarCircActionPerformed
        this.LeerArchivoLista();
    }//GEN-LAST:event_jButtonCargarCircActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfCircunscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCircunscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCircunscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCircunscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCircunscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCargarCirc;
    private javax.swing.JButton jButtonGuardarCirc;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEscannos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPoblacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCirc;
    private javax.swing.JTextField jTextFieldEscannos;
    private javax.swing.JTextField jTextFieldNomFichero;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPoblacion;
    // End of variables declaration//GEN-END:variables

    private void Guardar() { 
        try {                       
            //ArrayList<Circunscripcion> listCircun = new ArrayList();  
            String nomArch = jTextFieldNomFichero.getText();
            //FileOutputStream fs = new FileOutputStream(nomArch);//Creamos el archivo
            //ObjectOutputStream os = new ObjectOutputStream(fs);
            
            //Aqui asignamos donde queremos guardar el fichero txt
            BufferedWriter out = new BufferedWriter(new FileWriter(nomArch));
            
            //Este bucle for recorre toda la lista y escribe los campos
            for(Circunscripcion circ:this.listCirc){               
                //Nombre
                out.write(circ.getNombre() + ";");
                //os.writeObject(mili.getNombre()+";");
                 
                //Poblacion
                out.write(circ.getPoblacion() + ";");
                //os.writeObject(mili.getPoblacion() + ";");
                
                //Escaños
                out.write(circ.getEscannos() + ";");
                //os.writeObject(mili.getEscannos() + ";");
                
                //Salto de linea
                out.write(System.getProperty("line.separator"));
                //os.writeObject(System.getProperty("line.separator"));               
            }           
            //out.close();
            out.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {}
    }  
    
    private void LeerArchivoLista() {
        try 
        {
            String nomArch = jTextFieldNomFichero.getText();
            FileInputStream fis = new FileInputStream(nomArch); 
            BufferedInputStream bis = new BufferedInputStream(fis); 
            DataInputStream dis = null; 
            
            dis = new DataInputStream(bis);
            
            String linea = "";
            String strNombre = "";
            String strPoblacion = "";
            String strEscannos = "";         
            
            Circunscripcion circ;
            
            
            //Bucle para recorrer por linea del txt de la lista de circunscripciones
            while ((linea = dis.readLine()) != null ) 
            {                 
                strNombre = linea.substring(0, linea.indexOf(";"));
                linea = linea.substring(linea.indexOf(";")+ 1, linea.length());
                strPoblacion = linea.substring(0, linea.indexOf(";"));              
                linea = linea.substring(linea.indexOf(";")+ 1, linea.length());
                strEscannos = linea.substring(0, linea.indexOf(";"));
                linea = linea.substring(linea.indexOf(";")+ 1, linea.length());
                
                
                //Llenando la lista de las circunscripciones
                circ = new Circunscripcion();
             
                circ.setNombre(strNombre);
                circ.setPoblacion(Integer.valueOf(strPoblacion));
                circ.setEscannos(Integer.valueOf(strEscannos));             
                
                listCirc.add(circ);
                datos = new Vector();
                datos.addElement(strNombre);
                datos.addElement(Integer.valueOf(strPoblacion));
                datos.addElement(Integer.valueOf(strEscannos));

                tmodelCirc.addRow(datos);
                jTableCirc.setModel(tmodelCirc);
                
                //Escribirlo en consola
                System.out.print(" Nombre:"+strNombre);
                System.out.print(" Poblacion:"+strPoblacion); 
                System.out.print(" Escannos:"+Integer.valueOf(strEscannos));
            } 
            
            //Contador de circunscripciones
            System.out.println("Cantidad Circunscripciones: " + listCirc.size());
                       
        }
        catch(IOException e)
        {
            System.out.println("Error en la lectura del archivo");
        }
       
    }

    private void Guardar2() {
            try {                       
            //ArrayList<Circunscripcion> listCircun = new ArrayList();  
            String nomArch = jTextFieldNomFichero.getText()+" Elecciones";
            //FileOutputStream fs = new FileOutputStream(nomArch);//Creamos el archivo
            //ObjectOutputStream os = new ObjectOutputStream(fs);
            
            //Aqui asignamos donde queremos guardar el fichero txt
            BufferedWriter out = new BufferedWriter(new FileWriter(nomArch));
            
            //Este bucle for recorre toda la lista y escribe los campos
            for(EleccionCirc circ:this.listaCircElecc){               
                //Nombre
                out.write(circ.getNombre() + ";");
                //os.writeObject(mili.getNombre()+";");
                 
                //Poblacion
                out.write(circ.getPoblacion() + ";");
                //os.writeObject(mili.getPoblacion() + ";");
                
                //Escaños
                out.write(circ.getEscanos() + ";");
                //os.writeObject(mili.getEscannos() + ";");
                
                //Salto de linea
                out.write(System.getProperty("line.separator"));
                //os.writeObject(System.getProperty("line.separator"));               
            }           
            //out.close();
            out.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {}
    }
}