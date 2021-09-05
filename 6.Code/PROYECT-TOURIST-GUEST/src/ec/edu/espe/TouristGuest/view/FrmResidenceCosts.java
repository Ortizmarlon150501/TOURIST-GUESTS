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
public class FrmResidenceCosts extends javax.swing.JFrame {

    /**
     * Creates new form FrmResidenceCosts
     */
    public FrmResidenceCosts() {
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
        jLabel9 = new javax.swing.JLabel();
        CBCountryResidence = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCancelFlightCost = new javax.swing.JButton();
        txtNumbersOfGuests = new javax.swing.JTextField();
        txtCostInHotel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTimeOfResidence = new javax.swing.JTextField();
        txtCostInDepa = new javax.swing.JTextField();
        txtCostInHome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnHotel = new javax.swing.JButton();
        btnDepa = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("RESIDENCE COST");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_243.png"))); // NOI18N

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

        jLabel4.setText("Number Of Guests:");

        btnCancelFlightCost.setText("CANCEL");
        btnCancelFlightCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFlightCostActionPerformed(evt);
            }
        });

        txtNumbersOfGuests.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumbersOfGuestsKeyTyped(evt);
            }
        });

        txtCostInHotel.setEditable(false);

        jLabel6.setText("Residence Time In Months:");

        txtTimeOfResidence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimeOfResidenceKeyTyped(evt);
            }
        });

        txtCostInDepa.setEditable(false);

        txtCostInHome.setEditable(false);

        jLabel3.setText("Total Cost Of Residence in:");

        btnHotel.setText("Hotel:");
        btnHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHotelMouseClicked(evt);
            }
        });

        btnDepa.setText("Departament:");
        btnDepa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepaMouseClicked(evt);
            }
        });

        btnHome.setText("Home:");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(46, 46, 46)
                .addComponent(btnCancelFlightCost)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBCountryResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumbersOfGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimeOfResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 86, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDepa)
                                    .addComponent(btnHotel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnHome)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCostInHome, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(txtCostInHotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(txtCostInDepa, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBCountryResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNumbersOfGuests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTimeOfResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostInHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHotel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostInDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepa))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostInHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelFlightCost)
                    .addComponent(btnOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBCountryResidenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBCountryResidenceMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_CBCountryResidenceMouseClicked

    private void CBCountryResidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCountryResidenceActionPerformed

    }//GEN-LAST:event_CBCountryResidenceActionPerformed

    private void btnCancelFlightCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFlightCostActionPerformed
        this.setVisible(false);
        new TouristsGuestMenu().setVisible(true);
    }//GEN-LAST:event_btnCancelFlightCostActionPerformed

    private void txtNumbersOfGuestsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumbersOfGuestsKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only numbers");
            
        }
        
    }//GEN-LAST:event_txtNumbersOfGuestsKeyTyped

    private void txtTimeOfResidenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeOfResidenceKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only numbers");
        }
        
    }//GEN-LAST:event_txtTimeOfResidenceKeyTyped

    private void btnHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHotelMouseClicked
        
        int NumbersOfGuests;
        int TimeOfResidence;
        float TotalCost;

        NumbersOfGuests=Integer.parseInt(txtNumbersOfGuests.getText());
        TimeOfResidence=Integer.parseInt(txtTimeOfResidence.getText());
        String option=(String)CBCountryResidence.getSelectedItem();
        
        if(option.equals("Argentina")){
            TotalCost=TimeOfResidence*500+NumbersOfGuests*53;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Brazil")){
            TotalCost=TimeOfResidence*400+NumbersOfGuests*52;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Bolivia")){
            TotalCost=TimeOfResidence*450+NumbersOfGuests*51;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Chile")){
            TotalCost=TimeOfResidence*470+NumbersOfGuests*50;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Colombia")){
            TotalCost=TimeOfResidence*490+NumbersOfGuests*49;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Ecuador")){
            TotalCost=TimeOfResidence*500+NumbersOfGuests*48;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Paraguay")){
            TotalCost=TimeOfResidence*495+NumbersOfGuests*47;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Peru")){
            TotalCost=TimeOfResidence*475+NumbersOfGuests*46;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Uruguay")){
            TotalCost=TimeOfResidence*465+NumbersOfGuests*44;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        if(option.equals("Venezuela")){
            TotalCost=TimeOfResidence*501+NumbersOfGuests*40;;
            txtCostInHotel.setText(""+TotalCost);
            
        }
        
        
    }//GEN-LAST:event_btnHotelMouseClicked

    private void btnDepaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepaMouseClicked
        int NumbersOfGuests;
        int TimeOfResidence;
        float TotalCost;

        NumbersOfGuests=Integer.parseInt(txtNumbersOfGuests.getText());
        TimeOfResidence=Integer.parseInt(txtTimeOfResidence.getText());
        String option=(String)CBCountryResidence.getSelectedItem();
        
        if(option.equals("Argentina")){
            TotalCost=TimeOfResidence*250+NumbersOfGuests*20;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Brazil")){
            TotalCost=TimeOfResidence*180+NumbersOfGuests*21;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Bolivia")){
            TotalCost=TimeOfResidence*200+NumbersOfGuests*22;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Chile")){
            TotalCost=TimeOfResidence*220+NumbersOfGuests*23;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Colombia")){
            TotalCost=TimeOfResidence*260+NumbersOfGuests*24;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Ecuador")){
            TotalCost=TimeOfResidence*240+NumbersOfGuests*25;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Paraguay")){
            TotalCost=TimeOfResidence*230+NumbersOfGuests*26;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Peru")){
            TotalCost=TimeOfResidence*250+NumbersOfGuests*27;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Uruguay")){
            TotalCost=TimeOfResidence*210+NumbersOfGuests*28;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
        if(option.equals("Venezuela")){
            TotalCost=TimeOfResidence*270+NumbersOfGuests*29;;
            txtCostInDepa.setText(""+TotalCost);
            
        }
    }//GEN-LAST:event_btnDepaMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        int NumbersOfGuests;
        int TimeOfResidence;
        float TotalCost;

        NumbersOfGuests=Integer.parseInt(txtNumbersOfGuests.getText());
        TimeOfResidence=Integer.parseInt(txtTimeOfResidence.getText());
        String option=(String)CBCountryResidence.getSelectedItem();
        
        if(option.equals("Argentina")){
            TotalCost=TimeOfResidence*300+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Brazil")){
            TotalCost=TimeOfResidence*360+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Bolivia")){
            TotalCost=TimeOfResidence*370+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Chile")){
            TotalCost=TimeOfResidence*380+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Colombia")){
            TotalCost=TimeOfResidence*390+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Ecuador")){
            TotalCost=TimeOfResidence*400+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Paraguay")){
            TotalCost=TimeOfResidence*390+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Peru")){
            TotalCost=TimeOfResidence*380+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Uruguay")){
            TotalCost=TimeOfResidence*360+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
            
        }
        if(option.equals("Venezuela")){
            TotalCost=TimeOfResidence*365+NumbersOfGuests*1;;
            txtCostInHome.setText(""+TotalCost);
         }
    }//GEN-LAST:event_btnHomeMouseClicked

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
            java.util.logging.Logger.getLogger(FrmResidenceCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResidenceCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResidenceCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResidenceCosts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmResidenceCosts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCountryResidence;
    private javax.swing.JButton btnCancelFlightCost;
    private javax.swing.JButton btnDepa;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHotel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCostInDepa;
    private javax.swing.JTextField txtCostInHome;
    private javax.swing.JTextField txtCostInHotel;
    private javax.swing.JTextField txtNumbersOfGuests;
    private javax.swing.JTextField txtTimeOfResidence;
    // End of variables declaration//GEN-END:variables
}
