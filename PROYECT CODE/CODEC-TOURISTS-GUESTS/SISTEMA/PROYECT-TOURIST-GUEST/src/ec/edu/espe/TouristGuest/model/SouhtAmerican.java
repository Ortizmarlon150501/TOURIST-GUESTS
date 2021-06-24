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
    ListCountry listCountry;

    public SouhtAmerican() {
        this.listCountry = new ListCountry();
    }
    
    public void addCountry(Country p){
      this.listCountry.addCountry(p);
    }
    
}
