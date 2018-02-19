package ventanas;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Principal_Vendedor extends javax.swing.JFrame 
{
    public Principal_Vendedor() 
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono Principal.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInventario = new javax.swing.JMenu();
        itemVerInventario = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itemVerClientes = new javax.swing.JMenuItem();
        MICrear = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        itemCerrarSesion = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(0, 51, 51));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        desktopPane.setBackground(new java.awt.Color(0, 51, 51));
        desktopPane.setForeground(new java.awt.Color(0, 51, 51));
        desktopPane.setAutoscrolls(true);
        jPanel2.add(desktopPane);
        desktopPane.setBounds(0, 50, 1000, 440);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACEITERA DE OCCIDENTE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(540, 0, 450, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 30, 990, 490);

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 570, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 600);

        menuInventario.setText("INVENTARIO");

        itemVerInventario.setText("INVENTARIO");
        itemVerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerInventarioActionPerformed(evt);
            }
        });
        menuInventario.add(itemVerInventario);

        jMenuBar1.add(menuInventario);

        menuVentas.setText("VENTAS");

        jMenuItem3.setText("REALIZAR UNA VENTA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem3);

        jMenuBar1.add(menuVentas);

        menuClientes.setText("CLIENTES");

        itemVerClientes.setText("VER");
        itemVerClientes.setToolTipText("");
        itemVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerClientesActionPerformed(evt);
            }
        });
        menuClientes.add(itemVerClientes);

        MICrear.setText("AÑADIR NUEVO CLIENTE");
        MICrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICrearActionPerformed(evt);
            }
        });
        menuClientes.add(MICrear);

        jMenuBar1.add(menuClientes);

        menuOpciones.setText("MAS OPCIONES");

        itemCerrarSesion.setText("CERRAR SECIÓN");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        menuOpciones.add(itemCerrarSesion);

        itemSalir.setText("SALIR");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuOpciones.add(itemSalir);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        setBounds(150, 50, 1057, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerInventarioActionPerformed
        Ver_InventVendedor inventario = new Ver_InventVendedor();
        desktopPane.add(inventario);
        try
        {
            inventario.setMaximum(true);
        }catch(PropertyVetoException e)
        {
            e.printStackTrace();
        }
        inventario.setVisible(true);
    }//GEN-LAST:event_itemVerInventarioActionPerformed

    private void itemVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerClientesActionPerformed
        Clientes verClientes = new Clientes();
        desktopPane.add(verClientes);
        try
        {
            verClientes.setMaximum(true);
        }catch(PropertyVetoException e)
        {
            e.printStackTrace();
        }
        verClientes.setVisible(true);
    }//GEN-LAST:event_itemVerClientesActionPerformed

    private void MICrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICrearActionPerformed
        CargarClientes CrearCliente = new CargarClientes();
        desktopPane.add(CrearCliente);
        try {
            CrearCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal_Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        CrearCliente.setVisible(true);
    }//GEN-LAST:event_MICrearActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Ventas misVentas = new Ventas();
        desktopPane.add(misVentas);
        try {
            misVentas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal_Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        misVentas.SetDesktopPane(desktopPane);
        misVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    public void SetNombreUs(String NombreUs)    
    {
        this.NombreUs=NombreUs;
        jLabel2.setText("Usuario: "+NombreUs);
    }
    private String NombreUs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MICrear;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemVerClientes;
    private javax.swing.JMenuItem itemVerInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}
