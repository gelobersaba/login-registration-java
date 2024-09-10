
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabelRegister = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        login_pass = new javax.swing.JPasswordField();
        closebtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registration_title6 = new javax.swing.JLabel();
        registration_title2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(34, 34, 34));
        jLabel6.setFont(new java.awt.Font("Product Sans", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Welcome Back!");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 134, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Log In To Continue");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, -1, 19));

        loginbtn.setBackground(new java.awt.Color(51, 0, 0));
        loginbtn.setFont(new java.awt.Font("Product Sans", 1, 16)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Log In");
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel3.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 398, 302, 37));

        jLabel12.setFont(new java.awt.Font("Product Sans", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(34, 34, 34));
        jLabel12.setText("Don't Have Account?");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 467, -1, -1));

        jLabelRegister.setFont(new java.awt.Font("Product Sans Medium", 0, 16)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(51, 0, 0));
        jLabelRegister.setText("Sign Up");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 467, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 30, 36));
        jLabel8.setText("Email Address:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 138, 19));

        login_email.setBackground(new java.awt.Color(255, 255, 255));
        login_email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        login_email.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        login_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_emailActionPerformed(evt);
            }
        });
        jPanel3.add(login_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 302, 39));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 30, 36));
        jLabel9.setText("Password:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 138, 19));

        login_pass.setBackground(new java.awt.Color(255, 255, 255));
        login_pass.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        login_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.add(login_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 341, 302, 39));

        closebtn.setFont(new java.awt.Font("Poppins Black", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(27, 30, 36));
        closebtn.setText("X");
        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel3.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 20));

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setForeground(new java.awt.Color(0, 255, 153));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 48, -1, 80));

        registration_title6.setFont(new java.awt.Font("Montserrat Black", 1, 30)); // NOI18N
        registration_title6.setForeground(new java.awt.Color(51, 0, 0));
        registration_title6.setText("The Paw ");
        jPanel3.add(registration_title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, -1));

        registration_title2.setFont(new java.awt.Font("Montserrat Black", 1, 30)); // NOI18N
        registration_title2.setForeground(new java.awt.Color(51, 0, 0));
        registration_title2.setText("Palace");
        jPanel3.add(registration_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, -1));

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/logo.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 440, 550));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/c3d0afd671b9ce05d08c976f27dadca0.jpg"))); // NOI18N
        jLabel2.setAlignmentX(0.1F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String Email, Password, query;
        String passDb = null, fname = null;
        String SUrl, SUser, SPass;

        SUrl = "jdbc:mysql://localhost:3306/login&register_db";
        SUser = "root";
        SPass = "";

        try {
            // Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Validation of  email and password fields
            if (login_email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is Required", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (login_pass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is Required", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!login_email.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Email Address", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Email = login_email.getText();
            Password = login_pass.getText();

            // Prepare SQL query to avoid SQL injection
            query = "SELECT * FROM user WHERE email = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Email);

            // Execute query and process the result set
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                passDb = rs.getString("password");
                fname = rs.getString("first_name");

                // Check if the password matches
                if (Password.equals(passDb)) {
                    Home homepage = new Home();
                    homepage.setUserName(fname);
                    homepage.setVisible(true);
                    homepage.pack();
                    homepage.setLocationRelativeTo(null);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

            // Clear password field
            login_pass.setText("");
        } catch (Exception e) {
            e.printStackTrace(); // Output detailed error to console
            JOptionPane.showMessageDialog(new JFrame(), "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_loginbtnActionPerformed

    private void login_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_emailActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are You sure you want to close this application?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closebtnMouseClicked

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        RegistrationForm rgf = new RegistrationForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jLabelRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField login_email;
    private javax.swing.JPasswordField login_pass;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel registration_title2;
    private javax.swing.JLabel registration_title6;
    // End of variables declaration//GEN-END:variables
}
