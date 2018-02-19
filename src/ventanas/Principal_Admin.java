package ventanas;

import javax.swing.ImageIcon;

public class Principal_Admin extends javax.swing.JFrame 
{
    public Principal_Admin() 
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
        jLabel1 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInventario = new javax.swing.JMenu();
        itemVerInventario = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        itemVentas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        itemVerProveedores = new javax.swing.JMenuItem();
        itemAddProveedores = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itemVerClientes = new javax.swing.JMenuItem();
        MICrear = new javax.swing.JMenuItem();
        menuRRHH = new javax.swing.JMenu();
        itemVerRRHH = new javax.swing.JMenuItem();
        AddUsuario = new javax.swing.JMenuItem();
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
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setAutoscrolls(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACEITERA DE OCCIDENTE");

        desktopPane.setBackground(new java.awt.Color(0, 51, 51));
        desktopPane.setForeground(new java.awt.Color(0, 51, 51));
        desktopPane.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addComponent(desktopPane)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 780);

        menuInventario.setText("INVENTARIO");

        itemVerInventario.setText("Productos Existentes");
        itemVerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerInventarioActionPerformed(evt);
            }
        });
        menuInventario.add(itemVerInventario);

        jMenuBar1.add(menuInventario);

        menuVentas.setText("VENTAS");

        itemVentas.setText("VER VENTAS");
        itemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentasActionPerformed(evt);
            }
        });
        menuVentas.add(itemVentas);

        jMenuItem3.setText("REALIZAR UNA VENTA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem3);

        jMenuBar1.add(menuVentas);

        jMenu1.setText("COMPRAS");

        jMenuItem4.setText("REALIZAR COMPRA");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText(" VER COMPRAS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        menuProveedores.setText("PROVEEDORES");
        menuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProveedoresActionPerformed(evt);
            }
        });

        itemVerProveedores.setText("VER");
        itemVerProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerProveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(itemVerProveedores);

        itemAddProveedores.setText("AÑADIR");
        itemAddProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddProveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(itemAddProveedores);

        jMenuBar1.add(menuProveedores);

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

        menuRRHH.setText("RECURSOS HUMANOS");

        itemVerRRHH.setText("Ver/Modificar");
        itemVerRRHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerRRHHActionPerformed(evt);
            }
        });
        menuRRHH.add(itemVerRRHH);

        AddUsuario.setText("Agregar usuario");
        AddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUsuarioActionPerformed(evt);
            }
        });
        menuRRHH.add(AddUsuario);

        jMenuBar1.add(menuRRHH);

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

        setBounds(150, 50, 1118, 839);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemAddProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddProveedoresActionPerformed
        
    }//GEN-LAST:event_itemAddProveedoresActionPerformed

    private void itemVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerInventarioActionPerformed
        
    }//GEN-LAST:event_itemVerInventarioActionPerformed

    private void itemVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerClientesActionPerformed
        
    }//GEN-LAST:event_itemVerClientesActionPerformed

    private void MICrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICrearActionPerformed
        
    }//GEN-LAST:event_MICrearActionPerformed

    private void itemVerProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerProveedoresActionPerformed
        
    }//GEN-LAST:event_itemVerProveedoresActionPerformed

    private void itemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVentasActionPerformed
        
    }//GEN-LAST:event_itemVentasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void AddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUsuarioActionPerformed
        
    }//GEN-LAST:event_AddUsuarioActionPerformed

    private void itemVerRRHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerRRHHActionPerformed
        
    }//GEN-LAST:event_itemVerRRHHActionPerformed

    private void menuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuProveedoresActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddUsuario;
    private javax.swing.JMenuItem MICrear;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemAddProveedores;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemVentas;
    private javax.swing.JMenuItem itemVerClientes;
    private javax.swing.JMenuItem itemVerInventario;
    private javax.swing.JMenuItem itemVerProveedores;
    private javax.swing.JMenuItem itemVerRRHH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu menuRRHH;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}