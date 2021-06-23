/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Bryan Maisincho TOUR GUEST OPP-ESPE
 */
public class ListOfCountry {

    Country SearchCountry(String CountrySearched) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addCountry(Country p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public class ListCountry {
    private List list;
    
    public ListCountry(){
        this.list = new LinkedList();  
    }
    
    public void addCountry(Country p){
        this.getList().add(p);
    }
    
    public Country searchCity(String name){
        Iterator items = this.getList().iterator();
        while (items.hasNext()){
            Country p =(Country)items.next();
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }
    
    public String getListCountry(){
        String s= "";
        Iterator items = this.getList().iterator();
        while (items.hasNext()){
            Country p =(Country)items.next();
            s += "\n" + p.getName();
            }
         return s;
        }

        /**
         * @return the list
         */
        public List getList() {
            return list;
        }

        /**
         * @param list the list to set
         */
        public void setList(List list) {
            this.list = list;
        }
    
      }
}