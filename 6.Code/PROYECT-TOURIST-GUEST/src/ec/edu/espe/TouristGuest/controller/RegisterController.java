/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class RegisterController {

    DB Register;

    DBCollection Table_Register;

    public RegisterController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            Register = mongo.getDB("Register");
            Table_Register = Register.getCollection("Table_Register");
            System.out.println("successfull connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(CountryController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addRegister(JTextField txtFistName, JTextField txtLastName, JTextField txtUsername, JTextField pxtPassword,
            JTextField pxtRetypePass, JTextArea txa_Address, JTextField txtCI, JComboBox cmb_Gender, JRootPane rootPane) {
        if ("".equals(txtFistName.getText()) || "".equals(txtLastName.getText()) || "".equals(txtUsername.getText()) || "".equals(pxtPassword.getText()) || "".equals(pxtRetypePass.getText())
                || "".equals(txa_Address.getText()) || "".equals(txtCI.getText()) || "".equals(cmb_Gender.getSelectedItem())) {
            JOptionPane.showMessageDialog(rootPane, "There are empty fields!");
        } else {

            BasicDBObject document = new BasicDBObject();
            document.put("Fist_Name", "'" + txtFistName.getText() + "'");
            document.put("Last_Name", "'" + txtLastName.getText() + "'");
            document.put("Username", "'" + txtUsername.getText() + "'");
            document.put("Password", "'" + pxtPassword.getText() + "'");
            document.put("Address", "'" + txa_Address.getText() + "'");
            document.put("CI", "'" + txtCI.getText() + "'");
            document.put("Gender", "'" + cmb_Gender.getSelectedItem() + "'");
            Table_Register.insert(document);

            int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to save this information?");
            if (saveOption == 0) {
                JOptionPane.showMessageDialog(rootPane, "Saved!");
            } else if (saveOption == 1) {
                JOptionPane.showMessageDialog(rootPane, "Ok,try again.");
            }
        }
    }

    public void table_RegisterMouse(JTextField txtFistName, JTextField txtLastName, JTextField txtUsername, JTextField pxtPassword,
            JTextField pxtRetypePass, JTextArea txa_Address, JTextField txtCI, JComboBox cmb_Gender, JRootPane rootPane) {
        if ("".equals(txtFistName.getText()) || "".equals(txtLastName.getText()) || "".equals(txtUsername.getText()) || "".equals(pxtPassword.getText()) || "".equals(pxtRetypePass.getText())
                || "".equals(txa_Address.getText()) || "".equals(txtCI.getText()) || "".equals(cmb_Gender.getSelectedItem())) {

        } else {

            DBCursor curso = Table_Register.find();

        }
    }

}
