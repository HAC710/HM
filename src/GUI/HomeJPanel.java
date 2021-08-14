
package GUI;

import BLL.BLL_BILL;
import BLL.BLL_QLRoom;
import DTO.Customer;
import DTO.MenuBill;
import DTO.MenuBillInfo;
import DTO.ViewRoom;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.security.x509.PolicyInformation;


public class HomeJPanel extends javax.swing.JPanel {
    JButton b;
//    JPanel jPanelRoom;
    DefaultListModel vegName;
    String  idRoom = "";
    public HomeJPanel() {
        initComponents();
        loadRoom();
        loadcbbxService();
        loadcbbxRoom();
        loadcbbCustomer();
    }
    public void loadcbbxRoom(){
        ArrayList<ViewRoom> l = BLL_QLRoom.getInstance().GetListViewRoom();
        for(ViewRoom v : l){
            ArrayList<MenuBill> list = BLL_BILL.getInstance().getListMenuBillsNow(v.id.toString());
            if(list.isEmpty()){
                jccbxRoom.addItem(v.id.toString());
            }
        }
    }
    public void loadcbbCustomer(){
        ArrayList<Customer> l = BLL.BLL_QLCustomer.getInstance().GetListCustomer_BLL();
        for(Customer v : l){  
            jccbxCustomer.addItem(String.valueOf(v.id + "/" + v.name));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jpnRoot = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jcbbxServices = new javax.swing.JComboBox<>();
        JBtnChoseService = new javax.swing.JButton();
        jSpinnernumber = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnPay = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        btnChangeRoom = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jccbxRoom = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        jccbxCustomer = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(169, 224, 49));
        jLabel14.setText("HVH Soft");

        jpnRoot.setBackground(new java.awt.Color(31, 36, 42));
        jpnRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 36, 42)));
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

        jPanel2.setBackground(new java.awt.Color(31, 36, 42));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 36, 42), 3));
        jPanel2.setForeground(new java.awt.Color(31, 36, 42));

        jPanel3.setBackground(new java.awt.Color(31, 36, 42));
        jPanel3.setForeground(new java.awt.Color(31, 36, 42));

        jcbbxServices.setBackground(new java.awt.Color(31, 36, 42));
        jcbbxServices.setForeground(new java.awt.Color(169, 224, 49));
        jcbbxServices.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBtnChoseService.setBackground(new java.awt.Color(31, 36, 42));
        JBtnChoseService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnChoseService.setForeground(new java.awt.Color(169, 224, 49));
        JBtnChoseService.setText("Choose");
        JBtnChoseService.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBtnChoseService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnChoseServiceActionPerformed(evt);
            }
        });

        jSpinnernumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSpinnernumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbbxServices, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnernumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBtnChoseService, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbbxServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnChoseService)
                    .addComponent(jSpinnernumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jList1.setBackground(new java.awt.Color(31, 36, 42));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 36, 42)));
        jList1.setForeground(new java.awt.Color(31, 36, 42));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        btnPay.setBackground(new java.awt.Color(31, 36, 42));
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPay.setForeground(new java.awt.Color(169, 224, 49));
        btnPay.setText("Pay");
        btnPay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnPrintBill.setBackground(new java.awt.Color(31, 36, 42));
        btnPrintBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrintBill.setForeground(new java.awt.Color(169, 224, 49));
        btnPrintBill.setText("Print Bill");
        btnPrintBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        btnChangeRoom.setBackground(new java.awt.Color(31, 36, 42));
        btnChangeRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangeRoom.setForeground(new java.awt.Color(169, 224, 49));
        btnChangeRoom.setText("Change");
        btnChangeRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeRoomActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(31, 36, 42));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(169, 224, 49));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jccbxRoom.setBackground(new java.awt.Color(31, 36, 42));
        jccbxRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jccbxRoom.setForeground(new java.awt.Color(169, 224, 49));

        btnCancel.setBackground(new java.awt.Color(31, 36, 42));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(169, 224, 49));
        btnCancel.setText("Cancel Bill");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jccbxCustomer.setBackground(new java.awt.Color(31, 36, 42));
        jccbxCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jccbxCustomer.setForeground(new java.awt.Color(169, 224, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 224, 49));
        jLabel1.setText("     Customer");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 224, 49));
        jLabel2.setLabelFor(jccbxRoom);
        jLabel2.setText("      Room");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(31, 36, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 36, 42), 3));
        jPanel1.setForeground(new java.awt.Color(31, 36, 42));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(353, 370, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(248, 248, 248))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(btnChangeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jccbxRoom, 0, 96, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jccbxCustomer, 0, 96, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jlbLogo)
                .addGap(556, 556, 556))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(1, 1, 1)))
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jccbxCustomer)
                                    .addComponent(jccbxRoom)))))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChangeRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPrintBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(48, 130, Short.MAX_VALUE))
        );

        jLabel7.getAccessibleContext().setAccessibleName("jlbHotelmanagemnet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 1441, Short.MAX_VALUE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeRoomActionPerformed
        try {
            String s[] = vegName.getElementAt(1).toString().replace(" ", "").split("ll");
            String idRoom = jccbxRoom.getSelectedItem().toString();
            BLL_BILL.getInstance().ChangeRoom(s[1], idRoom);
            loadPage();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnChangeRoomActionPerformed

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        String s[] = vegName.getElementAt(1).toString().replace(" ", "").split("ll");
        BLL_BILL.getInstance().pay(s[1]);
        loadPage();
    }//GEN-LAST:event_btnPayActionPerformed

    private void JBtnChoseServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnChoseServiceActionPerformed
        try {
            if(vegName == null || vegName.isEmpty() == true){
                String[] s = jccbxCustomer.getSelectedItem().toString().split("/");
                BLL_BILL.getInstance().createBill(idRoom, Integer.parseInt(s[0]));
            }
            else{
                String s[] = vegName.getElementAt(1).toString().replace(" ", "").split("ll");
                String idService = String.valueOf(jcbbxServices.getSelectedIndex());
                int number = Integer.parseInt(jSpinnernumber.getValue().toString());
                BLL_BILL.getInstance().addBillInfo(s[1],idService,number);
            }
            loadPage();
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
    }//GEN-LAST:event_JBtnChoseServiceActionPerformed
    public void loadPage(){
        showBill(idRoom);
        jPanel1.removeAll();
        loadRoom();
        jPanel1.validate();
        jPanel1.repaint();
    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        String s[] = vegName.getElementAt(1).toString().replace(" ", "").split("ll");
        BLL_BILL.getInstance().cancelBill(s[1]);
        loadPage();
    }//GEN-LAST:event_btnCancelActionPerformed
    public void loadcbbxService(){
        ArrayList<String> list = DAL.DB_Helper.getInstance().ListService();
        for(String s : list){
            jcbbxServices.addItem(s);
        }
    }        
    public void loadRoom(){
        jPanel1.setLayout(new GridLayout(5,10));
        ArrayList<ViewRoom> l = BLL_QLRoom.getInstance().GetListViewRoom();
        for(ViewRoom v : l){
            b = new JButton(v.id.toString());
            ArrayList<MenuBill> list = BLL_BILL.getInstance().getListMenuBillsNow(v.id.toString());
            if(list.isEmpty()){
                b.setBackground(Color.black);
                b.setForeground(Color.getHSBColor((float)0.25, (float)0.78, (float)0.87));
            }else{
                b.setBackground(Color.getHSBColor((float)0.25, (float)0.78, (float)0.87));
                b.setForeground(Color.black);
            }
            b.setSize(200, 200);
            b.addActionListener(new ButtonLisener());
            jPanel1.add(b);
        }
//        jPanel1.add(jPanelRoom);
//        jPanel1.validate();
//        jPanel1.repaint();
    }
    public class ButtonLisener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String[] list = e.toString().split("text=");
            String[] list1 = list[1].split(",");
            showBill(list1[0]);
            idRoom = list1[0];
        }
    }
    public void showBill(String idRoom){
        try {
            ArrayList<MenuBill> list = BLL_BILL.getInstance().getListMenuBillsNow(idRoom);
            ArrayList<MenuBillInfo> listBillInfos = BLL_BILL.getInstance().getListMenuBillInfosNow(idRoom);
            if(!list.isEmpty()){ 
                String Cusomer = String.format("%-15s %-15s", "Tên khách hàng: ",list.get(0).getNameCustomer());
                String idBill = String.format("%-15s %-15s", "Mã Bill", list.get(0).getIdBill());
                String TitleRP = String.format("%-15s %-15s", "Số phòng", "Giá");
                String RP = String.format("%-15s %-15s", list.get(0).getNumberRoom(), list.get(0).getPriceRoom());
                String Title = String.format("%-20s %-8s %-15s", "Service","Number", "SumMoney");
                vegName = new DefaultListModel();
                vegName.addElement(Cusomer);
                vegName.addElement(idBill);
                vegName.addElement(TitleRP);
                vegName.addElement(RP);
                vegName.addElement(Title);
                String service = "";
                if(!listBillInfos.isEmpty()){
                    for(MenuBillInfo mb : listBillInfos){
                        service = String.format("%-20s %-8s %-15s", mb.getNameService().toString(),mb.getNumber(), mb.getSumNumber());
                        vegName.addElement(service);
                    }
                }
                jList1.setFont(new Font("Serif", Font.BOLD, 20));
                jList1.setForeground(Color.getHSBColor((float)0.25, (float)0.78, (float)0.87));
                jList1.setModel(vegName);
                jTextField1.setText(String.valueOf(BLL_BILL.getInstance().establishSumMoney(idRoom,String.valueOf(list.get(0).getIdBill()))));
            }
            else{ 
                vegName.removeAllElements();
                jTextField1.setText("0");
            }
        } catch (Exception e) {  
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnChoseService;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangeRoom;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnernumber;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbbxServices;
    private javax.swing.JComboBox<String> jccbxCustomer;
    private javax.swing.JComboBox<String> jccbxRoom;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JPanel jpnRoot;
    // End of variables declaration//GEN-END:variables
}
