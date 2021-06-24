/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

/**
 *
 * @author LILIAN IZA TOUR GUEST OPP-ESPE
 */
public class City {
    
    private String name;
    private int numberOfUniversitys;
    private int amountOfMuseum;

    public City(String name, int numberOfUniversitys, int amountOfMuseum) {
        this.name = name;
        this.numberOfUniversitys = numberOfUniversitys;
        this.amountOfMuseum = amountOfMuseum;
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
     * @return the numberOfUniversitys
     */
    public int getNumberOfUniversitys() {
        return numberOfUniversitys;
    }

    /**
     * @param numberOfUniversitys the numberOfUniversitys to set
     */
    public void setNumberOfUniversitys(int numberOfUniversitys) {
        this.numberOfUniversitys = numberOfUniversitys;
    }

    /**
     * @return the amountOfMuseum
     */
    public int getAmountOfMuseum() {
        return amountOfMuseum;
    }

    /**
     * @param amountOfMuseum the amountOfMuseum to set
     */
    public void setAmountOfMuseum(int amountOfMuseum) {
        this.amountOfMuseum = amountOfMuseum;
    }
    
    
}