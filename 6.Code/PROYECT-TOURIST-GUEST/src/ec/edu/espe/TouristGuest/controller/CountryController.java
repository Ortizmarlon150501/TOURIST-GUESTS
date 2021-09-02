/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.controller;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class CountryController {
        DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public CountryController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InfoCountry");
            collection = DataBase.getCollection("Country");
            System.out.println("successful connection");
           }catch(UnknownHostException ex){
            Logger.getLogger(CountryController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    
    
}
