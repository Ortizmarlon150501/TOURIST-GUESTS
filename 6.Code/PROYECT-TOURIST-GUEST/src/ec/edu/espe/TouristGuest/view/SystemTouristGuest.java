/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.TouristGuest.model.City;
import ec.edu.espe.TouristGuest.model.Country;
import ec.edu.espe.TouristGuest.model.Residence;
import ec.edu.espe.TouristGuest.controller.Ticket;
import java.util.Scanner;

/**
 *
 * @author  ORTIZ MARLON TOUR GUEST OPP-ESPE
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

            System.out.println("1. Brazil");
            System.out.println("2. Argentina");
            System.out.println("3. Bolivia");
            System.out.println("4. Chile");
            System.out.println("5. Colombia");
            System.out.println("6. Ecuador");
            System.out.println("7. Paraguay");
            System.out.println("8. Perú");
            System.out.println("9. Uruguay");
            System.out.println("10.Venezuela");
            System.out.println("11.Go out");

            System.out.println("Write your destination country:..");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("You have selected option 1");
                    Country p1 = new Country("Brazil", 210147.000, "Portuguse", "American");
                    jsonCountry = gson.toJson(p1);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence();
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c1 = new City("São Paulo", 22, 10);
                    City c2 = new City("Rio de Janeiro ", 17, 12);
                    City c3 = new City("Gramado", 19, 12);
                    p1.addCitys(c1);
                    p1.addCitys(c2);
                    p1.addCitys(c3);
                    System.out.println(p1.getinfo());
                    System.out.println(c1.getinfocity());
                    System.out.println(c2.getinfocity());
                    System.out.println(c3.getinfocity());
                    
                    double  Brazil = 3195.0F;
                    float discount = 50.0F;
                    int clas = 200;

                    float discountType = Ticket.discount(discount);

                    double totalPrice = Ticket.ticketCost(Brazil, clas);

                    System.out.println("Your destino is: " + "Brazil" + " The discount for you is : " + discountType + " and you Total Cost is: " + totalPrice);

                    break;
                case 2:
                    System.out.println("You have selected option 2");
                    Country p2 = new Country("Argetina", 44939.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p2);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c4 = new City("Salta", 10, 12);
                    City c5 = new City("Rosario", 10, 13);
                    City c6 = new City("Buenos Aires", 10, 11);
                    p2.addCitys(c4);
                    p2.addCitys(c5);
                    p2.addCitys(c6);
                    System.out.println(p2.getinfo());
                    System.out.println(c4.getinfocity());
                    System.out.println(c5.getinfocity());
                    System.out.println(c6.getinfocity());
                    break;
                case 3:
                    System.out.println("You have selected option 3");
                    Country p3 = new Country("Bolivia", 25550.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p3);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c7 = new City("City Potosí", 6, 11);
                    City c8 = new City("The Uyuni Salt Flats", 7, 9);
                    City c9 = new City("Torotoro National Park", 7, 9);
                    p3.addCitys(c7);
                    p3.addCitys(c8);
                    p3.addCitys(c9);
                    System.out.println(p3.getinfo());
                    System.out.println(c7.getinfocity());
                    System.out.println(c8.getinfocity());
                    System.out.println(c9.getinfocity());
                    break;
                case 4:
                    System.out.println("You have selected option 4");
                    Country p4 = new Country("Chile", 19107.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p4);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c10 = new City("Concepción", 26, 15);
                    City c11 = new City("Talca", 12, 15);
                    City c12 = new City("Iquique", 15, 12);
                    p4.addCitys(c10);
                    p4.addCitys(c11);
                    p4.addCitys(c12);
                    System.out.println(p4.getinfo());
                    System.out.println(c10.getinfocity());
                    System.out.println(c11.getinfocity());
                    System.out.println(c12.getinfocity());
                    break;
                case 5:
                    System.out.println("You have selected option 5");
                    Country p5 = new Country("Colombia", 1278.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p5);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c13 = new City("Cartagena", 68, 20);
                    City c14 = new City("Medellín", 23, 26);
                    City c15 = new City("Cali", 105, 32);
                    p5.addCitys(c13);
                    p5.addCitys(c14);
                    p5.addCitys(c15);
                    System.out.println(p5.getinfo());
                    System.out.println(c13.getinfocity());
                    System.out.println(c14.getinfocity());
                    System.out.println(c15.getinfocity());
                    break;
                case 6:
                    System.out.println("You have selected option 6");
                    Country p6 = new Country("Ecuador", 17268.000, "Spanish", "American");
                    jsonCountry = gson.toJson(p6);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c16 = new City("Quito", 85, 225);
                    City c17 = new City("Ambato", 62, 105);
                    City c18 = new City("Cuenca", 69, 82);
                    p6.addCitys(c16);
                    p6.addCitys(c17);
                    p6.addCitys(c18);
                    System.out.println(p6.getinfo());
                    System.out.println(c16.getinfocity());
                    System.out.println(c17.getinfocity());
                    System.out.println(c18.getinfocity());
                    break;
                case 7:
                    System.out.println("You have selected option 7");
                    Country p7 = new Country("Paraguay", 7353.038, "Spanish", "American");
                    jsonCountry = gson.toJson(p7);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c19 = new City("Asunción", 39, 32);
                    City c20 = new City("Encarnación", 48, 41);
                    City c21 = new City("Luque", 58, 43);
                    p7.addCitys(c19);
                    p7.addCitys(c20);
                    p7.addCitys(c21);
                    System.out.println(p7.getinfo());
                    System.out.println(c19.getinfocity());
                    System.out.println(c20.getinfocity());
                    System.out.println(c21.getinfocity());
                    break;
                case 8:
                    System.out.println("You have selected option 8");
                    Country p8 = new Country("Perú", 33.035304, "Spanish", "American");
                    jsonCountry = gson.toJson(p8);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c22 = new City("Lima", 183, 13);
                    City c23 = new City("Cusco", 37, 18);
                    City c24 = new City("Arequipa", 54, 22);
                    p8.addCitys(c22);
                    p8.addCitys(c23);
                    p8.addCitys(c24);
                    System.out.println(p8.getinfo());
                    System.out.println(c22.getinfocity());
                    System.out.println(c23.getinfocity());
                    System.out.println(c24.getinfocity());
                    break;
                case 9:
                    System.out.println("You have selected option 9");
                    Country p9 = new Country("Uruguay", 3461.734, "Spanish", "American");
                    jsonCountry = gson.toJson(p9);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c25 = new City("Montevideo", 24, 23);
                    City c26 = new City("Fray Bentos", 23, 43);
                    City c27 = new City("Maldonado", 24, 30);
                    p9.addCitys(c25);
                    p9.addCitys(c26);
                    p9.addCitys(c27);
                    System.out.println(p9.getinfo());
                    System.out.println(c25.getinfocity());
                    System.out.println(c26.getinfocity());
                    System.out.println(c27.getinfocity());
                    break;
                case 10:
                    System.out.println("You have selected option 10");
                    Country p10 = new Country("Venezuela", 28.515829, "Spanish", "American");
                    jsonCountry = gson.toJson(p10);
                    System.out.println("jsonCountry -> " + jsonCountry);

                    /*Residence r1 = new Residence(opcion, opcion, opcion);
                    float costTotalResicence = r1.costOfResidence(200.0, 200.0, 200.0);
                    System.out.println(" The cost total residence is: " + costTotalResicence);*/
                    City c28 = new City("Caracas", 22, 10);
                    City c29 = new City("Maracaibo ", 17, 12);
                    City c30 = new City("Valencia", 19, 12);
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
                    System.out.println("Only numbers between 1 amd 4");
            }

        }

    }

}
