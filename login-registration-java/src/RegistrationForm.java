
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        registration_title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname_label = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailaddress = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        SignInLabelBtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registration_title.setBackground(new java.awt.Color(34, 34, 34));
        registration_title.setFont(new java.awt.Font("Product Sans", 1, 30)); // NOI18N
        registration_title.setForeground(new java.awt.Color(51, 0, 0));
        registration_title.setText("Registration");
        jPanel2.add(registration_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 49, 225, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Enter Your Details to Register");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 92, -1, 19));

        fname_label.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fname_label.setForeground(new java.awt.Color(51, 0, 0));
        fname_label.setText("First Name:");
        jPanel2.add(fname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 137, 123, 19));

        SignUpBtn.setBackground(new java.awt.Color(51, 0, 0));
        SignUpBtn.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 441, 423, 37));

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        fname.setSelectionColor(new java.awt.Color(51, 0, 0));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 162, 423, 31));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Last Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 123, 19));

        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lname.setSelectionColor(new java.awt.Color(51, 0, 0));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 423, 31));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Email Address:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 273, 123, 19));

        emailaddress.setBackground(new java.awt.Color(255, 255, 255));
        emailaddress.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        emailaddress.setSelectionColor(new java.awt.Color(51, 0, 0));
        emailaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailaddressActionPerformed(evt);
            }
        });
        jPanel2.add(emailaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 298, 423, 31));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        password.setSelectionColor(new java.awt.Color(51, 0, 0));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 423, 31));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("Password:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 335, 123, 19));

        jCheckBox1.setFont(new java.awt.Font("Product Sans Medium", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 0, 0));
        jCheckBox1.setText("I agree to the terms and conditions");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 403, 257, 20));

        jLabel1.setFont(new java.awt.Font("Product Sans Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("Already Have an Account?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 496, 172, -1));

        SignInLabelBtn.setFont(new java.awt.Font("Product Sans Medium", 0, 14)); // NOI18N
        SignInLabelBtn.setForeground(new java.awt.Color(51, 0, 0));
        SignInLabelBtn.setText("Sign In");
        SignInLabelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInLabelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInLabelBtnMouseClicked(evt);
            }
        });
        jPanel2.add(SignInLabelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 496, 53, -1));

        closebtn.setFont(new java.awt.Font("Poppins Black", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(27, 30, 36));
        closebtn.setText("X");
        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel2.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 550));

        jPanel3.setBackground(new java.awt.Color(204, 255, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/c3d0afd671b9ce05d08c976f27dadca0.jpg"))); // NOI18N
        jLabel2.setAutoscrolls(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setIconTextGap(0);
        jLabel2.setInheritsPopupMenu(false);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 900, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void emailaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailaddressActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private boolean isEmailExist(String email) {
        String SUrl = "jdbc:MySQL://localhost:3306/login&register_db";
        String SUser = "root";
        String SPass = "";

        String query = "SELECT COUNT(*) FROM user WHERE email = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }


    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // Sign Up Code

        String firstname = null, lastname = null, email = null, Password = null, query;
        String SUrl, SUser, SPass;

        SUrl = "jdbc:MySQL://localhost:3306/login&register_db";
        SUser = "root";
        SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

            if ("".equals(fname.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "First name is required to proceed.", "Info", JOptionPane.INFORMATION_MESSAGE);

            } else if ("".equals(lname.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required to proceed.", "Info", JOptionPane.INFORMATION_MESSAGE);

            } else if ("".equals(emailaddress.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required to proceed.", "Info", JOptionPane.INFORMATION_MESSAGE);

            } else if ("".equals(password.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required to proceed.", "Info", JOptionPane.INFORMATION_MESSAGE);

            } else if (!emailaddress.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(new JFrame(), "The email address you entered is invalid.", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else if (!jCheckBox1.isSelected()) {
                JOptionPane.showMessageDialog(new JFrame(), "By proceeding, you confirm your acceptance of our terms and conditions.", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else if (isEmailExist(emailaddress.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "This email address is already associated with an existing account.", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {

                firstname = fname.getText();
                lastname = lname.getText();
                email = emailaddress.getText();
                Password = password.getText();

                query = "INSERT INTO user(first_name, last_name, email, password)"
                        + "VALUES('" + firstname + "', '" + lastname + "' , '" + email + "' , '" + Password + "')";

                st.execute(query);
                fname.setText("");
                lname.setText("");
                emailaddress.setText("");
                password.setText("");
                showMessageDialog(null, "Account creation was successful! You're all set.");

            }

        } catch (Exception x) {
            System.out.println("Error" + x.getMessage());
        }

    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void SignInLabelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInLabelBtnMouseClicked
        LoginForm login = new LoginForm();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_SignInLabelBtnMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are You sure you want to close this application?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closebtnMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignInLabelBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel closebtn;
    private javax.swing.JTextField emailaddress;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fname_label;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel registration_title;
    // End of variables declaration//GEN-END:variables
}
