/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.ArrayList;

/**
 *
 * @author LILIAN IZA TOUR GUEST OPP-ESPE
 */
public class Country {
    
    private String name;
    private int numberOfInhabitants;
    private String idiom;
    private String continent;
    private ArrayList<City> listCity;

    public Country(String name, int numberOfInhabitants, String idiom, String continent) {
        this.name = name;
        this.numberOfInhabitants = numberOfInhabitants;
        this.idiom = idiom;
        this.continent = continent;
        this.listCity = new ArrayList<>();
    }
    
    public String getListCity(){
      return this.getListCity();
    }
    
   
    public void addCity(City city){
      this.listCity.add(city);
    }
  
     
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
     * @return the numberOfInhabitants
     */
    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    /**
     * @param numberOfInhabitants the numberOfInhabitants to set
     */
    public void setNumberOfInhabitants(int numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
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