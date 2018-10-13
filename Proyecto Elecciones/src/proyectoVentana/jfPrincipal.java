/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoVentana;

/**
 *
 * @author ZHONG HAO LIN CHEN, ADRIAN DAVID MORILLAS MARCO, CLARA EUGENIA PALOMARES CALVO
 */
public class jfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
        initComponents();
        
        //Centrar la ventana
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCrearPartidos = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonSimularNuevo = new javax.swing.JButton();
        jButtonCircuns = new javax.swing.JButton();
        jButtonCrearCoaliciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jButtonCrearPartidos.setText("Crear Partidos Politicos");
        jButtonCrearPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearPartidosActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setText("Proyecto elecciones");

        jButtonSimularNuevo.setText("Simular elecciones");
        jButtonSimularNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimularNuevoActionPerformed(evt);
            }
        });

        jButtonCircuns.setText("Crear Circunscripciones");
        jButtonCircuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCircunsActionPerformed(evt);
            }
        });

        jButtonCrearCoaliciones.setText("Crear Coaliciones");
        jButtonCrearCoaliciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCoalicionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButtonSimularNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCircuns, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(jButtonCrearCoaliciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCrearPartidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonCrearPartidos)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearCoaliciones)
                    .addComponent(jButtonSimularNuevo))
                .addGap(32, 32, 32)
                .addComponent(jButtonCircuns)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearPartidosActionPerformed
        //Boton en el que creo una ventana nueva para crear partidos 
        jfPartidoPolitico objPartido = new jfPartidoPolitico();
        objPartido.setVisible(true);
    }//GEN-LAST:event_jButtonCrearPartidosActionPerformed

    private void jButtonSimularNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimularNuevoActionPerformed
        jfEleccion objEleccion = new jfEleccion();
        objEleccion.setVisible(true);
    }//GEN-LAST:event_jButtonSimularNuevoActionPerformed

    private void jButtonCircunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCircunsActionPerformed
        jfCircunscripcion objCircuns = new jfCircunscripcion();
        objCircuns.setVisible(true);
    }//GEN-LAST:event_jButtonCircunsActionPerformed

    private void jButtonCrearCoalicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCoalicionesActionPerformed
        jfCoalicion objCoali = new jfCoalicion();
        objCoali.setVisible(true);
    }//GEN-LAST:event_jButtonCrearCoalicionesActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCircuns;
    private javax.swing.JButton jButtonCrearCoaliciones;
    private javax.swing.JButton jButtonCrearPartidos;
    private javax.swing.JButton jButtonSimularNuevo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}