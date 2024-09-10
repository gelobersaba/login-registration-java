
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pages.account;
import pages.home;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        main_panel.add(new home());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        registration_title = new javax.swing.JLabel();
        registration_title3 = new javax.swing.JLabel();
        registration_title4 = new javax.swing.JLabel();
        registration_title5 = new javax.swing.JLabel();
        homebtn = new javax.swing.JLabel();
        accountbtn = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        main_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(40, 16, 13));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setForeground(new java.awt.Color(51, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registration_title.setBackground(new java.awt.Color(51, 51, 51));
        registration_title.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        registration_title.setForeground(new java.awt.Color(140, 140, 140));
        registration_title.setText("Total Balance");
        jPanel2.add(registration_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        registration_title3.setBackground(new java.awt.Color(51, 51, 51));
        registration_title3.setFont(new java.awt.Font("Product Sans", 1, 25)); // NOI18N
        registration_title3.setForeground(new java.awt.Color(255, 255, 255));
        registration_title3.setText("$ ---,---");
        jPanel2.add(registration_title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        registration_title4.setBackground(new java.awt.Color(51, 51, 51));
        registration_title4.setFont(new java.awt.Font("Montserrat", 1, 17)); // NOI18N
        registration_title4.setForeground(new java.awt.Color(140, 140, 140));
        registration_title4.setText("Log Out");
        registration_title4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registration_title4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registration_title4MouseClicked(evt);
            }
        });
        jPanel2.add(registration_title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        registration_title5.setBackground(new java.awt.Color(51, 51, 51));
        registration_title5.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        registration_title5.setForeground(new java.awt.Color(140, 140, 140));
        registration_title5.setText("Welcome back,");
        jPanel2.add(registration_title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        homebtn.setBackground(new java.awt.Color(51, 51, 51));
        homebtn.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        homebtn.setForeground(new java.awt.Color(153, 153, 153));
        homebtn.setText("Home");
        homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        jPanel2.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        accountbtn.setBackground(new java.awt.Color(51, 51, 51));
        accountbtn.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        accountbtn.setForeground(new java.awt.Color(140, 140, 140));
        accountbtn.setText("Accounts");
        accountbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountbtnMouseClicked(evt);
            }
        });
        jPanel2.add(accountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        user_name.setFont(new java.awt.Font("Montserrat", 1, 25)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setText("Angelo");
        jPanel2.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 590));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 670, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registration_title4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registration_title4MouseClicked
        JFrame frame = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            LoginForm login = new LoginForm();
            login.setVisible(true);
            login.pack();
            login.setLocationRelativeTo(null);
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_registration_title4MouseClicked

    private void accountbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountbtnMouseClicked
        main_panel.removeAll();
        main_panel.add(new account());
        main_panel.revalidate();
        main_panel.repaint();
    }//GEN-LAST:event_accountbtnMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        main_panel.removeAll();
        main_panel.add(new home());
        main_panel.revalidate();
        main_panel.repaint();
    }//GEN-LAST:event_homebtnMouseClicked

    public void setUserName(String name) {
        user_name.setText(name);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    void setUser(String fname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountbtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel registration_title;
    private javax.swing.JLabel registration_title3;
    private javax.swing.JLabel registration_title4;
    private javax.swing.JLabel registration_title5;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
