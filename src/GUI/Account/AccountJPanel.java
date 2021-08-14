/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Account;

import BLL.BLL_QLCustomer;
import DAL.DB_Helper;
import DTO.Account;
import GUI.Manage.CustomerJPanel;
import GUI.Account.ResetPasswordJPanel;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class AccountJPanel extends javax.swing.JPanel {

    
    public AccountJPanel(String usn) {
        initComponents();
        SetGUI(usn);
        jtfID.enable(false);
        jtfDisplayName.enable(false);
        jtfUsername.enable(false);
        jpfPassword.enable(false);
        JRadioButton[] buttons = new JRadioButton[]{jrbManager,jrbStaff};
         for (JRadioButton btn : buttons) {
         btn.setEnabled(false);
    }
    }
    private void SetGUI(String usn){
        jtfUsername.setText(usn);
        Account s = BLL_QLCustomer.getInstance().GetAccount_BLL(usn);
        jtfID.setText(Integer.toString(s.id));
        jtfDisplayName.setText(s.displayname);
        jpfPassword.setText(s.password);
        if(s.type == 1){
            jrbManager.doClick();
        }
        else jrbStaff.doClick();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnRoot = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jbtResetPassword = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jlbUsername1 = new javax.swing.JLabel();
        jtfDisplayName = new javax.swing.JTextField();
        jlbUsername2 = new javax.swing.JLabel();
        jtfUsername = new javax.swing.JTextField();
        jlbUsername3 = new javax.swing.JLabel();
        jlbUsername4 = new javax.swing.JLabel();
        jlbUsername5 = new javax.swing.JLabel();
        jlbUsername6 = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        jrbManager = new javax.swing.JRadioButton();
        jrbStaff = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(31, 36, 42));

        jpnRoot.setBackground(new java.awt.Color(31, 36, 42));

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

        jbtResetPassword.setBackground(new java.awt.Color(152, 201, 45));
        jbtResetPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtResetPassword.setForeground(new java.awt.Color(21, 25, 28));
        jbtResetPassword.setText("Reset Pasword");
        jbtResetPassword.setBorder(null);
        jbtResetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtResetPassword.setFocusPainted(false);
        jbtResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetPasswordActionPerformed(evt);
            }
        });

        jtfID.setBackground(new java.awt.Color(31, 36, 42));
        jtfID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfID.setForeground(new java.awt.Color(255, 255, 255));
        jtfID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfID.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername1.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername1.setText("ID:");

        jtfDisplayName.setBackground(new java.awt.Color(31, 36, 42));
        jtfDisplayName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfDisplayName.setForeground(new java.awt.Color(255, 255, 255));
        jtfDisplayName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfDisplayName.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername2.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername2.setText("Display Name:");

        jtfUsername.setBackground(new java.awt.Color(31, 36, 42));
        jtfUsername.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfUsername.setForeground(new java.awt.Color(255, 255, 255));
        jtfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfUsername.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername3.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername3.setText("Username:");

        jlbUsername4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername4.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername4.setText("Password:");

        jlbUsername5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername5.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername5.setText("Type:");

        jlbUsername6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlbUsername6.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername6.setText("Details Account");

        jpfPassword.setBackground(new java.awt.Color(31, 36, 42));
        jpfPassword.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jpfPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jpfPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        jrbManager.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbManager);
        jrbManager.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbManager.setForeground(new java.awt.Color(169, 224, 49));
        jrbManager.setText("Manager");

        jrbStaff.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbStaff);
        jrbStaff.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbStaff.setForeground(new java.awt.Color(169, 224, 49));
        jrbStaff.setText("Staff");

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305)
                .addComponent(jlbLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jlbUsername5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpnRootLayout.createSequentialGroup()
                                    .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlbUsername3)
                                        .addComponent(jlbUsername2)
                                        .addComponent(jlbUsername4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpnRootLayout.createSequentialGroup()
                                            .addComponent(jrbManager)
                                            .addGap(18, 18, 18)
                                            .addComponent(jrbStaff))))
                                .addGroup(jpnRootLayout.createSequentialGroup()
                                    .addComponent(jlbUsername1)
                                    .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpnRootLayout.createSequentialGroup()
                                            .addGap(42, 42, 42)
                                            .addComponent(jlbUsername6))
                                        .addGroup(jpnRootLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jbtResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jlbUsername6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername1))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername2))
                .addGap(19, 19, 19)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbUsername3)
                    .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbUsername5)
                            .addComponent(jrbManager)
                            .addComponent(jrbStaff)))
                    .addComponent(jlbUsername4))
                .addGap(18, 18, 18)
                .addComponent(jbtResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetPasswordActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new ResetPasswordJPanel(jtfUsername.getText()));
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtResetPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtResetPassword;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbUsername1;
    private javax.swing.JLabel jlbUsername2;
    private javax.swing.JLabel jlbUsername3;
    private javax.swing.JLabel jlbUsername4;
    private javax.swing.JLabel jlbUsername5;
    private javax.swing.JLabel jlbUsername6;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JRadioButton jrbManager;
    private javax.swing.JRadioButton jrbStaff;
    private javax.swing.JTextField jtfDisplayName;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfUsername;
    // End of variables declaration//GEN-END:variables
}
