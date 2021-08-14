/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Manage;

import BLL.BLL_QLAccount;
import BLL.BLL_QLStaff;
import DTO.Account;
import DTO.Staff;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dophu
 */
public class ExcuteStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExcuteStaffJPanel
     */
    public ExcuteStaffJPanel() {
        initComponents();
        jrbMale.doClick();
    }
    
    public ExcuteStaffJPanel(int id){
        initComponents();
        SetGUI(id);
        jtfID.disable();
        jPosstion.disable();
    }
    
    private void SetGUI(int id){
        Staff Staff = BLL_QLStaff.getInstance().GetStaffByID(id);
        
            jtfID.setText(String.valueOf(Staff.id));
            jtfName.setText(Staff.name);
            jtfAge.setText(String.valueOf(Staff.age));
            jtfAdđress.setText(Staff.adress);
            jtfPhone.setText(String.valueOf(Staff.phone));
            jPosstion.setSelectedItem(Staff.posstion);
            if(Staff.gender) jrbMale.doClick();
            else jrbFemale.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jlbUsername9 = new javax.swing.JLabel();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        jbtCancle = new javax.swing.JButton();
        jPosstion = new javax.swing.JComboBox<>();

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
        jlbUsername6.setText("Details Staff");
        jlbUsername6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        jlbUsername8.setText("Posstion:");

        jlbUsername9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername9.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername9.setText("Gender:");

        jrbMale.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbMale);
        jrbMale.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbMale.setForeground(new java.awt.Color(169, 224, 49));
        jrbMale.setText("Male");

        jrbFemale.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbFemale);
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

        jPosstion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPosstion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bảo Vệ", "Thu Ngân", "Kế Toán" }));

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(340, 340, 340)
                        .addComponent(jlbUsername6)))
                .addGap(305, 305, 305)
                .addComponent(jlbLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jrbMale)
                                .addGap(61, 61, 61)
                                .addComponent(jrbFemale))
                            .addComponent(jPosstion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addComponent(jlbUsername1)
                                .addGap(42, 42, 42)
                                .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbUsername6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jlbUsername8))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPosstion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 819, Short.MAX_VALUE)
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
        boolean check = false;
        
        int id = Integer.parseInt(jtfID.getText());
        String name =  jtfName.getText();
        int age = Integer.parseInt(jtfAge.getText());
        String address =  jtfAdđress.getText();
        int phone = Integer.parseInt(jtfPhone.getText());
        int posstion = jPosstion.getSelectedIndex() + 1;
        boolean gender = jrbMale.isSelected();       
        Staff d = new Staff(id, name, age, address, phone, posstion, gender);
        
        if(BLL_QLStaff.getInstance().CheckStaffByID(d)){
            check = true;
        }
           
        if(!check){
            if(posstion == 1){
                BLL_QLStaff.getInstance().AddStaff_BLL(d);
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(new StaffJPanel());
                jpnRoot.validate();
                jpnRoot.repaint();
            }
            else if(BLL_QLAccount.getInstance().GetAccountByID(id).id != id){
                int x = JOptionPane.showConfirmDialog(null, "Please Add Staff Account", "Notification", 1);
                if(x == JOptionPane.OK_OPTION)
                {
                    Object displayname = jtfName.getText();
                    Object idAcount = Integer.parseInt(jtfID.getText());
                    jpnRoot.removeAll();
                    jpnRoot.setLayout(new BorderLayout());
                    jpnRoot.add(new ExcuteAccountJPanel(displayname.toString(), idAcount.hashCode()));
                    jpnRoot.validate();
                    jpnRoot.repaint();
            
                    BLL_QLStaff.getInstance().AddStaff_BLL(d);
                }                
                else
                {
                    JOptionPane.showMessageDialog(null, "Add Failed Staff!!!");
                }      
            }
            else{
                JOptionPane.showMessageDialog(null, "Id Already Exists\n Please Enter Another Id");
            }
              
        }
        else
        {
            BLL_QLStaff.getInstance().EditStaff_BLL(d);
            BLL_QLAccount.getInstance().UpdateAccountStaff_BLL(name, id);
            jpnRoot.removeAll();
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new StaffJPanel());
            jpnRoot.validate();
            jpnRoot.repaint();
        }
      } catch(Exception e){
            JOptionPane.showMessageDialog(jpnRoot, "Invalid information");
        }

    }//GEN-LAST:event_jbtOKActionPerformed

    private void jbtCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancleActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new StaffJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtCancleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jPosstion;
    private javax.swing.JButton jbtCancle;
    private javax.swing.JButton jbtOK;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbUsername1;
    private javax.swing.JLabel jlbUsername2;
    private javax.swing.JLabel jlbUsername3;
    private javax.swing.JLabel jlbUsername4;
    private javax.swing.JLabel jlbUsername5;
    private javax.swing.JLabel jlbUsername6;
    private javax.swing.JLabel jlbUsername8;
    private javax.swing.JLabel jlbUsername9;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JTextField jtfAdđress;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhone;
    // End of variables declaration//GEN-END:variables
}
