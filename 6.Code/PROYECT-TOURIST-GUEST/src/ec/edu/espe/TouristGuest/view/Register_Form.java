/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Register_Form extends javax.swing.JFrame {

    DB db;
    DBCollection Table;
    
    /**
     * Creates new form Register_Form
     */
    public Register_Form() {
        try {
            Mongo mongo = new Mongo("LocalHost",27017);
            db= mongo.getDB("CityDate");
            Table= db.getCollection("Table");
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.table_Register.setModel(model);
        this.model.addColumn("First Name");
        this.model.addColumn("Last Name");
        this.model.addColumn("Username");
        this.model.addColumn("Password");
        this.model.addColumn("Address");
        this.model.addColumn("CI");
        this.model.addColumn("Gender");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    
    


    
    
    
    @SuppressWarnings("unchecked")
    DefaultTableModel model = new DefaultTableModel(); 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        txtCI = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCheckBoxPlan = new javax.swing.JCheckBox();
        jCheckBox2Sport_Tourism = new javax.swing.JCheckBox();
        jCheckBox3Mountaineering = new javax.swing.JCheckBox();
        jCheckBox4Go_On_Excursions = new javax.swing.JCheckBox();
        jCheckBox5Hourse_Trips = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Register = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNumberOfPeople = new javax.swing.JTextField();
        txtNumberChildren = new javax.swing.JTextField();
        TotalTravelCost = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        CBCity = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        CBChildren = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxItem1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSave_Regi = new javax.swing.JButton();
        btnDelete_Regi = new javax.swing.JButton();
        btnEdit_Regi = new javax.swing.JButton();
        btnStar_Regi = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("       REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 260, -1));
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

        jLabel10.setText("Address:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 160, -1));

        jLabel11.setText("C.I:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel12.setText(" Gender:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));
        jPanel1.add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 160, -1));

        jLabel13.setText("Recreational Activities:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 120, -1));

        jCheckBoxPlan.setText("Plan A Party.");
        jCheckBoxPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlanActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jCheckBox2Sport_Tourism.setText("Sports Tourism");
        jPanel1.add(jCheckBox2Sport_Tourism, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 110, -1));

        jCheckBox3Mountaineering.setText("Mountaineering ");
        jPanel1.add(jCheckBox3Mountaineering, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jCheckBox4Go_On_Excursions.setText("Go On Excursions");
        jPanel1.add(jCheckBox4Go_On_Excursions, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jCheckBox5Hourse_Trips.setText("Horse Trips");
        jPanel1.add(jCheckBox5Hourse_Trips, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 0, 350));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 380));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 382, 710, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 370));

        table_Register.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_RegisterMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_Register);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 490, 90));

        jLabel9.setText("Choose your travel destination");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        jLabel14.setText("Number Of People Who Will Travel:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, -1));

        jLabel16.setText("There Are Children Traveling With You:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        jLabel17.setText("Existing Case. How Many Children:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtNumberOfPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 120, -1));
        jPanel3.add(txtNumberChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 120, -1));

        TotalTravelCost.setEditable(false);
        TotalTravelCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalTravelCostActionPerformed(evt);
            }
        });
        jPanel3.add(TotalTravelCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 120, -1));

        jButton4.setText("Information of All Countries");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

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
        jPanel3.add(CBCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton3.setText("Total Travel Cost");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 480, 190));

        jLabel19.setText("The Information of All Countries ");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 20));

        CBChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
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
        jPanel3.add(CBChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 520, 480));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel18.setText("Traveler Data");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 120, 20));

        jComboBoxItem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femenine", "Others", " " }));
        jPanel1.add(jComboBoxItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave_Regi.setText("Save");
        btnSave_Regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_RegiActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        btnDelete_Regi.setText("Delete");
        btnDelete_Regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_RegiActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 30));

        btnEdit_Regi.setText("Edit");
        btnEdit_Regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_RegiActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, 30));

        btnStar_Regi.setText("Start");
        btnStar_Regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStar_RegiActionPerformed(evt);
            }
        });
        jPanel2.add(btnStar_Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 30));

        jButton5.setText("Record Of Previous Trips");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    private void btnSave_RegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_RegiActionPerformed
        // TODO add your handling code here:
        this.model.addRow(new Object[]{this.txtFistName.getText(),this.txtLastName.getText() ,
           this.txtUsername.getText(), this.pxtPassword.getPassword(), this.jTextArea1.getText(),
           this.txtCI.getText(),this.jComboBoxItem1.getSelectedItem(),
               });
       
       
       this.txtFistName.setText("");
       this.txtLastName.setText("");
       this.txtUsername.setText("");
       this.pxtPassword.setText("");
       this.jTextArea1.setText("");
       this.txtCI.setText("");
       this.jComboBoxItem1.setSelectedIndex(0);
       
       
       txtFistName.grabFocus();
    
    }//GEN-LAST:event_btnSave_RegiActionPerformed

    private void btnDelete_RegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_RegiActionPerformed
        int RowSelected= table_Register.getSelectedRow();
        if(RowSelected >=0){
            
        }
        else{
            
        }    
    }//GEN-LAST:event_btnDelete_RegiActionPerformed

    int filas;
    private void btnEdit_RegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_RegiActionPerformed
        // TODO add your handling code here:
        
       
        String []datos=new String[6];
        datos[0]=txtFistName.getText();
        datos[1]=txtLastName.getText();
        datos[2]=txtUsername.getText();
        datos[3]=pxtPassword.getPassword().toString();
        datos[4]=jTextArea1.getText();
        datos[5]=txtCI.getText();
        datos[6]=jComboBoxItem1.getSelectedItem().toString();
         
        for (int i = 0; i <table_Register.getColumnCount(); i++){
        model.setValueAt(datos[i], filas, i);
    } 
      
        
                  
    }//GEN-LAST:event_btnEdit_RegiActionPerformed

    private void btnStar_RegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStar_RegiActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"User Register successfully" );

    }//GEN-LAST:event_btnStar_RegiActionPerformed

    private void CBCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCityActionPerformed
     
    }//GEN-LAST:event_CBCityActionPerformed

    private void TotalTravelCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalTravelCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalTravelCostActionPerformed

    private void jCheckBoxPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlanActionPerformed

    }//GEN-LAST:event_jCheckBoxPlanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        DBCursor cursor= Table.find();
        while(cursor.hasNext()){
        jTextArea3.setText(jTextArea3.getText()+ "\n" + cursor.next());
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    @SuppressWarnings("empty-statement")
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

    private void CBCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBCityMouseClicked

        

                
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCityMouseClicked

    private void CBChildrenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBChildrenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CBChildrenMouseClicked

    private void CBChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBChildrenActionPerformed

    private void table_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_RegisterMouseClicked
        // TODO add your handling code here:
        
            int fila_select=table_Register.getSelectedRow();
        
        txtFistName.setText(table_Register.getValueAt(fila_select,0).toString());
        txtLastName.setText(table_Register.getValueAt(fila_select, 1).toString());
        txtUsername.setText(table_Register.getValueAt(fila_select, 2).toString());
        pxtPassword.setText(table_Register.getValueAt(fila_select, 3).toString());
        jTextArea1.setText(table_Register.getValueAt(fila_select, 4).toString());
        txtCI.setText(table_Register.getValueAt(fila_select, 5).toString());
        jComboBoxItem1.setSelectedItem(table_Register.getValueAt(fila_select, 6).toString());
        
    }//GEN-LAST:event_table_RegisterMouseClicked

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
    private javax.swing.JComboBox<String> CBChildren;
    private javax.swing.JComboBox<String> CBCity;
    private javax.swing.JTextField TotalTravelCost;
    private javax.swing.JButton btnDelete_Regi;
    private javax.swing.JButton btnEdit_Regi;
    private javax.swing.JButton btnSave_Regi;
    private javax.swing.JButton btnStar_Regi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox2Sport_Tourism;
    private javax.swing.JCheckBox jCheckBox3Mountaineering;
    private javax.swing.JCheckBox jCheckBox4Go_On_Excursions;
    private javax.swing.JCheckBox jCheckBox5Hourse_Trips;
    private javax.swing.JCheckBox jCheckBoxPlan;
    private javax.swing.JComboBox<String> jComboBoxItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JPasswordField pxtPassword;
    private javax.swing.JPasswordField pxtRetypePass;
    private javax.swing.JTable table_Register;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtFistName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNumberChildren;
    private javax.swing.JTextField txtNumberOfPeople;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
