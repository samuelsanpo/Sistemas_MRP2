
package Interfaz;

import Conexion.Conex;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;


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
      Costos.setBackground(new java.awt.Color(0,0,0));
      Costos.setForeground(Color.white);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        costos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Materia = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablareales = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Personal = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Maquinaria = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        MaquinariaBoton = new javax.swing.JButton();
        IMPBoton = new javax.swing.JButton();
        OCompraBoton = new javax.swing.JButton();
        IPTBoton = new javax.swing.JButton();
        Costos = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Costos proyectados");

        jLabel2.setText("Costos reales");

        Materia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Materia);

        tablareales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "C. Maquinaria", "C. Personal", "C. Materia P", "C. Total"
            }
        ));
        jScrollPane3.setViewportView(tablareales);

        Personal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(Personal);

        Maquinaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(Maquinaria);

        tablaCos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Coca Cola", null, null, null, null},
                {"Powerade", null, null, null, null},
                {"Del Valle", null, null, null, null},
                {"Fuze tea", null, null, null, null},
                {"Quatro", null, null, null, null},
                {"Fanta", null, null, null, null},
                {"Sprite", null, null, null, null},
                {"Ades", null, null, null, null},
                {"CocaZerp", null, null, null, null},
                {"Agua", null, null, null, null}
            },
            new String [] {
                "Producto", "C. Maquinaria", "C. Personal", "C. Materia P", "C. Total"
            }
        ));
        jScrollPane2.setViewportView(tablaCos);

        jButton2.setText("Generar proyectados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Generar reales");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel1))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout costosLayout = new javax.swing.GroupLayout(costos.getContentPane());
        costos.getContentPane().setLayout(costosLayout);
        costosLayout.setHorizontalGroup(
            costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(costosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        costosLayout.setVerticalGroup(
            costosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(costosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OCompraBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OCompraBotonMouseExited(evt);
            }
        });
        OCompraBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCompraBotonActionPerformed(evt);
            }
        });

        IPTBoton.setText("Inventario PT");
        IPTBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IPTBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IPTBotonMouseExited(evt);
            }
        });
        IPTBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPTBotonActionPerformed(evt);
            }
        });

        Costos.setText("Costos");
        Costos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CostosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CostosMouseExited(evt);
            }
        });
        Costos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosActionPerformed(evt);
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
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OCompraBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMPBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaquinariaBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IPTBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Costos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCompraBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaquinariaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMPBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IPTBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Costos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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
    JDialog dialogo = new JDialog(this,"Maquinaria");
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
    JDialog dialogo = new JDialog(this,"Orden de Compra");
    OrdenCompra panel = new OrdenCompra();
    dialogo.add(panel);
    dialogo.setVisible(true); 
       
    dialogo.setSize(1050, 680);
    
    Maquinaria ma = new Maquinaria();
    
    try{
            
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            ma.tablaMaquina.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT nombre_maquina, capacidad_hora, costo_hora, cantidad from inventario_maquinaria" ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Capacidad por hora");
           modeloTabla.addColumn("Costo por hora");
           modeloTabla.addColumn("Cantidad");
          
            
            
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
    
    }//GEN-LAST:event_OCompraBotonActionPerformed

    private void IMPBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Inventario Materia Prima");
    InventarioMP panel = new InventarioMP();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(850, 500);
    }//GEN-LAST:event_IMPBotonActionPerformed

    private void IPTBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPTBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Inventario Producto Terminado");
    InventarioPT panel = new InventarioPT();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(850, 500);
    }//GEN-LAST:event_IPTBotonActionPerformed

    private void CostosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CostosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CostosMouseExited

    private void CostosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CostosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CostosMouseEntered

    private void CostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostosActionPerformed
        costos.setVisible(true);
      
        costos.setSize(1050, 680);
           try{
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            Personal.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT Nombre, Función, Costo from personal" ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Función");
           modeloTabla.addColumn("Costo por hora");
           
          
            
            
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
            Maquinaria.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT nombre_maquina, capacidad_hora, costo_hora from inventario_maquinaria" ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Capacidad");
           modeloTabla.addColumn("Costo por hora");
           
          
            
            
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
            Materia.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT Nombre, Costo from ingredientes" ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Costo");
           
           
          
            
            
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
           
           
           
           
           
    }//GEN-LAST:event_CostosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                    int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                    int suma = coca + coca * 2;
                    tablaCos.setValueAt(String.valueOf(suma), i, 1);
                }
                for (int a = 0; a < Personal.getRowCount(); a++) {
                    int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                    int suma = coca + coca * 22;
                    tablaCos.setValueAt(String.valueOf(suma), i, 2);
                }
                for (int a = 0; a < Materia.getRowCount(); a++) {
                    int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                    int suma = coca + coca * 1;
                    tablaCos.setValueAt(String.valueOf(suma), i, 3);
                }
            } else {
                if (i == 1) {
                    for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                        int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                        int suma = coca + coca * 3;
                        tablaCos.setValueAt(String.valueOf(suma), i, 1);
                    }
                    for (int a = 0; a < Personal.getRowCount(); a++) {
                        int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                        int suma = coca + coca * 22;
                        tablaCos.setValueAt(String.valueOf(suma), i, 2);
                    }
                    for (int a = 0; a < Materia.getRowCount(); a++) {
                        int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                        int suma = coca + coca * 2;
                        tablaCos.setValueAt(String.valueOf(suma), i, 3);
                    }
                } else {
                    if (i == 2) {
                        for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                            int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                            int suma = coca + coca * 1;
                            tablaCos.setValueAt(String.valueOf(suma), i, 1);
                        }
                        for (int a = 0; a < Personal.getRowCount(); a++) {
                            int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                            int suma = coca + coca * 22;
                            tablaCos.setValueAt(String.valueOf(suma), i, 2);
                        }
                        for (int a = 0; a < Materia.getRowCount(); a++) {
                            int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                            int suma = coca + coca * 2;
                            tablaCos.setValueAt(String.valueOf(suma), i, 3);
                        }
                    } else {
                        if (i == 3) {
                            for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                int suma = coca + coca * 2;
                                tablaCos.setValueAt(String.valueOf(suma), i, 1);
                            }
                            for (int a = 0; a < Personal.getRowCount(); a++) {
                                int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                int suma = coca + coca * 22;
                                tablaCos.setValueAt(String.valueOf(suma), i, 2);
                            }
                            for (int a = 0; a < Materia.getRowCount(); a++) {
                                int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                int suma = coca + coca * 3;
                                tablaCos.setValueAt(String.valueOf(suma), i, 3);
                            }
                        } else {
                            if (i == 4) {
                                for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                    int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                    int suma = coca + coca * 2;
                                    tablaCos.setValueAt(String.valueOf(suma), i, 1);
                                }
                                for (int a = 0; a < Personal.getRowCount(); a++) {
                                    int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                    int suma = coca + coca * 22;
                                    tablaCos.setValueAt(String.valueOf(suma), i, 2);
                                }
                                for (int a = 0; a < Materia.getRowCount(); a++) {
                                    int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                    int suma = coca + coca * 2;
                                    tablaCos.setValueAt(String.valueOf(suma), i, 3);
                                }
                            } else {
                                if (i == 5) {
                                    for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                        int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                        int suma = coca + coca * 3;
                                        tablaCos.setValueAt(String.valueOf(suma), i, 1);
                                    }
                                    for (int a = 0; a < Personal.getRowCount(); a++) {
                                        int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                        int suma = coca + coca * 22;
                                        tablaCos.setValueAt(String.valueOf(suma), i, 2);
                                    }
                                    for (int a = 0; a < Materia.getRowCount(); a++) {
                                        int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                        int suma = coca + coca * 1;
                                        tablaCos.setValueAt(String.valueOf(suma), i, 3);
                                    }
                                } else {
                                    if (i == 6) {
                                        for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                            int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                            int suma = coca + coca * 2;
                                            tablaCos.setValueAt(String.valueOf(suma), i, 1);
                                        }
                                        for (int a = 0; a < Personal.getRowCount(); a++) {
                                            int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                            int suma = coca + coca * 22;
                                            tablaCos.setValueAt(String.valueOf(suma), i, 2);
                                        }
                                        for (int a = 0; a < Materia.getRowCount(); a++) {
                                            int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                            int suma = coca + coca * 3;
                                            tablaCos.setValueAt(String.valueOf(suma), i, 3);
                                        }
                                    } else {
                                        if (i == 7) {
                                            for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                                int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                                int suma = coca + coca * 1;
                                                tablaCos.setValueAt(String.valueOf(suma), i, 1);
                                            }
                                            for (int a = 0; a < Personal.getRowCount(); a++) {
                                                int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                                int suma = coca + coca * 22;
                                                tablaCos.setValueAt(String.valueOf(suma), i, 2);
                                            }
                                            for (int a = 0; a < Materia.getRowCount(); a++) {
                                                int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                                int suma = coca + coca * 2;
                                                tablaCos.setValueAt(String.valueOf(suma), i, 3);
                                            }
                                        } else {
                                            if (i == 8) {
                                                for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                                    int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                                    int suma = coca + coca * 2;
                                                    tablaCos.setValueAt(String.valueOf(suma), i, 1);
                                                }
                                                for (int a = 0; a < Personal.getRowCount(); a++) {
                                                    int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                                    int suma = coca + coca * 22;
                                                    tablaCos.setValueAt(String.valueOf(suma), i, 2);
                                                }
                                                for (int a = 0; a < Materia.getRowCount(); a++) {
                                                    int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                                    int suma = coca + coca * 3;
                                                    tablaCos.setValueAt(String.valueOf(suma), i, 3);
                                                }
                                            } else {
                                                if (i == 9) {
                                                    for (int a = 0; a < Maquinaria.getRowCount(); a++) {
                                                        int coca = Integer.parseInt(Maquinaria.getValueAt(a, 2).toString());
                                                        int suma = coca + coca * 3;
                                                        tablaCos.setValueAt(String.valueOf(suma), i, 1);
                                                    }
                                                    for (int a = 0; a < Personal.getRowCount(); a++) {
                                                        int coca = Integer.parseInt(Personal.getValueAt(a, 2).toString());
                                                        int suma = coca + coca * 22;
                                                        tablaCos.setValueAt(String.valueOf(suma), i, 2);
                                                    }
                                                    for (int a = 0; a < Materia.getRowCount(); a++) {
                                                        int coca = Integer.parseInt(Materia.getValueAt(a, 1).toString());
                                                        int suma = coca + coca * 1;
                                                        tablaCos.setValueAt(String.valueOf(suma), i, 3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        
        for(int a=0; a<tablaCos.getRowCount();a++){
            
                int suma1 = Integer.valueOf(tablaCos.getValueAt(a, 1).toString());
                int suma2 = Integer.valueOf(tablaCos.getValueAt(a, 2).toString());
                int suma3 = Integer.valueOf(tablaCos.getValueAt(a, 3).toString());
                int sumaT =suma1 + suma2 + suma3;
                tablaCos.setValueAt(sumaT, a, 4);
             
                
            }
    
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        for(int a=0; a<tablaCos.getRowCount(); a++){
            for(int b =1; b<tablaCos.getColumnCount(); b++){
                String nombre = tablaCos.getValueAt(a, 0).toString();
                int cambio = Integer.valueOf(tablaCos.getValueAt(a, b).toString());
                tablareales.setValueAt(nombre, a,0);
                tablareales.setValueAt(cambio, a, b);
            }
        }
        
        for(int a=0; a<tablareales.getRowCount();a++){
            
                int suma = 831 + Integer.valueOf(tablareales.getValueAt(a, 1).toString());
                tablareales.setValueAt(suma, a, 1);
                
            }
        
        for(int b =1; b<5; b++ ){
            int suma2 = 45 + Integer.valueOf(tablareales.getValueAt(b*2-1, 2).toString());
                tablareales.setValueAt(suma2, b*2-1, 2);
        }
        
                int suma2 = 16 + Integer.valueOf(tablareales.getValueAt(3, 3).toString());
                int sumaT2 = 16 + Integer.valueOf(tablareales.getValueAt(3, 4).toString());
                tablareales.setValueAt(suma2, 3, 3);
                tablareales.setValueAt(sumaT2, 3, 4);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JButton Costos;
    private javax.swing.JButton IMPBoton;
    private javax.swing.JButton IPTBoton;
    private javax.swing.JTable Maquinaria;
    private javax.swing.JButton MaquinariaBoton;
    private javax.swing.JTable Materia;
    private javax.swing.JButton OCompraBoton;
    private javax.swing.JTable Personal;
    private javax.swing.JDialog costos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaCos;
    private javax.swing.JTable tablareales;
    // End of variables declaration//GEN-END:variables
}
