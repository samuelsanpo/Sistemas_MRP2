/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JDialog;


/**
 *
 * @author Danielpulido10
 */
public class OrdenCompra extends javax.swing.JPanel {

    /**
     * Creates new form OrdenCompra
     */
    public OrdenCompra() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        SalirExplosion1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tablaPTOC = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        tablaDemandaOC = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        tablaOC = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        generarOC = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        SalirExplosion1.setText("Salir");
        SalirExplosion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirExplosion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(SalirExplosion1)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(SalirExplosion1)
                .addGap(23, 23, 23))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaPTOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Coca cola", "20"},
                {"Fanta", "14"},
                {"Sprite", "43"},
                {"Ades", null}
            },
            new String [] {
                "Producto", "Cantidad"
            }
        ));
        jScrollPane20.setViewportView(tablaPTOC);

        tablaDemandaOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Coca cola", "5"},
                {"Fanta", "10"},
                {"Sprite ", "11"},
                {"Ades", null}
            },
            new String [] {
                "Producto", "Cantidad"
            }
        ));
        jScrollPane22.setViewportView(tablaDemandaOC);

        tablaOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Productos", "Produccion ", "P. Diaria"
            }
        ));
        jScrollPane21.setViewportView(tablaOC);

        jButton22.setText("Generar Plan Produccion");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        generarOC.setText("Generar OC");
        generarOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarOCActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(generarOC)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(generarOC)
                        .addGap(89, 89, 89)))
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void SalirExplosion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirExplosion1ActionPerformed

    }//GEN-LAST:event_SalirExplosion1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generarOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarOCActionPerformed
        String producto;
        int cantidadD;
        int cantidadPT;
        int diario;
        String cantidadOC;
        String cantidadDiaria;
        
        for(int i=0; i<tablaDemandaOC.getRowCount(); i++){
            cantidadD = Integer.parseInt(tablaDemandaOC.getValueAt(i, 1).toString());
            producto = tablaDemandaOC.getValueAt(i, 0).toString();
            cantidadPT = Integer.parseInt(tablaPTOC.getValueAt(i, 1).toString());
            diario = cantidadD - cantidadPT;
            cantidadOC = String.valueOf(diario);
            cantidadDiaria = String.valueOf(diario/31);
            tablaOC.setValueAt(producto, i, 0);
            tablaOC.setValueAt(cantidadOC, i, 1);
            tablaOC.setValueAt(cantidadDiaria, i, 2);
            
        }
        
        
    }//GEN-LAST:event_generarOCActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        JDialog dialogo = new JDialog();
        PlanProduccion panel = new PlanProduccion();
        dialogo.add(panel);
        dialogo.setVisible(true);
        dialogo.setSize(850, 500);

        Maquinaria ma = new Maquinaria();
        PlanProduccion pp = new PlanProduccion();
        
        int numeroCe = pp.tablaProduccion.getRowCount();
        for(int a=0; a<numeroCe; a++){
            pp.tablaProduccion.setValueAt("Todos los productos",a, 1);
        }

        for (int j = 2; j <= 4; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(1, 1).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = pp.tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = pp.tablaProduccion.getValueAt(k, 0).toString();
                    String celda = pp.tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("15:00")) {
                        System.out.println("Cambio de columna");
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k, j);
                        }
                    }
                }
            }
        }
        
        for (int j = 5; j <= 7; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(1, 2).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = pp.tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = pp.tablaProduccion.getValueAt(k, 0).toString();
                    String celda = pp.tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("18:00")) {
                        System.out.println("Cambio de columna");
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k+2, j);
                        }
                    }
                }
            }
        }
        for (int j = 8; j <= 9; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(1, 3).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = pp.tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = pp.tablaProduccion.getValueAt(k, 0).toString();
                    String celda = pp.tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1 && (nombre.equals("Coca cola") || nombre.equals("Sprite" ) 
                            || nombre.equals("Fanta" ) || nombre.equals("Quatro" ) || nombre.equals("Coca cola zero" ))) {
                        
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("18:00")) {
                        System.out.println("Cambio de columna");
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k+5, j);
                        }
                    }
                }
            }
        }
        for (int j = 10; j <= 12; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(1, 4).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = pp.tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = pp.tablaProduccion.getValueAt(k, 0).toString();
                    String celda = pp.tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("21:00")) {
                        System.out.println("Cambio de columna");
                    } else if (nombre.equals("Agua")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k+2, j);
                        }
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k+7, j);
                        }
                    }
                }
            }
        }
        for (int j = 10; j <= 12; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(1, 5).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = pp.tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = pp.tablaProduccion.getValueAt(k, 0).toString();
                    String celda = pp.tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("23:00")) {
                        System.out.println("Cambio de columna");
                    } else if (nombre.equals("Agua")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k+5, j);
                        }
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            pp.tablaProduccion.setValueAt(nombre, k+9, j);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirExplosion1;
    private javax.swing.JButton generarOC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JTable tablaDemandaOC;
    private javax.swing.JTable tablaOC;
    private javax.swing.JTable tablaPTOC;
    // End of variables declaration//GEN-END:variables
}
