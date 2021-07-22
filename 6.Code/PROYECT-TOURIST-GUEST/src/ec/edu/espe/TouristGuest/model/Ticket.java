/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.Scanner;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Ticket {
       
    private static float discount = 50.0F;
    
    public static float  discount(float type) {
    float discountType= type * discount/100;
    return discountType;
    
    }
   
   public static double ticketCost(double Galapagos,int clas ){
     
       double totalTicket;
       totalTicket= (Galapagos + clas + discount(discount) );
        return totalTicket;
   
   }

  
   
}
