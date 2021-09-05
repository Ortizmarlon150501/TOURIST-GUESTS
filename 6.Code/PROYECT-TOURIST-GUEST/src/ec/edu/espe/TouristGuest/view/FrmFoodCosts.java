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
public class FrmFoodCosts extends javax.swing.JFrame {

    /**
     * Creates new form FrmFoodCosts
     */
    public FrmFoodCosts() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelFlightCost = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CBCountryResidence = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtMaketBasket = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumberOfPeop = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("FOOD COST");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/-meal_89750.png"))); // NOI18N

        btnCancelFlightCost.setText("CANCEL");
        btnCancelFlightCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFlightCostActionPerformed(evt);
            }
        });

        jLabel9.setText("Destination Residence:");

        CBCountryResidence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Brazil", "Bolivia", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela" }));
        CBCountryResidence.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CBCountryResidence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBCountryResidenceMouseClicked(evt);
            }
        });
        CBCountryResidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCountryResidenceActionPerformed(evt);
            }
        });

        jButton1.setText("Basic Food Basket:");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txtMaketBasket.setEditable(false);

        jLabel3.setText("Numbers Of People");

        txtNumberOfPeop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberOfPeopKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBCountryResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberOfPeop, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaketBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelFlightCost)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBCountryResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumberOfPeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaketBasket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnCancelFlightCost)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelFlightCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFlightCostActionPerformed
        this.setVisible(false);
        new TouristsGuestMenu().setVisible(true);
    }//GEN-LAST:event_btnCancelFlightCostActionPerformed

    private void CBCountryResidenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBCountryResidenceMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_CBCountryResidenceMouseClicked

    private void CBCountryResidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCountryResidenceActionPerformed

    }//GEN-LAST:event_CBCountryResidenceActionPerformed

    private void txtNumberOfPeopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberOfPeopKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only numbers");
            
        }
    }//GEN-LAST:event_txtNumberOfPeopKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int NumbersOfPeople;
        float TotalCost;

        NumbersOfPeople=Integer.parseInt(txtNumberOfPeop.getText());
        String option=(String)CBCountryResidence.getSelectedItem();
        
        if(option.equals("Argentina")){
            TotalCost=NumbersOfPeople*350;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Brazil")){
            TotalCost=NumbersOfPeople*361;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Bolivia")){
            TotalCost=NumbersOfPeople*365;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Chile")){
            TotalCost=NumbersOfPeople*320;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Colombia")){
            TotalCost=NumbersOfPeople*280;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Ecuador")){
            TotalCost=NumbersOfPeople*350;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Paraguay")){
            TotalCost=NumbersOfPeople*290;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Peru")){
            TotalCost=NumbersOfPeople*285;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Uruguay")){
            TotalCost=NumbersOfPeople*264;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
        if(option.equals("Venezuela")){
            TotalCost=NumbersOfPeople*240;;
            txtMaketBasket.setText(""+TotalCost);
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(FrmFoodCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFoodCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFoodCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFoodCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFoodCosts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCountryResidence;
    private javax.swing.JButton btnCancelFlightCost;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMaketBasket;
    private javax.swing.JTextField txtNumberOfPeop;
    // End of variables declaration//GEN-END:variables
}
