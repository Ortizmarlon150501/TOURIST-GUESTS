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
public class ListCountry {
     List list;
    
    public ListCountry(){
        this.list = new LinkedList();  
    }
    
    public void addCountry(Country p){
        this.getList().add(p);
    }
    
    public Country searchCountry(String name){
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

}
