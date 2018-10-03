/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Conexion.Conex;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;


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
        try{
            
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            tablaDemandaOC.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT Producto_idProducto,Cantidad from demanda where Mes = 'Enero' " ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("ID Producto");
            modeloTabla.addColumn("Enero");
            
            
            while (rs.next()){
                
                Object[] filas = new Object[CantidadColumnas];
                
                for( int i=0; i <CantidadColumnas; i++){
                    
                    filas[i] = rs.getObject(i+1);  
                }
                
                modeloTabla.addRow(filas);
                
                
                System.out.println(filas);
                
            }
                    }
        
        
        catch(SQLException ex){
            
            System.err.println(ex.toString());
            
        }
        
        try{
            
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            tablaPTOC.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT Nombre,Cantidad_disponible,Cantidad_minima Nombre from producto " ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Cantidad disponible");
            modeloTabla.addColumn("Cantidad minima ");
            
            
            
            while (rs.next()){
                
                Object[] filas = new Object[CantidadColumnas];
                
                for( int i=0; i <CantidadColumnas; i++){
                    
                    filas[i] = rs.getObject(i+1);  
                }
                
                modeloTabla.addRow(filas);
                
                
                System.out.println(filas);
                
            }
                    }
        
        
        catch(SQLException ex){
            
            System.err.println(ex.toString());
            
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProduccion = new javax.swing.JTable();

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
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

        tablaProduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"7:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"8:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"9:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"10:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"11:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"12:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"13:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"14:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"15:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"16:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"17:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"18:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"19:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"20:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"21:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"22:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"23:00", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", null}
            },
            new String [] {
                "Hora", "Agua Tratada", "Elaboracion Jarabe #1", "Elaboracion Jarabe #2", "Elaboracion Jarabe #3", "Mezclado #1", "Mezclado #2", "Mezclado #3", "Carbonatar #1", "Carbonatar #2", "Embotellado #1", "Embotellado #2", "Embotellado #3", "Etiquetado #1", "Etiquetado #2", "Etiquetado #3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProduccion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addGap(148, 148, 148))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(generarOC))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(generarOC)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jButton22)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            producto = tablaPTOC.getValueAt(i, 0).toString();
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
      

        Maquinaria ma = new Maquinaria();
        PlanProduccion pp = new PlanProduccion();
        
        int numeroCe = tablaProduccion.getRowCount();
        for(int a=0; a<numeroCe; a++){
            tablaProduccion.setValueAt("Todos los productos",a, 1);
        }

        for (int j = 2; j <= 4; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("15:00")) {
                        System.out.println("Cambio de columna");
                        break;
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k, j);
                        }
                    }
                }
            }
        }
        
        for (int j = 5; j <= 7; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(1, 1).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("18:00")) {
                        System.out.println("Cambio de columna");
                        break;
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+2, j);
                        }
                    }
                }
            }
        }
        for (int j = 8; j <= 9; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(2, 1).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1 && (nombre.equals("Coca cola") || nombre.equals("Sprite" ) 
                            || nombre.equals("Fanta" ) || nombre.equals("Quatro" ) || nombre.equals("Coca cola zero" ))) {
                        
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("18:00")) {
                        System.out.println("Cambio de columna");
                        break;
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+5, j);
                        }
                    }
                }
            }
        }
        for (int j = 10; j <= 12; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(3, 1).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = pp.tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("21:00")) {
                        System.out.println("Cambio de columna");
                        break;
                    } else if (nombre.equals("Agua")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+2, j);
                        }
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+5, j);
                        }
                    }
                }
            }
        }
        for (int j = 10; j <= 12; j++) {
            for (int i = 0; i < tablaOC.getRowCount(); i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(4, 1).toString());
                int tiempo = producto / capacidadMaMe;
                int numeroCel = tablaProduccion.getRowCount();

                for (int k = 0; k < numeroCel; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(k, j).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + vc, j);
                        }
                    } else if (nombreTP.equals("23:00")) {
                        System.out.println("Cambio de columna");
                        break;
                    } else if (nombre.equals("Agua")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+5, j);
                        }
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+9, j);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JTable tablaDemandaOC;
    private javax.swing.JTable tablaOC;
    private javax.swing.JTable tablaPTOC;
    public javax.swing.JTable tablaProduccion;
    // End of variables declaration//GEN-END:variables
}
