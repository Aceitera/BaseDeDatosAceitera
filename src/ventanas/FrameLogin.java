package ventanas;
import javax.swing.ImageIcon;

public class FrameLogin extends javax.swing.JFrame 
{
    public FrameLogin()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Login.gif")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnAcceder = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));
        jPanel3.setLayout(null);

        txtUsuario.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsuario.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jPanel3.add(txtUsuario);
        txtUsuario.setBounds(140, 190, 170, 30);

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(50, 190, 70, 30);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("INGRESAR");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(100, 10, 160, 60);
        jPanel3.add(passWord);
        passWord.setBounds(140, 240, 170, 30);

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 240, 100, 30);

        btnAcceder.setBackground(new java.awt.Color(229, 229, 229));
        btnAcceder.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btnAcceder.setLabel("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        jPanel3.add(btnAcceder);
        btnAcceder.setBounds(200, 300, 110, 24);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 10, 360, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        setBounds(400, 200, 567, 401);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAccederActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAcceder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}