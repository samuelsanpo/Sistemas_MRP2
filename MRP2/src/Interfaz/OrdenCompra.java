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
import javax.swing.JPanel;
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

        generarOC.setText("Generar OP");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(generarOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(generarOC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
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

        
            for (int i = 0; i < 1; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /1500;
                int numeroCel = tablaProduccion.getRowCount();

                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(k, 2).toString();
                    if (celda.equals("") && k > 1) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + vc, 2);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k, 2);
                            tablaProduccion.setValueAt(nombre, k+2, 5);
                            tablaProduccion.setValueAt(nombre, k +4, 8);
                            tablaProduccion.setValueAt(nombre, k+6, 10);
                            tablaProduccion.setValueAt(nombre, k+8, 13);
                            break;
                        }
                        
                    }
                    
                }
            }
 
         
        
            
            for (int i = 1; i < 2; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /3000;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k+3, 2);
                            tablaProduccion.setValueAt(nombre, k+5, 5);
                            tablaProduccion.setValueAt(nombre, k +7, 8);
                            tablaProduccion.setValueAt(nombre, k+9, 10);
                            tablaProduccion.setValueAt(nombre, k+11, 13);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+3, 2);
                            tablaProduccion.setValueAt(nombre, k+5, 5);
                            tablaProduccion.setValueAt(nombre, k +7, 8);
                            tablaProduccion.setValueAt(nombre, k+9, 10);
                            tablaProduccion.setValueAt(nombre, k+11, 13);
                            break;
                        }
                        
                    }
                    
                
            }
                
            }
             for (int i = 2; i < 3; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /2000;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k+5, 2);
                            tablaProduccion.setValueAt(nombre, k+7, 5);
                            tablaProduccion.setValueAt("CocaZero", k +9, 8);
                            tablaProduccion.setValueAt(nombre, k+11, 10);
                            tablaProduccion.setValueAt(nombre, k+13, 13);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+5, 2);
                            tablaProduccion.setValueAt(nombre, k+7, 5);
                            tablaProduccion.setValueAt("CocaZero", k +9, 8);
                            tablaProduccion.setValueAt(nombre, k+11, 10);
                            tablaProduccion.setValueAt(nombre, k+13, 13);
                            break;
                        }
                        
                    }
                    
                
            }
                
            }
             for (int i = 3; i < 4; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /1500;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k, 3);
                            tablaProduccion.setValueAt(nombre, k+2, 6);
                            tablaProduccion.setValueAt("Sprite", k +4, 9);
                            tablaProduccion.setValueAt(nombre, k+6, 11);
                            tablaProduccion.setValueAt(nombre, k+8, 14);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k, 3);
                            tablaProduccion.setValueAt(nombre, k+2, 6);
                            tablaProduccion.setValueAt("Sprite", k +4, 9);
                            tablaProduccion.setValueAt(nombre, k+6, 11);
                            tablaProduccion.setValueAt(nombre, k+8, 14);
                            break;
                        }
                        
                    }
                    
                
            }
                
             }
             
             for (int i = 4; i < 5; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /3000;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k+3, 3);
                            tablaProduccion.setValueAt(nombre, k+5, 6);
                            tablaProduccion.setValueAt(nombre, k +7, 9);
                            tablaProduccion.setValueAt(nombre, k+9, 11);
                            tablaProduccion.setValueAt(nombre, k+11, 14);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + 3, 3);
                            tablaProduccion.setValueAt(nombre, k+5, 6);
                            tablaProduccion.setValueAt(nombre, k +7, 9);
                            tablaProduccion.setValueAt(nombre, k+9, 11);
                            tablaProduccion.setValueAt(nombre, k+11, 14);
                            break;
                        }
                        
                    }
                    
                
            }
                
            }
             for (int i = 5; i < 6; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /3000;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k+7, 3);
                            tablaProduccion.setValueAt(nombre, k+9, 6);
                            tablaProduccion.setValueAt(nombre, k +10, 9);
                            tablaProduccion.setValueAt(nombre, k+12, 11);
                            tablaProduccion.setValueAt(nombre, k+14, 14);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k + 7, 3);
                            tablaProduccion.setValueAt(nombre, k+9, 6);
                            tablaProduccion.setValueAt(nombre, k +10, 9);
                            tablaProduccion.setValueAt(nombre, k+12, 11);
                            tablaProduccion.setValueAt(nombre, k+14, 14);
                            break;
                        }
                        
                    }
                    
                
            }
                
            }
             for (int i = 6; i < 7; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /3000;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k, 4);
                            tablaProduccion.setValueAt(nombre, k +4, 7);
                            tablaProduccion.setValueAt(nombre, k+6, 12);
                            tablaProduccion.setValueAt(nombre, k+8, 15);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k , 4);
                            tablaProduccion.setValueAt(nombre, k +4, 7);
                            tablaProduccion.setValueAt(nombre, k+6, 12);
                            tablaProduccion.setValueAt(nombre, k+8, 15);
                            break;
                        }
                        
                    }
                    
                
            }
                
            }
             for (int i = 7; i < 8; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /1600;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k+2, 4);
                            tablaProduccion.setValueAt(nombre, k +6, 7);
                            tablaProduccion.setValueAt(nombre, k+8, 12);
                            tablaProduccion.setValueAt(nombre, k+10, 15);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+2 , 4);
                            tablaProduccion.setValueAt(nombre, k +6, 7);
                            tablaProduccion.setValueAt(nombre, k+8, 12);
                            tablaProduccion.setValueAt(nombre, k+10, 15);
                            break;
                        }
                        
                    }
                    
                
            }
                
            }
             for (int i = 8; i < 9; i++) {

                int producto = Integer.parseInt(tablaOC.getValueAt(i, 2).toString());
                String nombre = tablaOC.getValueAt(i, 0).toString();
                int capacidadMaMe = Integer.parseInt(ma.tablaMaquina.getValueAt(0, 1).toString());
                int tiempo = producto /4500;
                int numeroCel = tablaProduccion.getRowCount();

                
                for (int k = 0; k < tiempo; k++) {
                    String nombreTP = tablaProduccion.getValueAt(k, 0).toString();
                    String celda = tablaProduccion.getValueAt(0, 3).toString();
                    if (celda.equals("Cocacola")) {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            
                            tablaProduccion.setValueAt(nombre, k+5, 4);
                            tablaProduccion.setValueAt(nombre, k +9, 7);
                            tablaProduccion.setValueAt(nombre, k+11, 12);
                            tablaProduccion.setValueAt(nombre, k+13, 15);
                            break;
                        }
                        
                    } else {
                        for (int vc = 1; vc <= tiempo; vc++) {
                            tablaProduccion.setValueAt(nombre, k+5 , 4);
                            tablaProduccion.setValueAt(nombre, k +9, 7);
                            tablaProduccion.setValueAt(nombre, k+11, 12);
                            tablaProduccion.setValueAt(nombre, k+13, 15);
                            break;
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
    public javax.swing.JTable tablaOC;
    private javax.swing.JTable tablaPTOC;
    public javax.swing.JTable tablaProduccion;
    // End of variables declaration//GEN-END:variables
}
