/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnpe
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of Add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        double x = 5;
        double y = 12;
        Calculator instance = new Calculator();
        double expResult = 17;
        double result = instance.Add(x, y);
        
        assertEquals(expResult, result, 0);
        
        x = -12;
        y = -5;
        expResult = -17;
        result = instance.Add(x, y);
        
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of Sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        System.out.println("Sub");
        double x = 12;
        double y = 2;
        Calculator instance = new Calculator();
        double expResult = 10;
        double result = instance.Sub(x, y);
        
        assertEquals(expResult, result, 0.0);
    }

   
    /**
     * Test of Div method, of class Calculator.
     */
    @Test
    public void testDiv() {
        System.out.println("Div");
        double x = 5;
        double y = 2;
        Calculator instance = new Calculator();
        double expResult = 2.5;
        double result = instance.Div(x, y);
        
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testPower() {
        System.out.println("Power");
        double x = 8;
        double y = 2;
        Calculator instance = new Calculator();
        double expResult = 64;
        double result = instance.Power(x, y);
        
        assertEquals(expResult, result, 0.0);
} 
}