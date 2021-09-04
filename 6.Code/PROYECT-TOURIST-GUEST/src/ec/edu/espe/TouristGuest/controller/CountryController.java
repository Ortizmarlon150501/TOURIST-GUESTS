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
import ec.edu.espe.TouristGuest.model.City;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
            DataBase = mongo.getDB("Concessionaire");
            collection = DataBase.getCollection("Cities Of Country");
            System.out.println("Connected");
      } catch (UnknownHostException ex) {
            Logger.getLogger(CountryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    
    public boolean add(String country, String name, int numberOfUniversity, int numberOfMuseum, String idiom){
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(country, name, country, name, idiom));
        for (City pueC : cities){
            collection.insert(pueC.dbCitiesInfo());
            

    }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
}