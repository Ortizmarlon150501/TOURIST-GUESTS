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
public class Register_Form extends javax.swing.JFrame {

    /**
     * Creates new form Register_Form
     */
    public Register_Form() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFistName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        pxtPassword = new javax.swing.JPasswordField();
        pxtRetypePass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jCheckBoxPlan = new javax.swing.JCheckBox();
        jCheckBox2Sport_Tourism = new javax.swing.JCheckBox();
        jCheckBox3Mountaineering = new javax.swing.JCheckBox();
        jCheckBox4Go_On_Excursions = new javax.swing.JCheckBox();
        jCheckBox5Hourse_Trips = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnSave_Regi = new javax.swing.JButton();
        btnDelete_Regi = new javax.swing.JButton();
        btnEdit_Regi = new javax.swing.JButton();
        btnStar_Regi = new javax.swing.JButton();
        btn_Update_Regi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("       REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 260, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 11, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 60));

        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 76, -1, -1));

        jLabel5.setText("Last Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 108, -1, -1));

        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 140, -1, -1));

        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 172, -1, -1));

        jLabel8.setText("Retype Pass:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 204, -1, -1));

        jLabel9.setText("Birth Date:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 229, -1, -1));

        jLabel10.setText("Address:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 254, -1, -1));
        jPanel1.add(txtFistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, -1));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, -1));

        pxtPassword.setText("jPasswordField1rrrrrrr");
        jPanel1.add(pxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, -1));

        pxtRetypePass.setText("jPasswordField2eeikddd");
        jPanel1.add(pxtRetypePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 160, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 260, 160, -1));

        jLabel11.setText("Cell Phone Number:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel12.setText(" Gender:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 160, -1));

        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jRadioButton2.setText("Feminine");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jRadioButton3.setText("Others");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jLabel13.setText("Recreational Activities:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 120, -1));

        jCheckBoxPlan.setText("Plan A Party.");
        jPanel1.add(jCheckBoxPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jCheckBox2Sport_Tourism.setText("Sports Tourism");
        jPanel1.add(jCheckBox2Sport_Tourism, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 110, -1));

        jCheckBox3Mountaineering.setText("Mountaineering ");
        jPanel1.add(jCheckBox3Mountaineering, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jCheckBox4Go_On_Excursions.setText("Go On Excursions");
        jPanel1.add(jCheckBox4Go_On_Excursions, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jCheckBox5Hourse_Trips.setText("Horse Trips");
        jPanel1.add(jCheckBox5Hourse_Trips, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave_Regi.setText("Save");
        btnSave_Regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_RegiActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, -1, 30));

        btnDelete_Regi.setText("Delete");
        btnDelete_Regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_RegiActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 24, -1, 30));

        btnEdit_Regi.setText("Edit");
        jPanel2.add(btnEdit_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 23, 60, 30));

        btnStar_Regi.setText("Start");
        jPanel2.add(btnStar_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 60, 30));

        btn_Update_Regi.setText("Update");
        jPanel2.add(btn_Update_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave_RegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_RegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave_RegiActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnDelete_RegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_RegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete_RegiActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete_Regi;
    private javax.swing.JButton btnEdit_Regi;
    private javax.swing.JButton btnSave_Regi;
    private javax.swing.JButton btnStar_Regi;
    private javax.swing.JButton btn_Update_Regi;
    private javax.swing.JCheckBox jCheckBox2Sport_Tourism;
    private javax.swing.JCheckBox jCheckBox3Mountaineering;
    private javax.swing.JCheckBox jCheckBox4Go_On_Excursions;
    private javax.swing.JCheckBox jCheckBox5Hourse_Trips;
    private javax.swing.JCheckBox jCheckBoxPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPasswordField pxtPassword;
    private javax.swing.JPasswordField pxtRetypePass;
    private javax.swing.JTextField txtFistName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
