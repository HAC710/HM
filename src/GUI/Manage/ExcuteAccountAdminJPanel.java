/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Manage;

import BLL.BLL_QLAccount;
import DTO.Account;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author dophu
 */
public class ExcuteAccountAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExcuteAccountAdminJPanel
     */
    public ExcuteAccountAdminJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jbtOK = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jlbUsername2 = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JTextField();
        jlbUsername3 = new javax.swing.JLabel();
        jlbUsername4 = new javax.swing.JLabel();
        jlbUsername6 = new javax.swing.JLabel();
        jlbUsername1 = new javax.swing.JLabel();
        jtfDisplayname1 = new javax.swing.JTextField();
        jtfUsername1 = new javax.swing.JTextField();
        jbtCancle = new javax.swing.JButton();
        jlbUsername5 = new javax.swing.JLabel();
        jtfReenterPassword1 = new javax.swing.JTextField();

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

        jbtOK.setBackground(new java.awt.Color(152, 201, 45));
        jbtOK.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtOK.setForeground(new java.awt.Color(21, 25, 28));
        jbtOK.setText("OK");
        jbtOK.setBorder(null);
        jbtOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtOK.setFocusPainted(false);
        jbtOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOKActionPerformed(evt);
            }
        });

        jtfID.setBackground(new java.awt.Color(31, 36, 42));
        jtfID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfID.setForeground(new java.awt.Color(255, 255, 255));
        jtfID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfID.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername2.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername2.setText("Display Name:");

        jtfPassword.setBackground(new java.awt.Color(31, 36, 42));
        jtfPassword.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfPassword.setForeground(new java.awt.Color(255, 255, 255));
        jtfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername3.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername3.setText("Username:");

        jlbUsername4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername4.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername4.setText("Password:");

        jlbUsername6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlbUsername6.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername6.setText("Details Account");

        jlbUsername1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername1.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername1.setText("ID:");

        jtfDisplayname1.setBackground(new java.awt.Color(31, 36, 42));
        jtfDisplayname1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfDisplayname1.setForeground(new java.awt.Color(255, 255, 255));
        jtfDisplayname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfDisplayname1.setCaretColor(new java.awt.Color(255, 255, 255));

        jtfUsername1.setBackground(new java.awt.Color(31, 36, 42));
        jtfUsername1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfUsername1.setForeground(new java.awt.Color(255, 255, 255));
        jtfUsername1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfUsername1.setCaretColor(new java.awt.Color(255, 255, 255));

        jbtCancle.setBackground(new java.awt.Color(152, 201, 45));
        jbtCancle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtCancle.setForeground(new java.awt.Color(21, 25, 28));
        jbtCancle.setText("Cancle");
        jbtCancle.setBorder(null);
        jbtCancle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCancle.setFocusPainted(false);
        jbtCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancleActionPerformed(evt);
            }
        });

        jlbUsername5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername5.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername5.setText("Reenter Password:");

        jtfReenterPassword1.setBackground(new java.awt.Color(31, 36, 42));
        jtfReenterPassword1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfReenterPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jtfReenterPassword1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfReenterPassword1.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDisplayname1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                                    .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtfPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfReenterPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jlbUsername6))
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbUsername5)
                            .addComponent(jlbUsername4)
                            .addComponent(jlbUsername1)
                            .addComponent(jlbUsername3)
                            .addComponent(jlbUsername2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jlbLogo)
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(36, 36, 36)
                        .addComponent(jlbUsername6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername1))
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDisplayname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername2))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername3))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername4))
                .addGap(20, 20, 20)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsername5)
                    .addComponent(jtfReenterPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOKActionPerformed

        try{
            int id = Integer.parseInt(jtfID.getText());
            String username =  jtfUsername1.getText();
            String displayname =  jtfDisplayname1.getText();
            String password =  jtfPassword.getText();
            String reenterpass = jtfReenterPassword1.getText();
            int type = 1;
            Account a = new Account(id, username, displayname, password, type);
            if(!password.equals(reenterpass))
                JOptionPane.showMessageDialog(jpnRoot, "Please Re-enter The Correct Password");
            else if(BLL_QLAccount.getInstance().CheckAccountByUsername(username)){
                JOptionPane.showMessageDialog(jpnRoot, "User Name Already Exist!!!");
            }
            else if(!BLL_QLAccount.getInstance().CheckAccountByUsername(username)){
                BLL_QLAccount.getInstance().AddAccount_BLL(a);
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(new AccountJPanel());
                jpnRoot.validate();
                jpnRoot.repaint();
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(jpnRoot, "Invalid information");
        }
    }//GEN-LAST:event_jbtOKActionPerformed

    private void jbtCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancleActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new AccountJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtCancleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtCancle;
    private javax.swing.JButton jbtOK;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbUsername1;
    private javax.swing.JLabel jlbUsername2;
    private javax.swing.JLabel jlbUsername3;
    private javax.swing.JLabel jlbUsername4;
    private javax.swing.JLabel jlbUsername5;
    private javax.swing.JLabel jlbUsername6;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JTextField jtfDisplayname1;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfReenterPassword1;
    private javax.swing.JTextField jtfUsername1;
    // End of variables declaration//GEN-END:variables
}
