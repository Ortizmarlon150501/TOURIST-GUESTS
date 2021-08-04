/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class TicketTest {
    
    public TicketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of discount method, of class Ticket.
     */
    @Test
    public void testDiscount() {
        System.out.println("discount");
        float type = 0.0F;
        float expResult = 0.0F;
        float result = Ticket.discount(type);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketCost method, of class Ticket.
     */
    @Test
    public void testTicketCost() {
        System.out.println("ticketCost");
        double Destino = 0.0;
        int clas = 0;
        double expResult = 0.0;
        double result = Ticket.ticketCost(Destino, clas);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
