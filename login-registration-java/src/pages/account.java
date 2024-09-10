
package pages;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class account extends javax.swing.JPanel {

    public account() {
        initComponents();
        loadTable();
    }

    private void loadTable() {

        try {
            String SUrl = "jdbc:mysql://localhost:3306/login&register_db";
            String SUser = "root";
            String SPass = "";

            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String query = "SELECT * FROM user";
            PreparedStatement pst = con.prepareStatement(query);

            String[] columnNames = {"fname", "lname", "email", "password"};

            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            myTable.setModel(tableModel);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                Object[] row = {
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("email"),
                    rs.getString("password")};

                tableModel.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        account_frame = new javax.swing.JPanel();
        registration_title6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        account_frame.setBackground(new java.awt.Color(255, 255, 255));
        account_frame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registration_title6.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        registration_title6.setForeground(new java.awt.Color(51, 0, 0));
        registration_title6.setText("Accounts");
        account_frame.add(registration_title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 47, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setForeground(new java.awt.Color(0, 255, 153));
        account_frame.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 20, -1, -1));

        myTable.setBackground(new java.awt.Color(255, 255, 255));
        myTable.setFont(new java.awt.Font("Product Sans Medium", 0, 12)); // NOI18N
        myTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(myTable);

        account_frame.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 595, -1));

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/logo.png"))); // NOI18N
        account_frame.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(account_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(account_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account_frame;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myTable;
    private javax.swing.JLabel registration_title6;
    // End of variables declaration//GEN-END:variables
}
