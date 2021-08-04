
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.controller;
/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Ticket {
      private double destination;
      private float discount;
      private int clas;
    
    private static float discountStudent = 50.0F;
    
        public static float  discount(float type) {
        float discountType= type * getDiscountStudent()/100;
        return discountType;
    
    }
   
   public static double ticketCost(double Destino,int clas ){
     
       double totalTicket;
       totalTicket= (Destino + clas + discount(getDiscountStudent()) );
        return totalTicket;
   
   }

    public Ticket(double destination, float discount, int clas) {
        this.destination = destination;
        this.discount = discount;
        this.clas = clas;
    }

    /**
     * @return the destination
     */
    public double getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(double destination) {
        this.destination = destination;
    }

    /**
     * @return the discount
     */
    public float getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    /**
     * @return the clas
     */
    public int getClas() {
        return clas;
    }

    /**
     * @param clas the clas to set
     */
    public void setClas(int clas) {
        this.clas = clas;
    }

    /**
     * @return the discountStudent
     */
    public static float getDiscountStudent() {
        return discountStudent;
    }

    /**
     * @param aDiscountStudent the discountStudent to set
     */
    public static void setDiscountStudent(float aDiscountStudent) {
        discountStudent = aDiscountStudent;
    }

      
      
    
       
    
    
}
