/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class RegisterController {
    DB db;
 
    DBCollection Table_Register;
    BasicDBObject document = new BasicDBObject();
    
    
    public RegisterController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            db=mongo.getDB("Register");
            Table_Register = db.getCollection("Table_Register");
            System.out.println("successfull connection");
           }catch(UnknownHostException ex){
            Logger.getLogger(CountryController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
}
