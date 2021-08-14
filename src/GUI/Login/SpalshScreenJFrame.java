
package GUI.Login;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

public class SpalshScreenJFrame extends javax.swing.JFrame {

    public SpalshScreenJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel_SoftZyd = new javax.swing.JLabel();
        jLabel_inven = new javax.swing.JLabel();
        loadingprogress = new javax.swing.JProgressBar();
        loadingnumber = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel_inven1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_SoftZyd.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel_SoftZyd.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_SoftZyd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N
        jLabel_SoftZyd.setText("HVH Soft");
        jLabel_SoftZyd.setToolTipText("");
        jPanel1.add(jLabel_SoftZyd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 314, -1));

        jLabel_inven.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel_inven.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven.setText("102190011@sv1.dut.udn.vn");
        jPanel1.add(jLabel_inven, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, 30));

        loadingprogress.setForeground(new java.awt.Color(169, 224, 49));
        loadingprogress.setBorderPainted(false);
        loadingprogress.setFocusable(false);
        loadingprogress.setRequestFocusEnabled(false);
        loadingprogress.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(loadingprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 470, 820, 40));

        loadingnumber.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        loadingnumber.setForeground(new java.awt.Color(169, 224, 49));
        loadingnumber.setText("99%");
        jPanel1.add(loadingnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Instagram_32px.png"))); // NOI18N
        jButton4.setToolTipText("Instagram");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Instagram_32px_3.png"))); // NOI18N
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 11, -1, 28));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Twitter_32px.png"))); // NOI18N
        jButton2.setToolTipText("Twitter");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Twitter_32px_2.png"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 28));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Facebook_32px_2.png"))); // NOI18N
        jButton3.setToolTipText("Facebook");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Facebook_32px_7.png"))); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, 28));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_YouTube_32px.png"))); // NOI18N
        jButton6.setToolTipText("YouTube");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_YouTube_32px_1.png"))); // NOI18N
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 11, -1, 28));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Secured_Letter_32px.png"))); // NOI18N
        jButton5.setToolTipText("Email");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Secured_Letter_32px_2.png"))); // NOI18N
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 11, -1, 28));

        jLabel_inven1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven1.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven1.setText("Hotel Management");
        jPanel1.add(jLabel_inven1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 320, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel_SoftZyd;
    private javax.swing.JLabel jLabel_inven;
    private javax.swing.JLabel jLabel_inven1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JLabel loadingnumber;
    public javax.swing.JProgressBar loadingprogress;
    // End of variables declaration//GEN-END:variables
}
