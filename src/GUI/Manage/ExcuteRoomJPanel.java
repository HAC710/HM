/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Manage;

import BLL.BLL_QLRoom;
import DTO.Room;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author lengo
 */
public class ExcuteRoomJPanel extends javax.swing.JPanel {

    public ExcuteRoomJPanel() {
        initComponents();
    }
    
    public ExcuteRoomJPanel(int id){
        initComponents();
        SetGUI(id);
        jtfID.disable();
    }
    
    private void SetGUI(int id){
        Room room = BLL_QLRoom.getInstance().GetRoomByID(id);
        
            jtfID.setText(String.valueOf(room.id));
            if(room.type) jrbNormal.doClick();
            else jrbVip.doClick(); 
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
        jbtOK = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jlbUsername1 = new javax.swing.JLabel();
        jlbUsername6 = new javax.swing.JLabel();
        jlbUsername8 = new javax.swing.JLabel();
        jrbNormal = new javax.swing.JRadioButton();
        jrbVip = new javax.swing.JRadioButton();
        jbtCancle = new javax.swing.JButton();

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

        jlbUsername6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlbUsername6.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername6.setText("Details Room");

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
                .addComponent(jlbLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbUsername8)
                    .addComponent(jlbUsername1))
                .addGap(42, 42, 42)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jrbNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbVip)
                        .addGap(347, 347, 347))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername1))
                .addGap(64, 64, 64)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbVip)
                    .addComponent(jrbNormal)
                    .addComponent(jlbUsername8))
                .addGap(117, 117, 117)
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
            boolean type = jrbNormal.isSelected();
            Room c = new Room(id, type);
            BLL_QLRoom.getInstance().ExcuteRoom_BLL(c);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(jpnRoot, "Invalid information");
        }
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new RoomJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtOKActionPerformed

    private void jbtCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancleActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new RoomJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtCancleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtCancle;
    private javax.swing.JButton jbtOK;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbUsername1;
    private javax.swing.JLabel jlbUsername6;
    private javax.swing.JLabel jlbUsername8;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JRadioButton jrbNormal;
    private javax.swing.JRadioButton jrbVip;
    private javax.swing.JTextField jtfID;
    // End of variables declaration//GEN-END:variables
}
