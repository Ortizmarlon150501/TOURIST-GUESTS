/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import ec.edu.espe.TouristGuest.model.City;
import ec.edu.espe.TouristGuest.model.Country;
import ec.edu.espe.TouristGuest.model.SouhtAmerican;

/**
 *
 * @author JARAMILLO JEAN TOUR GUEST OPP-ESPE
 */
public class SystemTouristGuest {
    public static void main(String[] args) {
        
                             //cantidad de habitantes,idioma, continente
        Country p1 = new Country("Brazil", 100, "Spanish", "SouthAmerica");
        Country p2 = new Country("Colombia", 200, "Spanish", "SouthAmerica");
        Country p3 = new Country("Argentina", 300, "Spanish", "SouthAmerica");
        Country p4 = new Country("Perú", 200, "Spanish", "SouthAmerica");
        Country p5 = new Country("Venezuela", 100, "Spanish", "SouthAmerica");
        Country p6 = new Country("Chile", 300, "Spanish", "SouthAmerica");
        Country p7 = new Country("Ecuador", 100, "Spanish", "SouthAmerica");
        Country p8 = new Country("Bolivia", 200, "Spanish", "SouthAmerica");
        Country p9 = new Country("Paraguay", 100, "Spanish", "SouthAmerica");
        Country p10 = new Country("Uruguay", 300, "Spanish", "SouthAmerica");
        
        City c1 = new City("city1", 0, 0);
        City c2 = new City("city2", 0, 0);
        City c3 = new City("city3", 0, 0);
        City c4 = new City("city4", 0, 0);
        City c5 = new City("city5", 0, 0);
        City c6 = new City("city6", 0, 0);
        City c7 = new City("city7", 0, 0);
        City c8 = new City("city8", 0, 0);
        City c9 = new City("city9", 0, 0);
        City c10 = new City("city10", 0, 0);
        City c11 = new City("city11", 0, 0);
        City c12 = new City("city12", 0, 0);
        City c13 = new City("city13", 0, 0);
        City c14 = new City("city14", 0, 0);
        City c15 = new City("city15", 0, 0);
        City c16= new City("city16", 0, 0);
        City c17= new City("city17", 0, 0);
        City c18= new City("city18", 0, 0);
        City c19= new City("city19", 0, 0);
        City c20= new City("city20", 0, 0);
        City c21= new City("city21", 0, 0);
        City c22= new City("city22", 0, 0);
        City c23= new City("city23", 0, 0);
        City c24= new City("city24", 0, 0);
        City c25= new City("city25", 0, 0);
        City c26= new City("city26", 0, 0);
        City c27= new City("city27", 0, 0);
        City c28= new City("city28", 0, 0);
        City c29= new City("city29", 0, 0);
        City c30= new City("city30", 0, 0);
        
  
        p1.addCity(c1);
        p1.addCity(c2);
        p1.addCity(c3);
        p2.addCity(c4);
        p2.addCity(c5);
        p2.addCity(c6);
        p3.addCity(c7);
        p3.addCity(c8);
        p3.addCity(c9);
        p4.addCity(c10);
        p4.addCity(c11);
        p4.addCity(c12);
        p5.addCity(c13);
        p5.addCity(c14);
        p5.addCity(c15);
        p6.addCity(c16);
        p6.addCity(c17);
        p6.addCity(c18);
        p7.addCity(c19);
        p7.addCity(c20);
        p7.addCity(c21);
        p8.addCity(c22);
        p8.addCity(c23);
        p8.addCity(c24);
        p9.addCity(c25);
        p9.addCity(c26);
        p9.addCity(c27);
        p10.addCity(c28);
        p10.addCity(c29);
        p10.addCity(c30);
        
        SouhtAmerican souhtamerican = new SouhtAmerican();
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         souhtamerican.addCountry(p1);
         
        
       
   
    }
    public static void menu(){
    System.out.println("\n");
    System.out.println("\n [1] Search country cities");
    System.out.println("\n [2] country with more inhabitants");
    System.out.println("\n [3] Search city country");
    System.out.println("\n [0] Exit");
        
   }
}
