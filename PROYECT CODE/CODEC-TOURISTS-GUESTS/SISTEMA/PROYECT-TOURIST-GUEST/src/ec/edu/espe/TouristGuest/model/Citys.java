/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Citys {
    private String name;
    private int numberOfUniversity;
    private int numberOfMuseum;

    public Citys(String name, int numberOfUniversity, int numberOfMuseum) {//does not occupy the camelcase
        this.name = name;
        this.numberOfUniversity = numberOfUniversity;
        this.numberOfMuseum = numberOfMuseum;
    }
 

     public String getinfoCity(){//does not occupy the camelcase
        String information= "";
        information += "\n Info of "+ this.getName() + ":";
        information +="\n number of universitys: "+ this.getNumberofuniversity() ;
        information +="\n number of museum : "+ this.getNumberofmuseum();
        return information; 
 
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
     * @return the numberofuniversity
     */
    public int getNumberofuniversity() {//does not occupy the camelcase
        return numberOfUniversity;
    }

    /**
     * @param numberofuniversity the numberofuniversity to set
     */
    public void setNumberofuniversity(int numberofuniversity) {//does not occupy the camelcase
        this.numberOfUniversity = numberofuniversity;
    }

    /**
     * @return the numberofmuseum
     */
    public int getNumberofmuseum() {
        return numberOfMuseum;//does not occupy the camelcase
    }

    /**
     * @param numberofmuseum the numberofmuseum to set
     */
    public void setNumberofmuseum(int numberofmuseum) {//does not occupy the camelcase
        this.numberOfMuseum = numberofmuseum;//does not occupy the camelcase
    }
    
    
}
