package ventanas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FramePrimerInicio extends javax.swing.JFrame {

    public FramePrimerInicio()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelInicioSesion = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        comboBoxAcceso = new javax.swing.JComboBox<>();
        lblSueldo = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        lblDireccion = new javax.swing.JLabel();
        lblDPI = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        txtNombre = new javax.swing.JTextField();
        lblPuesto = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        comboBoxPuesto1 = new javax.swing.JComboBox<>();
        lblGenero = new javax.swing.JLabel();
        comboBoxGenero1 = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        lblEstado1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPoliciacos = new javax.swing.JTextArea();
        lblSueldo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaExperiencia1 = new javax.swing.JTextArea();
        lblSueldo3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaAntecedentes1 = new javax.swing.JTextArea();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("framePrimerInicio"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        labelInicioSesion.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        labelInicioSesion.setForeground(new java.awt.Color(0, 51, 51));
        labelInicioSesion.setText("CREAR  USUARIO");
        jPanel2.add(labelInicioSesion);
        labelInicioSesion.setBounds(280, 10, 260, 40);

        txtDPI.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        txtDPI.setForeground(new java.awt.Color(0, 51, 51));
        txtDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDPIKeyTyped(evt);
            }
        });
        jPanel2.add(txtDPI);
        txtDPI.setBounds(520, 60, 170, 25);

        txtTelefono.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 51, 51));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono);
        txtTelefono.setBounds(520, 140, 170, 25);

        lblUsuario.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 51, 51));
        lblUsuario.setText("Usuario");
        jPanel2.add(lblUsuario);
        lblUsuario.setBounds(70, 530, 80, 22);

        lblPassword.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 51, 51));
        lblPassword.setText("Contraseña");
        jPanel2.add(lblPassword);
        lblPassword.setBounds(50, 580, 100, 22);

        lblEstado.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 51, 51));
        lblEstado.setText("Telefóno");
        jPanel2.add(lblEstado);
        lblEstado.setBounds(440, 140, 70, 19);

        comboBoxAcceso.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        comboBoxAcceso.setForeground(new java.awt.Color(0, 51, 51));
        comboBoxAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Activo", "Inactivo" }));
        jPanel2.add(comboBoxAcceso);
        comboBoxAcceso.setBounds(520, 440, 170, 30);

        lblSueldo.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblSueldo.setForeground(new java.awt.Color(0, 51, 51));
        lblSueldo.setText("Antecedentes policiacos");
        jPanel2.add(lblSueldo);
        lblSueldo.setBounds(60, 350, 190, 30);

        comboBoxEstado.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        comboBoxEstado.setForeground(new java.awt.Color(0, 51, 51));
        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Soltero", "Casado" }));
        jPanel2.add(comboBoxEstado);
        comboBoxEstado.setBounds(210, 140, 180, 30);

        lblDireccion.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 51, 51));
        lblDireccion.setText("Dirección");
        jPanel2.add(lblDireccion);
        lblDireccion.setBounds(70, 100, 90, 22);

        lblDPI.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblDPI.setForeground(new java.awt.Color(0, 51, 51));
        lblDPI.setText("DPI");
        jPanel2.add(lblDPI);
        lblDPI.setBounds(440, 60, 80, 22);

        button1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 51, 51));
        button1.setLabel("Guardar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1);
        button1.setBounds(600, 590, 90, 30);

        txtNombre.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtNombre);
        txtNombre.setBounds(210, 60, 170, 25);

        lblPuesto.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(0, 51, 51));
        lblPuesto.setText("Puesto");
        jPanel2.add(lblPuesto);
        lblPuesto.setBounds(110, 440, 70, 22);

        txtDireccion.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(210, 100, 170, 25);

        comboBoxPuesto1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        comboBoxPuesto1.setForeground(new java.awt.Color(0, 51, 51));
        comboBoxPuesto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Administrador", "Vendedor", "Recursos Humanos" }));
        jPanel2.add(comboBoxPuesto1);
        comboBoxPuesto1.setBounds(190, 440, 180, 30);

        lblGenero.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 51, 51));
        lblGenero.setText("Género");
        jPanel2.add(lblGenero);
        lblGenero.setBounds(440, 100, 70, 22);

        comboBoxGenero1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        comboBoxGenero1.setForeground(new java.awt.Color(0, 51, 51));
        comboBoxGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Masculino", "Femenino" }));
        jPanel2.add(comboBoxGenero1);
        comboBoxGenero1.setBounds(520, 100, 170, 30);

        lblEstadoCivil.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(0, 51, 51));
        lblEstadoCivil.setText("Estado Civil");
        jPanel2.add(lblEstadoCivil);
        lblEstadoCivil.setBounds(70, 140, 110, 22);

        lblEstado1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(0, 51, 51));
        lblEstado1.setText("Acceso");
        jPanel2.add(lblEstado1);
        lblEstado1.setBounds(410, 440, 80, 22);

        lblNombre1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 51, 51));
        lblNombre1.setText("Nombre");
        jPanel2.add(lblNombre1);
        lblNombre1.setBounds(70, 60, 80, 22);

        textAreaPoliciacos.setColumns(20);
        textAreaPoliciacos.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        textAreaPoliciacos.setForeground(new java.awt.Color(0, 51, 51));
        textAreaPoliciacos.setRows(5);
        textAreaPoliciacos.setText("Ninguno");
        jScrollPane1.setViewportView(textAreaPoliciacos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(250, 340, 440, 70);

        lblSueldo2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblSueldo2.setForeground(new java.awt.Color(0, 51, 51));
        lblSueldo2.setText("Experiencia laboral");
        jPanel2.add(lblSueldo2);
        lblSueldo2.setBounds(70, 190, 180, 30);

        textAreaExperiencia1.setColumns(20);
        textAreaExperiencia1.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        textAreaExperiencia1.setForeground(new java.awt.Color(0, 51, 51));
        textAreaExperiencia1.setRows(5);
        textAreaExperiencia1.setText("Ninguna");
        jScrollPane2.setViewportView(textAreaExperiencia1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(250, 180, 440, 70);

        lblSueldo3.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblSueldo3.setForeground(new java.awt.Color(0, 51, 51));
        lblSueldo3.setText("Antecedentes penales");
        jPanel2.add(lblSueldo3);
        lblSueldo3.setBounds(70, 270, 180, 30);

        textAreaAntecedentes1.setColumns(20);
        textAreaAntecedentes1.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        textAreaAntecedentes1.setForeground(new java.awt.Color(0, 51, 51));
        textAreaAntecedentes1.setRows(5);
        textAreaAntecedentes1.setText("Ninguno");
        jScrollPane3.setViewportView(textAreaAntecedentes1);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(250, 260, 440, 70);

        txtUsuario.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(170, 530, 220, 25);

        txtPassword.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtPassword);
        txtPassword.setBounds(170, 570, 220, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 10, 750, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 670);

        setBounds(250, 15, 877, 710);
    }// </editor-fold>//GEN-END:initComponents

    public static String fecha()
    {
	Date fecha = new Date();
	SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
	formatoFecha.format(fecha);
	return formatoFecha.format(fecha);
    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
    }//GEN-LAST:event_button1ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyTyped
        
    }//GEN-LAST:event_txtDPIKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JComboBox<String> comboBoxAcceso;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxGenero1;
    private javax.swing.JComboBox<String> comboBoxPuesto1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelInicioSesion;
    private javax.swing.JLabel lblDPI;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldo2;
    private javax.swing.JLabel lblSueldo3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea textAreaAntecedentes1;
    private javax.swing.JTextArea textAreaExperiencia1;
    private javax.swing.JTextArea textAreaPoliciacos;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
