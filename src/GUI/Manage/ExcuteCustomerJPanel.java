/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Manage;

import BLL.BLL_QLCustomer;
import DTO.Customer;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PHONG VU
 */
public class ExcuteCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExcuteCustomerJPanel
     */
    public ExcuteCustomerJPanel() {
        initComponents();
        jrbNormal.doClick();
        jrbMale.doClick();
    }

    public ExcuteCustomerJPanel(int id){
        initComponents();
        SetGUI(id);
        jtfID.disable();
    }
    private void SetGUI(int id){
        Customer customer = BLL_QLCustomer.getInstance().GetCustomerByID(id);
        
            jtfID.setText(String.valueOf(customer.id));
            jtfName.setText(customer.name);
            jtfAge.setText(String.valueOf(customer.age));
            jtfAdđress.setText(customer.adress);
            jtfPhone.setText(String.valueOf(customer.phone));
            if(customer.type) jrbNormal.doClick();
            else jrbVip.doClick();
            if(customer.gender) jrbMale.doClick();
            else jrbFemale.doClick();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbUsername7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpnRoot = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jbtOK = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jlbUsername1 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlbUsername2 = new javax.swing.JLabel();
        jtfAge = new javax.swing.JTextField();
        jlbUsername3 = new javax.swing.JLabel();
        jlbUsername4 = new javax.swing.JLabel();
        jlbUsername5 = new javax.swing.JLabel();
        jlbUsername6 = new javax.swing.JLabel();
        jtfAdđress = new javax.swing.JTextField();
        jtfPhone = new javax.swing.JTextField();
        jlbUsername8 = new javax.swing.JLabel();
        jrbNormal = new javax.swing.JRadioButton();
        jrbVip = new javax.swing.JRadioButton();
        jlbUsername9 = new javax.swing.JLabel();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        jbtCancle = new javax.swing.JButton();

        jlbUsername7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername7.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername7.setText("Type:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jlbUsername1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername1.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername1.setText("ID:");

        jtfName.setBackground(new java.awt.Color(31, 36, 42));
        jtfName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfName.setForeground(new java.awt.Color(255, 255, 255));
        jtfName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfName.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername2.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername2.setText("Name:");

        jtfAge.setBackground(new java.awt.Color(31, 36, 42));
        jtfAge.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfAge.setForeground(new java.awt.Color(255, 255, 255));
        jtfAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfAge.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername3.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername3.setText("Age:");

        jlbUsername4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername4.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername4.setText("Address:");

        jlbUsername5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername5.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername5.setText("Phone:");

        jlbUsername6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlbUsername6.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername6.setText("Details Customer");

        jtfAdđress.setBackground(new java.awt.Color(31, 36, 42));
        jtfAdđress.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfAdđress.setForeground(new java.awt.Color(255, 255, 255));
        jtfAdđress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfAdđress.setCaretColor(new java.awt.Color(255, 255, 255));

        jtfPhone.setBackground(new java.awt.Color(31, 36, 42));
        jtfPhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfPhone.setForeground(new java.awt.Color(255, 255, 255));
        jtfPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfPhone.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbUsername8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername8.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername8.setText("Type:");

        jrbNormal.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbNormal);
        jrbNormal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbNormal.setForeground(new java.awt.Color(169, 224, 49));
        jrbNormal.setText("Normal");

        jrbVip.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbVip);
        jrbVip.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbVip.setForeground(new java.awt.Color(169, 224, 49));
        jrbVip.setText("Vip");

        jlbUsername9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername9.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername9.setText("Gender:");

        jrbMale.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup2.add(jrbMale);
        jrbMale.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbMale.setForeground(new java.awt.Color(169, 224, 49));
        jrbMale.setText("Male");

        jrbFemale.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup2.add(jrbFemale);
        jrbFemale.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbFemale.setForeground(new java.awt.Color(169, 224, 49));
        jrbFemale.setText("Female");

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

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jlbUsername6)))
                .addGap(305, 305, 305)
                .addComponent(jlbLogo))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                        .addComponent(jlbUsername1)
                        .addGap(42, 42, 42)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbUsername2)
                            .addComponent(jlbUsername3)
                            .addComponent(jlbUsername4)
                            .addComponent(jlbUsername5)
                            .addComponent(jlbUsername8)
                            .addComponent(jlbUsername9))
                        .addGap(42, 42, 42)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAdđress, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbNormal)
                                    .addComponent(jrbMale))
                                .addGap(27, 27, 27)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbFemale)
                                    .addComponent(jrbVip))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername3))
                .addGap(7, 7, 7)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsername4)
                    .addComponent(jtfAdđress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername5))
                .addGap(10, 10, 10)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsername8)
                    .addComponent(jrbNormal)
                    .addComponent(jrbVip))
                .addGap(10, 10, 10)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMale)
                    .addComponent(jlbUsername9)
                    .addComponent(jrbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOKActionPerformed

        try{
            int id = Integer.parseInt(jtfID.getText());
            String name =  jtfName.getText();
            int age = Integer.parseInt(jtfAge.getText());
            String address =  jtfAdđress.getText();
            int phone = Integer.parseInt(jtfPhone.getText());
            boolean type = jrbNormal.isSelected();
            boolean gender = jrbMale.isSelected();
            Customer c = new Customer(id, name, age, address, phone, type, gender);
            BLL_QLCustomer.getInstance().ExcuteCustomer_BLL(c);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(jpnRoot, "Invalid information");
        }
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new CustomerJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtOKActionPerformed

    private void jbtCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancleActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new CustomerJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtCancleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtCancle;
    private javax.swing.JButton jbtOK;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbUsername1;
    private javax.swing.JLabel jlbUsername2;
    private javax.swing.JLabel jlbUsername3;
    private javax.swing.JLabel jlbUsername4;
    private javax.swing.JLabel jlbUsername5;
    private javax.swing.JLabel jlbUsername6;
    private javax.swing.JLabel jlbUsername7;
    private javax.swing.JLabel jlbUsername8;
    private javax.swing.JLabel jlbUsername9;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JRadioButton jrbNormal;
    private javax.swing.JRadioButton jrbVip;
    private javax.swing.JTextField jtfAdđress;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhone;
    // End of variables declaration//GEN-END:variables
}
