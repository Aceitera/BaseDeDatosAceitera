
package ventanas;

import java.awt.print.PrinterException;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
/**
 *3
 * @author MAPA
 */
public class Ventas extends javax.swing.JInternalFrame {  

    public Ventas() {
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null); 
        this.setBorder(new EmptyBorder(0, 0, 0, 0));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldMonto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCambio = new javax.swing.JTextField();
        jButtonRealizarCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jButtonCotizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldVendedor = new javax.swing.JTextField();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        jButtonNuevaVenta = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(230, 209, 117));
        setAutoscrolls(true);
        getContentPane().setLayout(null);

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("VENTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(860, 10, 100, 30);

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirNegro.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(970, 0, 40, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(230, 209, 117));

        jList1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 51, 51));
        jList1.setEnabled(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 170, 310, 270);

        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jScrollPane1.setBackground(java.awt.Color.lightGray);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setForeground(new java.awt.Color(0, 51, 51));

        jTable1.setBackground(java.awt.Color.lightGray);
        jTable1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Tipo", "Codigo", "Marca", "Presentacion", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 660, 330);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(230, 209, 117));
        jPanel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Venta:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 17);

        jLabel10.setBackground(java.awt.Color.lightGray);
        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Monto:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 10, 70, 17);

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(java.awt.Color.lightGray);
        jTextFieldTotal.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jTextFieldTotal);
        jTextFieldTotal.setBounds(10, 30, 90, 23);

        jTextFieldMonto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTextFieldMonto.setForeground(new java.awt.Color(0, 51, 51));
        jTextFieldMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMontoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldMonto);
        jTextFieldMonto.setBounds(110, 30, 90, 23);

        jLabel9.setBackground(java.awt.Color.lightGray);
        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cambio:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 10, 60, 20);

        jTextFieldCambio.setEditable(false);
        jTextFieldCambio.setBackground(java.awt.Color.lightGray);
        jTextFieldCambio.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTextFieldCambio.setForeground(new java.awt.Color(0, 51, 51));
        jTextFieldCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCambioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCambio);
        jTextFieldCambio.setBounds(210, 30, 90, 23);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(10, 380, 324, 60);

        jButtonRealizarCompra.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRealizarCompra.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButtonRealizarCompra.setForeground(new java.awt.Color(0, 51, 51));
        jButtonRealizarCompra.setText("Finalizar Venta");
        jButtonRealizarCompra.setEnabled(false);
        jButtonRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCompraActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonRealizarCompra);
        jButtonRealizarCompra.setBounds(350, 410, 140, 25);

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Precio");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(370, 10, 42, 17);

        jTextFieldPrecio.setEditable(false);
        jPanel4.add(jTextFieldPrecio);
        jTextFieldPrecio.setBounds(430, 10, 200, 20);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Nombre Producto");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 10, 140, 30);

        jTextFieldNombreProducto.setEditable(false);
        jTextFieldNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreProductoActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldNombreProducto);
        jTextFieldNombreProducto.setBounds(150, 10, 190, 20);

        jButtonCotizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCotizar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButtonCotizar.setForeground(new java.awt.Color(0, 51, 51));
        jButtonCotizar.setText("Cotizar");
        jButtonCotizar.setEnabled(false);
        jButtonCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCotizarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCotizar);
        jButtonCotizar.setBounds(520, 410, 120, 25);

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Vendedor:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(350, 380, 70, 20);

        jTextFieldVendedor.setEditable(false);
        jTextFieldVendedor.setBackground(java.awt.Color.lightGray);
        jTextFieldVendedor.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTextFieldVendedor.setForeground(new java.awt.Color(0, 51, 51));
        jPanel4.add(jTextFieldVendedor);
        jTextFieldVendedor.setBounds(430, 380, 190, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(340, 80, 680, 450);

        jTextFieldNombreCliente.setEditable(false);
        jTextFieldNombreCliente.setBackground(java.awt.Color.lightGray);
        jTextFieldNombreCliente.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jTextFieldNombreCliente.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextFieldNombreCliente);
        jTextFieldNombreCliente.setBounds(140, 50, 190, 20);

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("Nombre Cliente");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 50, 120, 20);

        jButtonCliente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCliente.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(0, 51, 51));
        jButtonCliente.setText("...");
        jButtonCliente.setEnabled(false);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente);
        jButtonCliente.setBounds(180, 10, 45, 25);

        jButtonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 51, 51));
        jButtonAgregar.setText("Agregar al carrito");
        jButtonAgregar.setEnabled(false);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar);
        jButtonAgregar.setBounds(160, 500, 150, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(140, 80, 190, 20);

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("Tipo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 80, 66, 20);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 470, 63, 30);

        txtVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtVenta);
        txtVenta.setBounds(120, 470, 190, 20);

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Presentacion");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 140, 85, 17);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 140, 190, 20);

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Existencia");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 440, 67, 17);

        jTextFieldCantidad.setEditable(false);
        getContentPane().add(jTextFieldCantidad);
        jTextFieldCantidad.setBounds(120, 440, 190, 20);

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Codigo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 110, 66, 20);

        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });
        getContentPane().add(jTextBuscar);
        jTextBuscar.setBounds(140, 110, 190, 20);

        jButtonNuevaVenta.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNuevaVenta.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButtonNuevaVenta.setForeground(new java.awt.Color(0, 51, 51));
        jButtonNuevaVenta.setText("Venta Nueva");
        jButtonNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevaVenta);
        jButtonNuevaVenta.setBounds(20, 10, 150, 30);

        jButtonCargar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCargar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButtonCargar.setForeground(new java.awt.Color(0, 51, 51));
        jButtonCargar.setText("Cargar");
        jButtonCargar.setEnabled(false);
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargar);
        jButtonCargar.setBounds(340, 50, 100, 20);

        jLabelFecha.setBackground(java.awt.Color.lightGray);
        jLabelFecha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jLabelFecha);
        jLabelFecha.setBounds(800, 40, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarCompraActionPerformed
        
    }//GEN-LAST:event_jButtonRealizarCompraActionPerformed

    private void jButtonNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaVentaActionPerformed
       
    }//GEN-LAST:event_jButtonNuevaVentaActionPerformed

    private void jTextFieldMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMontoKeyTyped
        char c = evt.getKeyChar();			
        if(c<'0'||c>'9')                  
            evt.consume();
    }//GEN-LAST:event_jTextFieldMontoKeyTyped

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed

        
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        

    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed
        
    }//GEN-LAST:event_jTextBuscarKeyPressed

    private void jButtonCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCotizarActionPerformed
       
    }//GEN-LAST:event_jButtonCotizarActionPerformed

    private void jTextFieldCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCambioActionPerformed

    private void txtVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaKeyTyped
    char c = evt.getKeyChar();
            if(c<'0' || c>'9')
                evt.consume();
    }//GEN-LAST:event_txtVentaKeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreProductoActionPerformed
    
    public void SetDesktopPane(JDesktopPane miPanel)
    {
        
    }
    
     public static String fecha()
    {
	Date fecha = new Date();
	SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
	formatoFecha.format(fecha);
	return formatoFecha.format(fecha);
    }
              
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonCotizar;
    private javax.swing.JButton jButtonNuevaVenta;
    private javax.swing.JButton jButtonRealizarCompra;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextFieldCambio;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldMonto;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldNombreProducto;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVendedor;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}
