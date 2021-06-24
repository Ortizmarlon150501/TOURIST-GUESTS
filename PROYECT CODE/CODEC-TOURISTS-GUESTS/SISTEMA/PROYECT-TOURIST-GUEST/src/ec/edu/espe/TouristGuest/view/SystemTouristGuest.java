/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import ec.edu.espe.TouristGuest.model.Country;
import ec.edu.espe.TouristGuest.model.SouhtAmerican;

/**
 *
 * @author JARAMILLO JEAN TOUR GUEST OPP-ESPE
 */
public class SystemTouristGuest {
    public static void main(String[] args) {
        
                             //cantidad de habitantes,idioma, continente
        Country ct1 = new Country("Brazil", 100, "Spanish", "SouthAmerica");
        Country ct2 = new Country("Colombia", 200, "Spanish", "SouthAmerica");
        Country ct3 = new Country("Argentina", 300, "Spanish", "SouthAmerica");
        Country ct4 = new Country("Perú", 200, "Spanish", "SouthAmerica");
        Country ct5 = new Country("Venezuela", 100, "Spanish", "SouthAmerica");
        Country ct6 = new Country("Chile", 300, "Spanish", "SouthAmerica");
        Country ct7 = new Country("Ecuador", 100, "Spanish", "SouthAmerica");
        Country ct8 = new Country("Bolivia", 200, "Spanish", "SouthAmerica");
        Country ct9 = new Country("Paraguay", 100, "Spanish", "SouthAmerica");
        Country ct10 = new Country("Uruguay", 300, "Spanish", "SouthAmerica");
        
        city c1 = new city("city1", 0, 0);
        city c2 = new city("city2", 0, 0);
        city c3 = new city("city3", 0, 0);
        city c4 = new city("city4", 0, 0);
        city c5 = new city("city5", 0, 0);
        city c6 = new city("city6", 0, 0);
        city c7 = new city("city7", 0, 0);
        city c8 = new city("city8", 0, 0);
        city c9 = new city("city9", 0, 0);
        city c10 = new city("city10", 0, 0);
        city c11 = new city("city11", 0, 0);
        city c12 = new city("city12", 0, 0);
        city c13 = new city("city13", 0, 0);
        city c14 = new city("city14", 0, 0);
        city c15 = new city("city15", 0, 0);
        city c16= new city("city16", 0, 0);
        city c17= new city("city17", 0, 0);
        city c18= new city("city18", 0, 0);
        city c19= new city("city19", 0, 0);
        city c20= new city("city20", 0, 0);
        city c21= new city("city21", 0, 0);
        city c22= new city("city22", 0, 0);
        city c23= new city("city23", 0, 0);
        city c24= new city("city24", 0, 0);
        city c25= new city("city25", 0, 0);
        city c26= new city("city26", 0, 0);
        city c27= new city("city27", 0, 0);
        city c28= new city("city28", 0, 0);
        city c29= new city("city29", 0, 0);
        city c30= new city("city30", 0, 0);
        
        ct1.addCity(c1);
        ct1.addCity(c2);
        ct1.addCity(c3);
        ct2.addCity(c4);
        ct2.addCity(c5);
        ct2.addCity(c6);
        ct3.addCity(c7);
        ct3.addCity(c8);
        ct3.addCity(c9);
        ct4.addCity(c10);
        ct4.addCity(c11);
        ct4.addCity(c12);
        ct5.addCity(c13);
        ct5.addCity(c14);
        ct5.addCity(c15);
        ct6.addCity(c16);
        ct6.addCity(c17);
        ct6.addCity(c18);
        ct7.addCity(c19);
        ct7.addCity(c20);
        ct7.addCity(c21);
        ct8.addCity(c22);
        ct8.addCity(c23);
        ct8.addCity(c24);
        ct9.addCity(c25);
        ct9.addCity(c26);
        ct9.addCity(c27);
        ct10.addCity(c28);
        ct10.addCity(c29);
        ct10.addCity(c30);
        
        SouhtAmerican southAmerica = new SouhtAmerican();
        southAmerica.addCountry(ct1);
        southAmerica.addCountry(ct2);
        southAmerica.addCountry(ct3);
        southAmerica.addCountry(ct4);
        southAmerica.addCountry(ct5);
        southAmerica.addCountry(ct6);
        southAmerica.addCountry(ct7);
        southAmerica.addCountry(ct8);
        southAmerica.addCountry(ct9);
        southAmerica.addCountry(ct10);
        
        System.out.println("Countries And Cities Are Loaded ");
        
        menu();
        int option = c.readInt();
        while(option !=0){
            menu();
            option = c.readInt();
        
        }
        c.close();
   
    }
    public static void menu(){
        System.out.println("\n");
        System.out.println("\n [1] Search country cities");
        System.out.println("\n [2] country with more inhabitants");
        System.out.println("\n [3] Search city country");
        System.out.println("\n [0] Exit");
        
    }
}
