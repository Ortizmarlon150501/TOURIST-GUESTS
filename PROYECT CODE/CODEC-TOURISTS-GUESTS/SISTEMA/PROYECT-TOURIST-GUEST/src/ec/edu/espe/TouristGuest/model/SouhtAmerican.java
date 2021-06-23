/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

/**
 *
 * @author Bryan Maisincho  TOUR GUEST OPP-ESPE
 */
public class SouhtAmerican {
    ListOfCountry listCountry;
    ListCity listCity;
    public SouhtAmerican(){
        this.listCountry = new ListOfCountry();
        this.listCity = new ListCity();
        
    }
    public void addCountry(Country p){
        this.listCountry.addCountry(p);
    }
    public void addCity(City c){
        this.listCity.addCity(c);
    }
    public String getCityesByCountry(String CountrySearched){
        Country p = this.listCountry.SearchCountry(CountrySearched);
        if (p != null){
            return p. getListCity();
        }
        return "Country not found. ";
    }
    
    public String getDataCity(String WantedCity){
        City c = this.listCity.SearchCity(WantedCity);
        if (c  != null){
            return c.getName();
        }
        return "City ndjdd found. ";
    }

   
}
