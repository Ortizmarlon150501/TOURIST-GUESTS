/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Login_Tourist_Guest extends javax.swing.JFrame {

    /**
     * Creates new form Login_Tourist_Guest
     */
    public Login_Tourist_Guest() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pxtPassword = new javax.swing.JPasswordField();
        btcEnter = new javax.swing.JButton();
        btnCreate_new_user = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME A TOURSIT-GUEST");
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Please login to your account");
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));
        jpIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 76, -1, 90));
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 30, 20));

        jLabel3.setText("Username:");
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, 30));
        jpIngreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 30, 20));

        jLabel4.setText("Password:");
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 60, 30));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jpIngreso.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 180, 40));

        pxtPassword.setText("jPasswordField1");
        pxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pxtPasswordActionPerformed(evt);
            }
        });
        jpIngreso.add(pxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, 40));

        btcEnter.setText("Enter");
        btcEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcEnterActionPerformed(evt);
            }
        });
        jpIngreso.add(btcEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 100, -1));

        btnCreate_new_user.setText("Create new user");
        btnCreate_new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate_new_userActionPerformed(evt);
            }
        });
        jpIngreso.add(btnCreate_new_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jButton2.setText("All Records");
        jpIngreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close_icon.jpeg"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIngreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize_icono.jpeg"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIngreso.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void pxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pxtPasswordActionPerformed

    private void btcEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcEnterActionPerformed

    private void btnCreate_new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate_new_userActionPerformed

    }//GEN-LAST:event_btnCreate_new_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Tourist_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Tourist_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Tourist_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Tourist_Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Tourist_Guest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcEnter;
    private javax.swing.JButton btnCreate_new_user;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JPasswordField pxtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
