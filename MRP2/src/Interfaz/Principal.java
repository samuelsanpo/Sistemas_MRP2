/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import javax.swing.JDialog;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        
      OCompraBoton.setBackground(new java.awt.Color(0,0,0));
      OCompraBoton.setForeground(Color.white);
      IMPBoton.setBackground(new java.awt.Color(0,0,0));
      IMPBoton.setForeground(Color.white);
      IPTBoton.setBackground(new java.awt.Color(0,0,0));
      IPTBoton.setForeground(Color.white);
      MaquinariaBoton.setBackground(new java.awt.Color(0,0,0));
      MaquinariaBoton.setForeground(Color.white);
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        MaquinariaBoton = new javax.swing.JButton();
        IMPBoton = new javax.swing.JButton();
        OCompraBoton = new javax.swing.JButton();
        IPTBoton = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MaquinariaBoton.setText("Maquinaria");
        MaquinariaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaquinariaBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaquinariaBotonMouseEntered(evt);
            }
        });
        MaquinariaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaquinariaBotonActionPerformed(evt);
            }
        });

        IMPBoton.setText("Inventario MP");
        IMPBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IMPBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IMPBotonMouseEntered(evt);
            }
        });
        IMPBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPBotonActionPerformed(evt);
            }
        });

        OCompraBoton.setText("Orden de compra ");
        OCompraBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OCompraBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OCompraBotonMouseEntered(evt);
            }
        });
        OCompraBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCompraBotonActionPerformed(evt);
            }
        });

        IPTBoton.setText("Inventario PT");
        IPTBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IPTBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IPTBotonMouseEntered(evt);
            }
        });
        IPTBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPTBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(IMPBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(IPTBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MaquinariaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(OCompraBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(MaquinariaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMPBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IPTBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(142, Short.MAX_VALUE)
                    .addComponent(OCompraBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(131, 131, 131)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MaquinariaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaquinariaBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Historial");
    Maquinaria panel = new Maquinaria();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(850, 500);
    }//GEN-LAST:event_MaquinariaBotonActionPerformed

    private void OCompraBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCompraBotonMouseEntered
      OCompraBoton.setBackground(new java.awt.Color(244,0,0));
      OCompraBoton.setForeground(Color.black);
    }//GEN-LAST:event_OCompraBotonMouseEntered

    private void OCompraBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCompraBotonMouseExited
      OCompraBoton.setBackground(new java.awt.Color(0,0,0));
      OCompraBoton.setForeground(Color.white);
    }//GEN-LAST:event_OCompraBotonMouseExited

    private void MaquinariaBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaquinariaBotonMouseEntered
      MaquinariaBoton.setBackground(new java.awt.Color(244,0,0));
      MaquinariaBoton.setForeground(Color.black);
    }//GEN-LAST:event_MaquinariaBotonMouseEntered

    private void MaquinariaBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaquinariaBotonMouseExited
      MaquinariaBoton.setBackground(new java.awt.Color(0,0,0));
      MaquinariaBoton.setForeground(Color.white);
    }//GEN-LAST:event_MaquinariaBotonMouseExited

    private void IMPBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMPBotonMouseEntered
      IMPBoton.setBackground(new java.awt.Color(244,0,0));
      IMPBoton.setForeground(Color.black);
    }//GEN-LAST:event_IMPBotonMouseEntered

    private void IMPBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMPBotonMouseExited
      IMPBoton.setBackground(new java.awt.Color(0,0,0));
      IMPBoton.setForeground(Color.white);
    }//GEN-LAST:event_IMPBotonMouseExited

    private void IPTBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IPTBotonMouseEntered
      IPTBoton.setBackground(new java.awt.Color(244,0,0));
      IPTBoton.setForeground(Color.black);
    }//GEN-LAST:event_IPTBotonMouseEntered

    private void IPTBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IPTBotonMouseExited
      IPTBoton.setBackground(new java.awt.Color(0,0,0));
      IPTBoton.setForeground(Color.white);
    }//GEN-LAST:event_IPTBotonMouseExited

    private void OCompraBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCompraBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Historial");
    OrdenCompra panel = new OrdenCompra();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(850, 500);
    }//GEN-LAST:event_OCompraBotonActionPerformed

    private void IMPBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Historial");
    InventarioMP panel = new InventarioMP();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(850, 500);
    }//GEN-LAST:event_IMPBotonActionPerformed

    private void IPTBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPTBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Historial");
    InventarioPT panel = new InventarioPT();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(850, 500);
    }//GEN-LAST:event_IPTBotonActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IMPBoton;
    private javax.swing.JButton IPTBoton;
    private javax.swing.JButton MaquinariaBoton;
    private javax.swing.JButton OCompraBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
