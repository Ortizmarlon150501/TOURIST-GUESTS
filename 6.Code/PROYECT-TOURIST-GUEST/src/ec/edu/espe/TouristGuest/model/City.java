/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import com.mongodb.BasicDBObject;


/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class City {
    private String country;
    private String name;
    private String numberOfUniversity;
    private String numberOfMuseum;
    private String idiom;

    public City(String country, String name, String numberOfUniversity, String numberOfMuseum, String idiom) {
        this.country = country;
        this.name = name;
        this.numberOfUniversity = numberOfUniversity;
        this.numberOfMuseum = numberOfMuseum;
        this.idiom = idiom;
    }

   
  
      public City(BasicDBObject dBInfoCity) {
        this.country=dBInfoCity.getString("Country");
        this.name = dBInfoCity.getString("Principal City");
        this.numberOfMuseum =dBInfoCity.getString("Number Of Museum");
        this.numberOfUniversity = dBInfoCity.getString("RegistrationNumber");
        this.idiom = dBInfoCity.getString("Idiom");
        
    }
    
    
    public BasicDBObject dbCitiesInfo(){
        
        BasicDBObject dbCities = new BasicDBObject();
        
        dbCities.append("ID", this.getCountry());
        dbCities.append("Name", this.getName());
        dbCities.append("Number Of Museum", this.getNumberOfMuseum());
        dbCities.append("Number Of University", this.getNumberOfUniversity());
        dbCities.append("Idiom", this.getIdiom());
      
        
        return dbCities;
        
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numberOfUniversity
     */
    public String getNumberOfUniversity() {
        return numberOfUniversity;
    }

    /**
     * @param numberOfUniversity the numberOfUniversity to set
     */
    public void setNumberOfUniversity(String numberOfUniversity) {
        this.numberOfUniversity = numberOfUniversity;
    }

    /**
     * @return the numberOfMuseum
     */
    public String getNumberOfMuseum() {
        return numberOfMuseum;
    }

    /**
     * @param numberOfMuseum the numberOfMuseum to set
     */
    public void setNumberOfMuseum(String numberOfMuseum) {
        this.numberOfMuseum = numberOfMuseum;
    }

    /**
     * @return the idiom
     */
    public String getIdiom() {
        return idiom;
    }

    /**
     * @param idiom the idiom to set
     */
    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

 
}
