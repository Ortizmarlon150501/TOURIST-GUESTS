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
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class ListCity {
    private List list;
    
    public ListCity(){
        this.list = new LinkedList();  
    }
    
    public void addCity(City c){
        this.getList().add(c);
    }
    
    public City searchCity(String name){
        Iterator items = this.getList().iterator();
        while (items.hasNext()){
            City c =(City)items.next();
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
    
    public String getListCity(){
        String s= "";
        Iterator items = this.getList().iterator();
        while (items.hasNext()){
            City c =(City)items.next();
            s += "\n" + c.getName();
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

