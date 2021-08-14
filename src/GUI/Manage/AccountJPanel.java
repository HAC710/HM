
package GUI.Manage;

import GUI.Manage.ManageJPanel;
import BLL.BLL_QLAccount;
import BLL.BLL_QLStaff;
import DAL.DAL_QLAccount;
import DAL.DB_Helper;
import DTO.Account;
import DTO.ViewAccount;
import GUI.MainJFrame;
import GUI.StaffMainJFrame;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.BorderLayout;

public class AccountJPanel extends javax.swing.JPanel {

    
    public AccountJPanel() {
        initComponents();
        GetAccount();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jbtBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbAccount = new javax.swing.JTable();
        jbtEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtSearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbtAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtHistoryLogin = new javax.swing.JButton();
        jtfSearch1 = new javax.swing.JTextField();
        jbtResetPass = new javax.swing.JButton();

        jpnRoot.setBackground(new java.awt.Color(31, 36, 42));
        jpnRoot.setPreferredSize(new java.awt.Dimension(735, 676));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Andong", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 224, 49));
        jLabel7.setText("Hotel Management");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 224, 49));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(169, 224, 49));
        jLabel15.setText("HVH Soft");

        jbtBack.setBackground(new java.awt.Color(169, 224, 49));
        jbtBack.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbtBack.setForeground(new java.awt.Color(169, 224, 49));
        jbtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_To_25px.png"))); // NOI18N
        jbtBack.setText("Back");
        jbtBack.setBorder(null);
        jbtBack.setContentAreaFilled(false);
        jbtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtBack.setRequestFocusEnabled(false);
        jbtBack.setVerifyInputWhenFocusTarget(false);
        jbtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBackActionPerformed(evt);
            }
        });

        jtbAccount.setBackground(new java.awt.Color(31, 36, 42));
        jtbAccount.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtbAccount.setForeground(new java.awt.Color(169, 224, 49));
        jtbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "displayName", "typeAccount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbAccount);

        jbtEdit.setBackground(new java.awt.Color(31, 36, 42));
        jbtEdit.setForeground(new java.awt.Color(31, 36, 42));
        jbtEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-edit-32.png"))); // NOI18N
        jbtEdit.setBorder(null);
        jbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 224, 49));
        jLabel2.setText("Edit  Password");

        jbtSearch.setBackground(new java.awt.Color(31, 36, 42));
        jbtSearch.setForeground(new java.awt.Color(31, 36, 42));
        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-32.png"))); // NOI18N
        jbtSearch.setBorder(null);
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 224, 49));
        jLabel5.setText("Search:");

        jbtAdd.setBackground(new java.awt.Color(31, 36, 42));
        jbtAdd.setForeground(new java.awt.Color(31, 36, 42));
        jbtAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-add-image-32.png"))); // NOI18N
        jbtAdd.setBorder(null);
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 224, 49));
        jLabel1.setText("Add Admin Account");

        jbtDelete.setBackground(new java.awt.Color(31, 36, 42));
        jbtDelete.setForeground(new java.awt.Color(31, 36, 42));
        jbtDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-delete-32.png"))); // NOI18N
        jbtDelete.setBorder(null);
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 224, 49));
        jLabel3.setText("Delete Admin Account ");

        jbtHistoryLogin.setBackground(new java.awt.Color(152, 201, 45));
        jbtHistoryLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtHistoryLogin.setForeground(new java.awt.Color(21, 25, 28));
        jbtHistoryLogin.setText("Login history");
        jbtHistoryLogin.setBorder(null);
        jbtHistoryLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtHistoryLogin.setFocusPainted(false);
        jbtHistoryLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHistoryLoginActionPerformed(evt);
            }
        });

        jtfSearch1.setBackground(new java.awt.Color(31, 36, 42));
        jtfSearch1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtfSearch1.setForeground(new java.awt.Color(255, 255, 255));
        jtfSearch1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfSearch1.setCaretColor(new java.awt.Color(255, 255, 255));

        jbtResetPass.setBackground(new java.awt.Color(152, 201, 45));
        jbtResetPass.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtResetPass.setForeground(new java.awt.Color(21, 25, 28));
        jbtResetPass.setText("Resset Password");
        jbtResetPass.setBorder(null);
        jbtResetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtResetPass.setFocusPainted(false);
        jbtResetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addComponent(jbtHistoryLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtfSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtSearch))
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel3)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)))
                                .addComponent(jbtResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbLogo)))
                .addGap(0, 356, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)))
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtSearch)
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtHistoryLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jbtResetPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new ManageJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditActionPerformed
        try {
            int row = jtbAccount.getSelectedRow();
            Object id = jtbAccount.getValueAt(row, 0);
            
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new ExcuteEditAccountJPanel(id.hashCode()));
            jpnRoot.validate();
            jpnRoot.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jpnRoot, "Please select row to edit!!!");
        }
    }//GEN-LAST:event_jbtEditActionPerformed

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        try {
            String s = jtfSearch1.getText();
            ArrayList<ViewAccount> ar = BLL_QLAccount.getInstance().GetListViewAccount(s);
            ShowList(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new ExcuteAccountAdminJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtAddActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed

        int[] row = jtbAccount.getSelectedRows();
        for (int i : row) {
            String id = jtbAccount.getModel().getValueAt(i, 0).toString();
            String type = jtbAccount.getModel().getValueAt(i, 3).toString();
            String username = jtbAccount.getModel().getValueAt(i, 1).toString();
            
            if(!type.equals("Manager")){
                JOptionPane.showMessageDialog(jpnRoot, "Please choose a valid account!!!");
            }
            else if(BLL_QLStaff.getInstance().CheckAccountByUserName(username)){
                JOptionPane.showMessageDialog(jpnRoot, "Unable To Delete The Currently Logged In Account!!!");
            }          
            else{
                BLL_QLAccount.getInstance().DeleteAdminAccount_BLL(id);
            }
        }
        ArrayList<ViewAccount> l = BLL_QLAccount.getInstance().GetListViewAccount();
        ShowList(l);
    }//GEN-LAST:event_jbtDeleteActionPerformed

    private void jbtHistoryLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHistoryLoginActionPerformed
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new LoginHistoryJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtHistoryLoginActionPerformed

    private void jbtResetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetPassActionPerformed

        try{
            int row = jtbAccount.getSelectedRow();
            Object id = jtbAccount.getValueAt(row, 0);
            BLL_QLAccount.getInstance().ResetPasswordAccount_BLL(id.toString());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(jpnRoot, "Please select row to edit!!!");
        }
        ArrayList<ViewAccount> l = BLL_QLAccount.getInstance().GetListViewAccount();
        ShowList(l);
    }//GEN-LAST:event_jbtResetPassActionPerformed

    private void ShowList(ArrayList<ViewAccount> ar){
        DefaultTableModel tableModel = (DefaultTableModel)jtbAccount.getModel();
        tableModel.setRowCount(0);
        Object[] RowData = new Object[4];
        for(int i=0; i<ar.size();i++){
                 RowData[0] = ar.get(i).id;
                 RowData[1] = ar.get(i).username;
                 RowData[2] = ar.get(i).displayname;
                 if(ar.get(i).type == 1) RowData[3] = "Manager";
                 if(ar.get(i).type == 2) RowData[3] = "Staff";
                 
                 tableModel.addRow(RowData);
             }
    }
    private void GetAccount(){
       ArrayList<ViewAccount> l = BLL_QLAccount.getInstance().GetListViewAccount();
       ShowList(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtEdit;
    private javax.swing.JButton jbtHistoryLogin;
    private javax.swing.JButton jbtResetPass;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JTable jtbAccount;
    private javax.swing.JTextField jtfSearch1;
    // End of variables declaration//GEN-END:variables
}
