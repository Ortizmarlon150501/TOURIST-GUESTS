/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Country {
    private String name;
    private double numberofinhabitants;
     private String idiom;
     private String country;
     private ArrayList<Citys> listCitys;
    
    public Country(String name, double numberofinhabitants, String idiom, String Country) {
        this.name = name;
        this.numberofinhabitants = numberofinhabitants;
        this.idiom = idiom;
        this.country = Country;
        this.listCitys= new ArrayList<>();
    }
    public String getinfo(){
        String m= "";
        m += "\n Info of "+ this.getName() + ":";
        m +="\n Number of inhabitants: " +this.getNumberofinhabitants();
        m +="\n idiom: "+ this.getIdiom();
        m +="\n contnet: "+ this.getCountry();
      
        
 
       for(Citys citys : this.getListCitys()) {
            
            m +="\n\t"+citys.getName();
        }
        return m;
    
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
        return numberofinhabitants;
    }

    /**
     * @param numberofinhabitants the numberofinhabitants to set
     */
    public void setNumberofinhabitants(double numberofinhabitants) {
        this.numberofinhabitants = numberofinhabitants;
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
            }
