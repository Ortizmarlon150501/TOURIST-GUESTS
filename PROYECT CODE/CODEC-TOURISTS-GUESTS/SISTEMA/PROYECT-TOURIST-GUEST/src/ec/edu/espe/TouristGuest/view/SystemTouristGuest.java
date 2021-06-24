/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import ec.edu.espe.TouristGuest.model.Citys;
import ec.edu.espe.TouristGuest.model.Country;



/**
 *
 * @author JARAMILLO JEAN TOUR GUEST OPP-ESPE
 */
public class SystemTouristGuest {
    
    public static void main(String[] args){
        System.out.println("Welocme dear guest");
        Citys c1= new Citys("Quito", 85, 225);
        Citys c2= new Citys("Ambato", 62, 105);
        Citys c3= new Citys("Cuenca", 69, 82);
        
        Citys c4= new Citys("Trastevere", 62, 22);
        Citys c5= new Citys(" Domus Aurea ", 22, 19);
        Citys c6= new Citys("Roma", 34, 21);
        
        Citys c7= new Citys("Cartagena", 68, 20);
        Citys c8= new Citys("Medellín", 23, 26);
        Citys c9= new Citys("Cali", 105, 32);
        
         
        Citys c10= new Citys("Jalisco ", 39, 32);
        Citys c11= new Citys("Cancún", 48, 41);
        Citys c12= new Citys("Campeche", 58, 43);
        
         
        Citys c13= new Citys("París", 183, 13);
        Citys c14= new Citys("Toulouse", 37, 18);
        Citys c15= new Citys("Marsella", 54, 22);
        
         
        Citys c16= new Citys("Las Terrenas", 24, 23);
        Citys c17= new Citys("Isla Saona", 23, 43);
        Citys c18= new Citys("Boca Chica", 24, 30);
        
         
        Citys c19= new Citys("City7", 1, 1);
        Citys c20= new Citys("City8", 1, 1);
        Citys c21= new Citys("City9", 1, 1);
        
        
        Citys c22= new Citys("City7", 1, 1);
        Citys c23= new Citys("City8", 1, 1);
        Citys c24= new Citys("City8", 1, 1);
        
        Citys c25= new Citys("City7", 1, 1);
        Citys c26= new Citys("City8", 1, 1);
        Citys c27= new Citys("City8", 1, 1);
        
        
        Citys c28= new Citys("City7", 1, 1);
        Citys c29= new Citys("City8", 1, 1);
        Citys c30= new Citys("City8", 1, 1);
        
        
       
        
                
       Country p1= new Country("Country 1", 17268.000, "Spanish", "Ecuador");
       Country p2= new Country("Country 2", 59641.488, "Italian", "Italia");
       Country p3= new Country("Country 3",  50374.000, "Spanish", "Colombia");
       Country p4= new Country("Country 4",  1278.000 , "Spanish", "Mexico");
       Country p5= new Country("Country 5", 68011.000, "French", "Francia");
       Country p6= new Country("Country 6",10358.000 , "Spanish", "Republica Dominicana");
       Country p7= new Country("Country 7", 1000, "Spanish", "American");
       Country p8= new Country("Country 8", 1000, "Spanish", "Europe");
       Country p9= new Country("Country 9", 1000, "Spanish", "American");
       Country p10= new Country("Country 10", 1000, "Spanish", "American");
      
    
       p1.addCitys(c1);
       p1.addCitys(c2);
       p1.addCitys(c3);
      
       
       p2.addCitys(c4);
       p2.addCitys(c5);
       p2.addCitys(c6);
       
       p3.addCitys(c7);
       p3.addCitys(c8);
       p3.addCitys(c9);
       
       p4.addCitys(c10);
       p4.addCitys(c11);
       p4.addCitys(c12);
       
       p5.addCitys(c13);
       p5.addCitys(c14);
       p5.addCitys(c15);
       
       p6.addCitys(c16);
       p6.addCitys(c17);
       p6.addCitys(c18);
       
       p7.addCitys(c19);
       p7.addCitys(c20);
       p7.addCitys(c21);
       
       p8.addCitys(c22);
       p8.addCitys(c23);
       p8.addCitys(c24);
       
       p9.addCitys(c25);
       p9.addCitys(c26);
       p9.addCitys(c27);
       
       p10.addCitys(c28);
       p10.addCitys(c29);
       p10.addCitys(c30);
       
  
       
        System.out.println(p1.getinfo());
        System.out.println(p2.getinfo());
        System.out.println(p3.getinfo());
        System.out.println(p4.getinfo());
        System.out.println(p5.getinfo());
        System.out.println(p6.getinfo());
        System.out.println(p7.getinfo());
        System.out.println(p8.getinfo());
        System.out.println(p9.getinfo());
        System.out.println(p10.getinfo());
        
    }
    
    }



