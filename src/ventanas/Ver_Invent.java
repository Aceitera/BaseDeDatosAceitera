package ventanas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Ver_Invent extends javax.swing.JInternalFrame {


    public Ver_Invent() 
    {
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);  
        this.setBorder(new EmptyBorder(0, 0, 0, 0));
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        comboBox = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("VER INVENTARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 10, 250, 40);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Tipo", "Codigo", "Marca", "Presentacion", "Cantidad", "Costo", "Precio Venta", "Precio Cliente", "Descripcion"
            }
        ));
        miTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(miTabla);
        if (miTabla.getColumnModel().getColumnCount() > 0) {
            miTabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            miTabla.getColumnModel().getColumn(1).setPreferredWidth(60);
            miTabla.getColumnModel().getColumn(2).setPreferredWidth(150);
            miTabla.getColumnModel().getColumn(3).setPreferredWidth(30);
            miTabla.getColumnModel().getColumn(4).setPreferredWidth(25);
            miTabla.getColumnModel().getColumn(5).setPreferredWidth(25);
            miTabla.getColumnModel().getColumn(6).setPreferredWidth(25);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 980, 500);

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox);
        comboBox.setBounds(10, 20, 130, 20);

        txtBuscar.setName(""); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(150, 20, 280, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirNegro.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(950, 10, 40, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
    
    }//GEN-LAST:event_comboBoxActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void miTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miTablaMouseClicked
    }//GEN-LAST:event_miTablaMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
    
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
