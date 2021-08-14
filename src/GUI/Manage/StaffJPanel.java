/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Manage;

import BLL.BLL_QLAccount;
import GUI.Manage.ManageJPanel;
import BLL.BLL_QLStaff;
import DAL.DAL_QLStaff;
import DAL.DB_Helper;
import DTO.Staff;
import DTO.ViewStaff;
import GUI.MainJFrame;
import GUI.StaffMainJFrame;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author dophu
 */
public class StaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StaffJPanel
     */
    public StaffJPanel() {
        initComponents();
        GetStaff();
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
        jbtBack = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jbtSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbStaff = new javax.swing.JTable();
        jbtAdd = new javax.swing.JButton();
        jbtEdit = new javax.swing.JButton();
        jbtDelete = new javax.swing.JButton();
        jbtSort = new javax.swing.JButton();
        jcbbSort = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jtfSearch.setBackground(new java.awt.Color(31, 36, 42));
        jtfSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtfSearch.setForeground(new java.awt.Color(255, 255, 255));
        jtfSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfSearch.setCaretColor(new java.awt.Color(255, 255, 255));

        jbtSearch.setBackground(new java.awt.Color(31, 36, 42));
        jbtSearch.setForeground(new java.awt.Color(31, 36, 42));
        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-32.png"))); // NOI18N
        jbtSearch.setBorder(null);
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jtbStaff.setBackground(new java.awt.Color(31, 36, 42));
        jtbStaff.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtbStaff.setForeground(new java.awt.Color(169, 224, 49));
        jtbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Adress", "Phone", "Type", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbStaff);

        jbtAdd.setBackground(new java.awt.Color(31, 36, 42));
        jbtAdd.setForeground(new java.awt.Color(31, 36, 42));
        jbtAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-add-image-32.png"))); // NOI18N
        jbtAdd.setBorder(null);
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jbtEdit.setBackground(new java.awt.Color(31, 36, 42));
        jbtEdit.setForeground(new java.awt.Color(31, 36, 42));
        jbtEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-edit-32.png"))); // NOI18N
        jbtEdit.setBorder(null);
        jbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditActionPerformed(evt);
            }
        });

        jbtDelete.setBackground(new java.awt.Color(31, 36, 42));
        jbtDelete.setForeground(new java.awt.Color(31, 36, 42));
        jbtDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-delete-32.png"))); // NOI18N
        jbtDelete.setBorder(null);
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        jbtSort.setBackground(new java.awt.Color(31, 36, 42));
        jbtSort.setForeground(new java.awt.Color(31, 36, 42));
        jbtSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-sort-32.png"))); // NOI18N
        jbtSort.setBorder(null);
        jbtSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSortActionPerformed(evt);
            }
        });

        jcbbSort.setBackground(new java.awt.Color(31, 36, 42));
        jcbbSort.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbbSort.setForeground(new java.awt.Color(169, 224, 49));
        jcbbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Age", "Gender", "Phone", "Address", "Posstion" }));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 224, 49));
        jLabel1.setText("Add ");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 224, 49));
        jLabel2.setText("Edit ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 224, 49));
        jLabel3.setText("Delete ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 224, 49));
        jLabel4.setText("Sort");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 224, 49));
        jLabel5.setText("Search:");

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(303, 303, 303)
                        .addComponent(jlbLogo))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtSearch))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtAdd)
                                    .addComponent(jLabel1))
                                .addGap(124, 124, 124)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabel3))
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jbtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(114, 114, 114)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jbtSort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(1, 1, 1))
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtBack)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbtSearch))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jcbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jbtAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(226, 226, 226))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new ManageJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        try {
            String s = jtfSearch.getText();
            ArrayList<ViewStaff> ar = BLL_QLStaff.getInstance().GetListViewStaff(s);
            ShowList(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new ExcuteStaffJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtAddActionPerformed

    private void jbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditActionPerformed

        try {
            int row = jtbStaff.getSelectedRow();
            Object id = jtbStaff.getValueAt(row, 0);
            
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new ExcuteStaffJPanel(id.hashCode()));
            jpnRoot.validate();
            jpnRoot.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jpnRoot, "Please select row to edit!!!");
        }
    }//GEN-LAST:event_jbtEditActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed

        int[] row = jtbStaff.getSelectedRows();
        for (int i : row) {
            String id = jtbStaff.getModel().getValueAt(i, 0).toString();
            BLL_QLStaff.getInstance().DeleteStaff_BLL(id);
            BLL_QLAccount.getInstance().DeleteAccount_BLL(id);
        }
        ArrayList<ViewStaff> l = BLL_QLStaff.getInstance().GetListViewStaff();
        ShowList(l);
    }//GEN-LAST:event_jbtDeleteActionPerformed

    private void jbtSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSortActionPerformed
        ArrayList<ViewStaff> ar = BLL_QLStaff.getInstance().GetListViewStaff();
        int a = jcbbSort.getSelectedIndex();
        switch(a){
            case 0: {
                Collections.sort(ar, new Comparator<ViewStaff>(){
                @Override
                public int compare(ViewStaff o1, ViewStaff o2){
                    return o1.id.compareTo(o2.id);
                }
            });
                break;
            }
            case 1: {
                Collections.sort(ar, (o1, o2) -> o1.name.compareTo(o2.name));
                break;
            }
            case 2: {
                Collections.sort(ar, (o1, o2) -> o1.age.compareTo(o2.age));
                break;
            }
            case 3: {
                Collections.sort(ar, (o1, o2) -> o1.gender.compareTo(o2.gender));
                break;
            }
            case 4: {
                Collections.sort(ar, (o1, o2) -> o1.phone.compareTo(o2.phone));
                break;
            }
            case 5: {
                Collections.sort(ar, (o1, o2) -> o1.adress.compareTo(o2.adress));
                break;
            }
            default:{
                Collections.sort(ar, (o1, o2) -> o2.posstion.compareTo(o1.posstion));
                break;
            }
        }
        ShowList(ar);
    }//GEN-LAST:event_jbtSortActionPerformed

    private void ShowList(ArrayList<ViewStaff> ar){
        DefaultTableModel tableModel = (DefaultTableModel)jtbStaff.getModel();
        tableModel.setRowCount(0);
        Object[] RowData = new Object[7];
        for(int i=0; i<ar.size();i++){
                 RowData[0] = ar.get(i).id;
                 RowData[1] = ar.get(i).name;
                 RowData[2] = ar.get(i).age;
                 RowData[3] = ar.get(i).adress;
                 RowData[4] = ar.get(i).phone;
                 //RowData[5] = ar.get(i).posstion;
                 if(ar.get(i).posstion == 1) RowData[5] = "Bảo Vệ";
                 if(ar.get(i).posstion == 2) RowData[5] = "Thu Ngân";
                 if(ar.get(i).posstion == 3) RowData[5] = "Kế Toán";
                 RowData[6] = ar.get(i).gender;
                 
                 tableModel.addRow(RowData);
             }
    }
    private void GetStaff(){
       ArrayList<ViewStaff> l = BLL_QLStaff.getInstance().GetListViewStaff();
       ShowList(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtEdit;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JButton jbtSort;
    private javax.swing.JComboBox<String> jcbbSort;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JTable jtbStaff;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
