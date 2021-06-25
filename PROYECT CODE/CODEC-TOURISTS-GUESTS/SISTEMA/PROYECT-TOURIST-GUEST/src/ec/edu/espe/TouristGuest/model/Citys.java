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
    private int numberofuniversity;
    private int numberofmuseum;

    public Citys(String name, int numberofuniversity, int numberofmuseum) {//does not occupy the camelcase
        this.name = name;
        this.numberofuniversity = numberofuniversity;
        this.numberofmuseum = numberofmuseum;
    }
 

     public String getinfocity(){//does not occupy the camelcase
        String inf= "";
        inf += "\n Info of "+ this.getName() + ":";
        inf +="\n number of universitys: "+ this.getNumberofuniversity() ;
        inf +="\n number of museum : "+ this.getNumberofmuseum();
        return inf; 
 
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
        return numberofuniversity;
    }

    /**
     * @param numberofuniversity the numberofuniversity to set
     */
    public void setNumberofuniversity(int numberofuniversity) {//does not occupy the camelcase
        this.numberofuniversity = numberofuniversity;
    }

    /**
     * @return the numberofmuseum
     */
    public int getNumberofmuseum() {
        return numberofmuseum;//does not occupy the camelcase
    }

    /**
     * @param numberofmuseum the numberofmuseum to set
     */
    public void setNumberofmuseum(int numberofmuseum) {//does not occupy the camelcase
        this.numberofmuseum = numberofmuseum;//does not occupy the camelcase
    }
    
    
}
