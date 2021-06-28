/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Bryan Maisincho  Codec ESPE-DCCO
 */
public class Country {
    private String name;
    private double numberOfInhabitants;//does not occupy the camelcase
     private String idiom;
     private String continent;
     private ArrayList<Citys> listCitys;

    public Country(String name, double numberofinhabitants, String idiom, String continent) {
        this.name = name;
        this.numberOfInhabitants = numberofinhabitants;
        this.idiom = idiom;
        this.continent = continent;
        this.listCitys= new ArrayList<>();
    }
    
   
    public String getinfo(){
        String information = "";
        information += "\n Info Of "+ this.getName() + ":";
        information +="\n Number Of inhabitants: " +this.getNumberofinhabitants();
        information +="\n Idiom: "+ this.getIdiom();
        information +="\n Continet: "+ this.getContinent();
      
 
       for(Citys citys : this.getListCitys()) {
            
            information +="\n\t"+citys.getName();
        }
        return information;
    
    }
    
    public void addCitys(Citys citys){
        this.getListCitys().add(citys);
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
     * @return the numberofinhabitants
     */
    public double getNumberofinhabitants() {
        return numberOfInhabitants;
    }

    /**
     * @param numberofinhabitants the numberofinhabitants to set
     */
    public void setNumberofinhabitants(double numberofinhabitants) {
        this.numberOfInhabitants = numberofinhabitants;
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

    /**
     * @return the country
     */
 
    /**
     * @return the listCitys
     */
    public ArrayList<Citys> getListCitys() {
        return listCitys;
    }

    /**
     * @param listCitys the listCitys to set
     */
    public void setListCitys(ArrayList<Citys> listCitys) {
        this.listCitys = listCitys;
    }

    /**
     * @return the continent
     */
    public String getContinent() {
        return continent;
    }
    
    
    /**
     * @param continent the continent to set
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }
            }