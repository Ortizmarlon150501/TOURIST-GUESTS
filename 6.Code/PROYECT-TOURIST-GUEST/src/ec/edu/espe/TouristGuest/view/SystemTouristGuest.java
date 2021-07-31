/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.TouristGuest.model.Citys;
import ec.edu.espe.TouristGuest.model.Country;
import ec.edu.espe.TouristGuest.model.StudentTicket;
import ec.edu.espe.TouristGuest.model.Ticket;
import java.util.Scanner;

/**
 *
 * @author JARAMILLO JEAN TOUR GUEST OPP-ESPE
 */
public class SystemTouristGuest {

    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonCountry = "";
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Welcome dear guest");
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Argentina");
            System.out.println("2. Brasil");
            System.out.println("3. Bolivia");
            System.out.println("4. Chile");
            System.out.println("5. Colombia");
            System.out.println("6. Ecuador");
            System.out.println("7. Paraguay");
            System.out.println("8. Peu");
            System.out.println("9. Uruguay");
            System.out.println("10. Venezuela");
            System.out.println("11. Salir");

            System.out.println("Escriba su pais de destino");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("La informacion de Ecuador y su costo es: ");
                    Country p1 = new Country("Ecuador", 17268.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p1);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c1 = new Citys("Quito", 85, 225);
                    Citys c2 = new Citys("Ambato", 62, 105);
                    Citys c3 = new Citys("Cuenca", 69, 82);
                    p1.addCitys(c1);
                    p1.addCitys(c2);
                    p1.addCitys(c3);
                    System.out.println(p1.getinfo());
                    System.out.println(c1.getinfocity());
                    System.out.println(c2.getinfocity());
                    System.out.println(c3.getinfocity());
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    Country p2 = new Country("Italy", 59641.488, "Italian", "American");
                    jsonCountry = gson.toJson(p2);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c4 = new Citys("Trastevere", 62, 22);
                    Citys c5 = new Citys(" Domus Aurea ", 22, 19);
                    Citys c6 = new Citys("Roma", 34, 21);
                    p2.addCitys(c4);
                    p2.addCitys(c5);
                    p2.addCitys(c6);
                    System.out.println(p2.getinfo());
                    System.out.println(c4.getinfocity());
                    System.out.println(c5.getinfocity());
                    System.out.println(c6.getinfocity());
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p3 = new Country("Colombia", 1278.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p3);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c7 = new Citys("Cartagena", 68, 20);
                    Citys c8 = new Citys("Medellín", 23, 26);
                    Citys c9 = new Citys("Cali", 105, 32);
                    p3.addCitys(c7);
                    p3.addCitys(c8);
                    p3.addCitys(c9);
                    System.out.println(p3.getinfo());
                    System.out.println(c7.getinfocity());
                    System.out.println(c8.getinfocity());
                    System.out.println(c9.getinfocity());
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p4 = new Country("Mexico", 1278.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p4);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c10 = new Citys("Jalisco ", 39, 32);
                    Citys c11 = new Citys("Cancún", 48, 41);
                    Citys c12 = new Citys("Campeche", 58, 43);
                    p4.addCitys(c10);
                    p4.addCitys(c11);
                    p4.addCitys(c12);
                    System.out.println(p4.getinfo());
                    System.out.println(c10.getinfocity());
                    System.out.println(c11.getinfocity());
                    System.out.println(c12.getinfocity());
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p5 = new Country("France", 68011.000, "French", "American");
                    jsonCountry = gson.toJson(p5);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c13 = new Citys("París", 183, 13);
                    Citys c14 = new Citys("Toulouse", 37, 18);
                    Citys c15 = new Citys("Marsella", 54, 22);
                    p5.addCitys(c13);
                    p5.addCitys(c14);
                    p5.addCitys(c15);
                    System.out.println(p5.getinfo());
                    System.out.println(c13.getinfocity());
                    System.out.println(c14.getinfocity());
                    System.out.println(c15.getinfocity());
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p6 = new Country("Dominican Republic", 10358.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p6);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c16 = new Citys("Las Terrenas", 24, 23);
                    Citys c17 = new Citys("Isla Saona", 23, 43);
                    Citys c18 = new Citys("Boca Chica", 24, 30);
                    p6.addCitys(c16);
                    p6.addCitys(c17);
                    p6.addCitys(c18);
                    System.out.println(p6.getinfo());
                    System.out.println(c16.getinfocity());
                    System.out.println(c17.getinfocity());
                    System.out.println(c18.getinfocity());
                    break;
                case 7:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p7 = new Country("Brazil", 210147.000, "Portuguse", "American");
                    jsonCountry = gson.toJson(p7);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c19 = new Citys("São Paulo", 22, 10);
                    Citys c20 = new Citys("Rio de Janeiro ", 17, 12);
                    Citys c21 = new Citys("Gramado", 19, 12);
                    p7.addCitys(c19);
                    p7.addCitys(c20);
                    p7.addCitys(c21);
                    System.out.println(p7.getinfo());
                    System.out.println(c19.getinfocity());
                    System.out.println(c20.getinfocity());
                    System.out.println(c21.getinfocity());
                    break;
                case 8:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p8 = new Country("Argetina", 44939.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p8);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c22 = new Citys("Iguazú Falls", 10, 12);
                    Citys c23 = new Citys("Ushuaia", 10, 13);
                    Citys c24 = new Citys("City Mendoza", 10, 11);
                    p8.addCitys(c22);
                    p8.addCitys(c23);
                    p8.addCitys(c24);
                    System.out.println(p8.getinfo());
                    System.out.println(c22.getinfocity());
                    System.out.println(c23.getinfocity());
                    System.out.println(c24.getinfocity());
                    break;
                case 9:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p9 = new Country("Bolivia", 25550.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p9);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c25 = new Citys("City Potosí", 6, 11);
                    Citys c26 = new Citys("The Uyuni Salt Flats", 7, 9);
                    Citys c27 = new Citys("Torotoro National Park", 7, 9);
                    p9.addCitys(c25);
                    p9.addCitys(c26);
                    p9.addCitys(c27);
                    System.out.println(p9.getinfo());
                    System.out.println(c25.getinfocity());
                    System.out.println(c26.getinfocity());
                    System.out.println(c27.getinfocity());
                    break;
                case 10:
                    System.out.println("Has seleccionado la opcion 3");
                    Country p10 = new Country("Cuba", 18095.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p10);
                    System.out.println("jsonCountry -> " + jsonCountry);
                    Citys c28 = new Citys("Holguín", 26, 15);
                    Citys c29 = new Citys("The tunas", 12, 15);
                    Citys c30 = new Citys("Bayamo", 15, 12);
                    p10.addCitys(c28);
                    p10.addCitys(c29);
                    p10.addCitys(c30);
                    System.out.println(p10.getinfo());
                    System.out.println(c28.getinfocity());
                    System.out.println(c29.getinfocity());
                    System.out.println(c30.getinfocity());
                    break;
                case 11:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

        double Galapagos = 10000.0F;
        double España = 35.000F;
        float discount = 50.0F;
        int clas = 500;

        float discountType = Ticket.discount(discount);

        double totalPrice = Ticket.ticketCost(España, clas);

        System.out.println("Your destino is: " + "España" + " The discount for you is : " + discountType + " and you Total Cost is: " + totalPrice);

        
    }

}
