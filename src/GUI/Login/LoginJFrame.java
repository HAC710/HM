
package GUI.Login;

import BLL.BLL_QLAccount;
import BLL.BLL_QLCustomer;
import GUI.MainJFrame;
import GUI.Manage.AccountJPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import GUI.StaffMainJFrame;
import com.sun.tools.javac.comp.Enter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginJFrame extends javax.swing.JFrame {
    
    public LoginJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jpnRChangePassword.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jtfUsername = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jbtForgetPassword = new javax.swing.JButton();
        jlbImageUser = new javax.swing.JLabel();
        jbtTwitch = new javax.swing.JButton();
        jbtFacebook = new javax.swing.JButton();
        jbtInstagram = new javax.swing.JButton();
        jbtEmail = new javax.swing.JButton();
        jbtYoutube = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbUsername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpnView = new javax.swing.JPanel();
        jbtClose = new javax.swing.JButton();
        jbtHide = new javax.swing.JButton();
        jLabel_SoftZyd = new javax.swing.JLabel();
        jLabel_inven = new javax.swing.JLabel();
        jpnRChangePassword = new javax.swing.JPanel();
        jtfPhoneNumber = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jlbPhoneNumber = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jbtBack = new javax.swing.JButton();
        jbtSubmit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jpfConfirmPassword = new javax.swing.JPasswordField();
        jpfNewPassword = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jbtSignIn = new javax.swing.JButton();
        jlbconnect = new javax.swing.JLabel();
        jcbShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpnRoot.setBackground(new java.awt.Color(21, 25, 28));
        jpnRoot.setForeground(new java.awt.Color(255, 255, 255));
        jpnRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfUsername.setBackground(new java.awt.Color(31, 36, 42));
        jtfUsername.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jtfUsername.setForeground(new java.awt.Color(169, 221, 48));
        jtfUsername.setText("lengochai");
        jtfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfUsername.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfUsernameMouseMoved(evt);
            }
        });
        jpnRoot.add(jtfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 205, 260, 40));

        jpfPassword.setBackground(new java.awt.Color(31, 36, 42));
        jpfPassword.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jpfPassword.setForeground(new java.awt.Color(169, 221, 48));
        jpfPassword.setText("hai");
        jpfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jpfPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jpfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfPasswordKeyPressed(evt);
            }
        });
        jpnRoot.add(jpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 305, 260, 40));

        jbtForgetPassword.setBackground(new java.awt.Color(169, 224, 49));
        jbtForgetPassword.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jbtForgetPassword.setForeground(new java.awt.Color(169, 224, 49));
        jbtForgetPassword.setText("Forget Password?");
        jbtForgetPassword.setBorder(null);
        jbtForgetPassword.setBorderPainted(false);
        jbtForgetPassword.setContentAreaFilled(false);
        jbtForgetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtForgetPassword.setRequestFocusEnabled(false);
        jbtForgetPassword.setVerifyInputWhenFocusTarget(false);
        jbtForgetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtForgetPasswordActionPerformed(evt);
            }
        });
        jpnRoot.add(jbtForgetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 140, 30));

        jlbImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Shield_100px.png"))); // NOI18N
        jpnRoot.add(jlbImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jbtTwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Twitter_32px.png"))); // NOI18N
        jbtTwitch.setToolTipText("Twitter");
        jbtTwitch.setBorder(null);
        jbtTwitch.setBorderPainted(false);
        jbtTwitch.setContentAreaFilled(false);
        jbtTwitch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Twitter_32px_2.png"))); // NOI18N
        jpnRoot.add(jbtTwitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 28));

        jbtFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Facebook_32px_2.png"))); // NOI18N
        jbtFacebook.setToolTipText("Facebook");
        jbtFacebook.setBorder(null);
        jbtFacebook.setBorderPainted(false);
        jbtFacebook.setContentAreaFilled(false);
        jbtFacebook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Facebook_32px_7.png"))); // NOI18N
        jpnRoot.add(jbtFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, 28));

        jbtInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Instagram_32px.png"))); // NOI18N
        jbtInstagram.setToolTipText("Instagram");
        jbtInstagram.setBorder(null);
        jbtInstagram.setBorderPainted(false);
        jbtInstagram.setContentAreaFilled(false);
        jbtInstagram.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Instagram_32px_3.png"))); // NOI18N
        jpnRoot.add(jbtInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 11, -1, 28));

        jbtEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Secured_Letter_32px.png"))); // NOI18N
        jbtEmail.setToolTipText("Email");
        jbtEmail.setBorder(null);
        jbtEmail.setBorderPainted(false);
        jbtEmail.setContentAreaFilled(false);
        jbtEmail.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Secured_Letter_32px_2.png"))); // NOI18N
        jpnRoot.add(jbtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 11, -1, 28));

        jbtYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_YouTube_32px.png"))); // NOI18N
        jbtYoutube.setToolTipText("YouTube");
        jbtYoutube.setBorder(null);
        jbtYoutube.setBorderPainted(false);
        jbtYoutube.setContentAreaFilled(false);
        jbtYoutube.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_YouTube_32px_1.png"))); // NOI18N
        jpnRoot.add(jbtYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 11, -1, 28));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 224, 49));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Lock_35px.png"))); // NOI18N
        jpnRoot.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 45));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 224, 49));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Male_User_35px.png"))); // NOI18N
        jpnRoot.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 45));

        jlbUsername.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername.setText("Username");
        jpnRoot.add(jlbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 80, -1));
        jpnRoot.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 150, 0));

        jpnView.setBackground(new java.awt.Color(31, 36, 42));
        jpnView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_32px.png"))); // NOI18N
        jbtClose.setToolTipText("Close");
        jbtClose.setBorder(null);
        jbtClose.setBorderPainted(false);
        jbtClose.setContentAreaFilled(false);
        jbtClose.setRequestFocusEnabled(false);
        jbtClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_30px_3.png"))); // NOI18N
        jbtClose.setVerifyInputWhenFocusTarget(false);
        jbtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCloseActionPerformed(evt);
            }
        });
        jpnView.add(jbtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 40));

        jbtHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_32px_1.png"))); // NOI18N
        jbtHide.setToolTipText("Minimize");
        jbtHide.setBorder(null);
        jbtHide.setBorderPainted(false);
        jbtHide.setContentAreaFilled(false);
        jbtHide.setFocusPainted(false);
        jbtHide.setRequestFocusEnabled(false);
        jbtHide.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_30px_3.png"))); // NOI18N
        jbtHide.setVerifyInputWhenFocusTarget(false);
        jbtHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtHideMouseClicked(evt);
            }
        });
        jpnView.add(jbtHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 40));

        jLabel_SoftZyd.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel_SoftZyd.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_SoftZyd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N
        jLabel_SoftZyd.setText("HVH Soft");
        jpnView.add(jLabel_SoftZyd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 320, -1));

        jLabel_inven.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven.setText("  Hotel Management");
        jpnView.add(jLabel_inven, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 370, 50));

        jpnRChangePassword.setBackground(new java.awt.Color(31, 36, 42));
        jpnRChangePassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfPhoneNumber.setBackground(new java.awt.Color(31, 36, 42));
        jtfPhoneNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jtfPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        jtfPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfPhoneNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPhoneNumberKeyPressed(evt);
            }
        });
        jpnRChangePassword.add(jtfPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 40));

        jtfEmail.setBackground(new java.awt.Color(31, 36, 42));
        jtfEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jtfEmail.setForeground(new java.awt.Color(255, 255, 255));
        jtfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jpnRChangePassword.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 330, 40));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(169, 224, 49));
        jLabel12.setText(" Hotel Management");
        jpnRChangePassword.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, -1));

        jlbPhoneNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jlbPhoneNumber.setForeground(new java.awt.Color(169, 224, 49));
        jlbPhoneNumber.setText("PhoneNumber");
        jpnRChangePassword.add(jlbPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 20));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(169, 224, 49));
        jLabel18.setText("Password");
        jpnRChangePassword.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 314, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(169, 224, 49));
        jLabel17.setText("Confirm Password");
        jpnRChangePassword.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 314, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(169, 224, 49));
        jLabel16.setText("Email");
        jpnRChangePassword.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 314, -1));

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
        jpnRChangePassword.add(jbtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 110, -1));

        jbtSubmit.setBackground(new java.awt.Color(152, 201, 45));
        jbtSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtSubmit.setForeground(new java.awt.Color(21, 25, 28));
        jbtSubmit.setText("Submit");
        jbtSubmit.setBorder(null);
        jbtSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSubmit.setFocusPainted(false);
        jbtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSubmitActionPerformed(evt);
            }
        });
        jpnRChangePassword.add(jbtSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 330, 40));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 224, 49));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N
        jLabel13.setText("HVH Soft");
        jpnRChangePassword.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 310, -1));

        jpfConfirmPassword.setBackground(new java.awt.Color(31, 36, 42));
        jpfConfirmPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jpfConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpfConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jpfConfirmPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jpnRChangePassword.add(jpfConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 330, 40));

        jpfNewPassword.setBackground(new java.awt.Color(31, 36, 42));
        jpfNewPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jpfNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpfNewPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jpfNewPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jpnRChangePassword.add(jpfNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 330, 40));

        jpnView.add(jpnRChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, 560));

        jpnRoot.add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 450, 620));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(169, 224, 49));
        jLabel20.setText("Password");
        jpnRoot.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, -1));

        jbtSignIn.setBackground(new java.awt.Color(152, 201, 45));
        jbtSignIn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtSignIn.setForeground(new java.awt.Color(21, 25, 28));
        jbtSignIn.setText("Sign In");
        jbtSignIn.setBorder(null);
        jbtSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSignIn.setFocusPainted(false);
        jbtSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSignInActionPerformed(evt);
            }
        });
        jpnRoot.add(jbtSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 260, 40));

        jlbconnect.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jlbconnect.setForeground(new java.awt.Color(169, 224, 49));
        jlbconnect.setText("Connect with us on");
        jpnRoot.add(jlbconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, 20));

        jcbShowPassword.setBackground(new java.awt.Color(21, 25, 28));
        jcbShowPassword.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jcbShowPassword.setForeground(new java.awt.Color(169, 224, 49));
        jcbShowPassword.setText(" Show Password");
        jcbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbShowPasswordActionPerformed(evt);
            }
        });
        jpnRoot.add(jcbShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsernameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameMouseMoved

    }//GEN-LAST:event_jtfUsernameMouseMoved

    private void jbtForgetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtForgetPasswordActionPerformed
                jLabel_SoftZyd.setVisible(false);
                jLabel_inven.setVisible(false);
                jpnRChangePassword.setVisible(true);
    }//GEN-LAST:event_jbtForgetPasswordActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        jpnRChangePassword.setVisible(false);
        jLabel_SoftZyd.setVisible(true);
        jLabel_inven.setVisible(true);
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSignInActionPerformed
        try {
        String usn = jtfUsername.getText();
        String pw = jpfPassword.getText();
         
        if(BLL_QLCustomer.getInstance().CheckAccount_BLL(usn, pw)){
            if(BLL_QLCustomer.getInstance().GetTypeAccount_BLL(usn) == 1){
                BLL_QLAccount.getInstance().AddHistoryLogin_BLL(usn, 1);
                new MainJFrame(usn).setVisible(true);
            }
            else {
                BLL_QLAccount.getInstance().AddHistoryLogin_BLL(usn, 2);
                new StaffMainJFrame(jtfUsername.getText()).setVisible(true);
            }
        }
        else JOptionPane.showMessageDialog(rootPane, "Username or Password does not match!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Username or Password does not match!!!");
        }
    }//GEN-LAST:event_jbtSignInActionPerformed

    private void jbtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtSubmitActionPerformed

    private void jbtHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHideMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jbtHideMouseClicked

    private void jcbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbShowPasswordActionPerformed
        if(jcbShowPassword.isSelected())
            {
                jpfPassword.setEchoChar((char)0);
            }
            else
            {
                jpfPassword.setEchoChar('*');
            }
    }//GEN-LAST:event_jcbShowPasswordActionPerformed

    private void jpfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPasswordKeyPressed
        try {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String usn = jtfUsername.getText();
        String pw = jpfPassword.getText();
        if(BLL_QLCustomer.getInstance().CheckAccount_BLL(usn, pw)){
            if(BLL_QLCustomer.getInstance().GetTypeAccount_BLL(usn) > 0){
                new MainJFrame(usn).setVisible(true);
            }
            else {
                new StaffMainJFrame(jtfUsername.getText()).setVisible(true);
            }
        }
        else JOptionPane.showMessageDialog(rootPane, "Username or Password does not match!!!");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Username or Password does not match!!!");
        }
    }//GEN-LAST:event_jpfPasswordKeyPressed

    private void jtfPhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPhoneNumberKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            jtfPhoneNumber.setEditable(true);
        }
        else {
            jtfPhoneNumber.setEditable(false);
        }
    }//GEN-LAST:event_jtfPhoneNumberKeyPressed

    private void jbtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtCloseActionPerformed
    public void setLocationRelativeTo(Component c)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        Dimension windowSize = getSize();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        setLocation(dx, dy);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_SoftZyd;
    private javax.swing.JLabel jLabel_inven;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtClose;
    private javax.swing.JButton jbtEmail;
    private javax.swing.JButton jbtFacebook;
    private javax.swing.JButton jbtForgetPassword;
    private javax.swing.JButton jbtHide;
    private javax.swing.JButton jbtInstagram;
    private javax.swing.JButton jbtSignIn;
    private javax.swing.JButton jbtSubmit;
    private javax.swing.JButton jbtTwitch;
    private javax.swing.JButton jbtYoutube;
    private javax.swing.JCheckBox jcbShowPassword;
    private javax.swing.JLabel jlbImageUser;
    private javax.swing.JLabel jlbPhoneNumber;
    private javax.swing.JLabel jlbUsername;
    private javax.swing.JLabel jlbconnect;
    private javax.swing.JPasswordField jpfConfirmPassword;
    private javax.swing.JPasswordField jpfNewPassword;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JPanel jpnRChangePassword;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfPhoneNumber;
    private javax.swing.JTextField jtfUsername;
    // End of variables declaration//GEN-END:variables
}
