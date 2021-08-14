/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Manage;

import BLL.BLL_QLCustomer;
import BLL.BLL_QLRoom;
import DTO.Account;
import DTO.Room;
import DTO.ViewRoom;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoomJPanel extends javax.swing.JPanel {
    
    public String usn;

    public RoomJPanel() {
        
        initComponents();
        GetListRoom();
    }

    public RoomJPanel(String usn){
        
        initComponents();
        this.usn = usn;
        GetListRoom();
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
        jtbRoom = new javax.swing.JTable();
        jbtAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbbSort = new javax.swing.JComboBox<>();
        jbtDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtSort = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbtSearch = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();

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

        jtbRoom.setBackground(new java.awt.Color(31, 36, 42));
        jtbRoom.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtbRoom.setForeground(new java.awt.Color(169, 224, 49));
        jtbRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jtbRoom);

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
        jLabel1.setText("Add ");

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
        jLabel2.setText("Edit ");

        jcbbSort.setBackground(new java.awt.Color(31, 36, 42));
        jcbbSort.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbbSort.setForeground(new java.awt.Color(169, 224, 49));
        jcbbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Type" }));

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
        jLabel3.setText("Delete ");

        jbtSort.setBackground(new java.awt.Color(31, 36, 42));
        jbtSort.setForeground(new java.awt.Color(31, 36, 42));
        jbtSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-sort-32.png"))); // NOI18N
        jbtSort.setBorder(null);
        jbtSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSortActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 224, 49));
        jLabel4.setText("Sort");

        jbtSearch.setBackground(new java.awt.Color(31, 36, 42));
        jbtSearch.setForeground(new java.awt.Color(31, 36, 42));
        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-32.png"))); // NOI18N
        jbtSearch.setBorder(null);
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jtfSearch.setBackground(new java.awt.Color(31, 36, 42));
        jtfSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtfSearch.setForeground(new java.awt.Color(255, 255, 255));
        jtfSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfSearch.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jbtAdd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel3))
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jbtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(124, 124, 124)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addComponent(jbtSort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jcbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSearch)))
                .addGap(122, 122, 122)
                .addComponent(jlbLogo))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(385, 385, 385))
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
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jpnRootLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jbtBack)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtSearch)
                                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtAdd)
                            .addComponent(jbtEdit)
                            .addComponent(jbtDelete)
                            .addComponent(jbtSort)))
                    .addComponent(jcbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        Account account = BLL_QLCustomer.getInstance().GetAccount_BLL(usn);
        if(account.type == 1){
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new ManageJPanel());
            jpnRoot.validate();
            jpnRoot.repaint();
        }
        if(account.type == 2){
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new StaffManageJPanel());
            jpnRoot.validate();
            jpnRoot.repaint();
        }
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new ExcuteRoomJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtAddActionPerformed

    private void jbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditActionPerformed

        try {
            int row = jtbRoom.getSelectedRow();
            Object id = jtbRoom.getValueAt(row, 0);
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new ExcuteRoomJPanel(id.hashCode()));
            jpnRoot.validate();
            jpnRoot.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jpnRoot, "Please select row to edit!!!");
        }
    }//GEN-LAST:event_jbtEditActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed

        int[] row = jtbRoom.getSelectedRows();
        for (int i : row) {
            String id = jtbRoom.getModel().getValueAt(i, 0).toString();
            BLL_QLRoom.getInstance().DeleteRoom_BLL(id);
        }
        GetListRoom();
    }//GEN-LAST:event_jbtDeleteActionPerformed

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        try {
            String s = jtfSearch.getText();
            ArrayList<ViewRoom> ar = BLL_QLRoom.getInstance().GetListViewRoom(s);
            ShowList(ar);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jbtSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSortActionPerformed
        ArrayList<ViewRoom> ar = BLL_QLRoom.getInstance().GetListViewRoom();
        int a = jcbbSort.getSelectedIndex();
        switch(a){
            case 0: {
                Collections.sort(ar, new Comparator<ViewRoom>(){
                @Override
                public int compare(ViewRoom o1, ViewRoom o2){
                    return o1.id.compareTo(o2.id);
                }
            });
                break;
            }
            default:{
                Collections.sort(ar, (o1, o2) -> o2.type.compareTo(o1.type));
                break;
            }
        }
        ShowList(ar);
    }//GEN-LAST:event_jbtSortActionPerformed

    private void ShowList(ArrayList<ViewRoom> ar){
        DefaultTableModel tableModel = (DefaultTableModel)jtbRoom.getModel();
        tableModel.setRowCount(0);
        Object[] RowData = new Object[7];
        for(int i=0; i<ar.size();i++){
                 RowData[0] = ar.get(i).id;
                 RowData[1] = ar.get(i).type;
                 tableModel.addRow(RowData);
             }
    }
    
    private void GetListRoom(){
       ArrayList<ViewRoom> l = BLL_QLRoom.getInstance().GetListViewRoom();
       ShowList(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTable jtbRoom;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
