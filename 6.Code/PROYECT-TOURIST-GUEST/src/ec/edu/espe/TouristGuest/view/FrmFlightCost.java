/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jean Jaramillo
 */
public class FrmFlightCost extends javax.swing.JFrame {

    /**
     * Creates new form FrmFlightCost
     */
    public FrmFlightCost() {
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
        jButton3 = new javax.swing.JButton();
        TotalTravelCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CBCity = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtNumberOfPeople = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CBChildren = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtNumberChildren = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCancelFlightCost = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("Total Flight Cost:");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        TotalTravelCost.setEditable(false);
        TotalTravelCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalTravelCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalTravelCost, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(TotalTravelCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel9.setText("Choose your travel destination:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("FLIGHT COST");

        CBCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Brazil", "Bolivia", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela" }));
        CBCity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CBCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBCityMouseClicked(evt);
            }
        });
        CBCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCityActionPerformed(evt);
            }
        });

        jLabel14.setText("Number Of People Who Will Travel:");

        txtNumberOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfPeopleActionPerformed(evt);
            }
        });
        txtNumberOfPeople.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberOfPeopleKeyTyped(evt);
            }
        });

        jLabel16.setText("There Are Children Traveling With You:");

        CBChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes" }));
        CBChildren.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CBChildren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBChildrenMouseClicked(evt);
            }
        });
        CBChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBChildrenActionPerformed(evt);
            }
        });

        jLabel17.setText("How many children: in case it didn't say (0):");

        txtNumberChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberChildrenActionPerformed(evt);
            }
        });
        txtNumberChildren.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberChildrenKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Airplane_Grey_icon-icons.com_54909 (1).png"))); // NOI18N

        btnCancelFlightCost.setText("CANCEL");
        btnCancelFlightCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFlightCostActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(40, 40, 40)
                .addComponent(btnCancelFlightCost)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumberChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CBChildren, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumberOfPeople)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CBChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelFlightCost)
                    .addComponent(btnOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBCityMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_CBCityMouseClicked

    private void CBCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCityActionPerformed

    }//GEN-LAST:event_CBCityActionPerformed

    private void CBChildrenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBChildrenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CBChildrenMouseClicked

    private void CBChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBChildrenActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        int NumberOfPeople;
        int NumberChildren;
        float TotalCost;

        NumberOfPeople=Integer.parseInt(txtNumberOfPeople.getText());
        NumberChildren=Integer.parseInt(txtNumberChildren.getText());
        String option=(String)CBCity.getSelectedItem();
        String option1=(String)CBChildren.getSelectedItem();

        if(option.equals("Argentina") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*500+NumberChildren*100;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*500;
        }

        if(option.equals("Brazil") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*250+NumberChildren*110;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*250;
        }

        if(option.equals("Bolivia") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*300+NumberChildren*140;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*300;
        }

        if(option.equals("Chile") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*150+NumberChildren*150;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*150;
        }

        if(option.equals("Colombia") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*400+NumberChildren*120;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*400;
        }

        if(option.equals("Ecuador") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*0+NumberChildren*0;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*250;
        }

        if(option.equals("Paraguay") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*360+NumberChildren*100;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*360;
        }

        if(option.equals("Peru") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*700+NumberChildren*130;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*700;
        }

        if(option.equals("Uruguay") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*150+NumberChildren*140;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*150;
        }

        if(option.equals("Venezuela") && option1.equals("Yes")){
            TotalCost=NumberOfPeople*326+NumberChildren*150;;
            TotalTravelCost.setText(""+TotalCost);

        }
        else{
            TotalCost=NumberOfPeople*326;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void TotalTravelCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalTravelCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalTravelCostActionPerformed

    private void txtNumberOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfPeopleActionPerformed
        
        
        
    }//GEN-LAST:event_txtNumberOfPeopleActionPerformed

    private void txtNumberOfPeopleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberOfPeopleKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only numbers");
        }
    }//GEN-LAST:event_txtNumberOfPeopleKeyTyped

    private void txtNumberChildrenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberChildrenKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only numbers");
            
        }
        
        
    }//GEN-LAST:event_txtNumberChildrenKeyTyped

    private void txtNumberChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberChildrenActionPerformed

    private void btnCancelFlightCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFlightCostActionPerformed
        this.setVisible(false);
        new TouristsGuestMenu().setVisible(true);
    }//GEN-LAST:event_btnCancelFlightCostActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.setVisible(false);
        new TouristsGuestMenu().setVisible(true);                                     
        
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFlightCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFlightCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFlightCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFlightCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFlightCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBChildren;
    private javax.swing.JComboBox<String> CBCity;
    private javax.swing.JTextField TotalTravelCost;
    private javax.swing.JButton btnCancelFlightCost;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumberChildren;
    private javax.swing.JTextField txtNumberOfPeople;
    // End of variables declaration//GEN-END:variables
}
