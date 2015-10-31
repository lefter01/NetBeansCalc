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
    public void testpow(){
        System.out.println("Pow");
        double x=3;
        double y=3;
        Calculator instance = new Calculator();
        double expResult= 27.0;
        double result = instance.Pow(x, y);
        
        assertEquals(expResult,result,0.0);
    }
    @Test
    public void testsqrt(){
        System.out.println("Sqrt");
        double x=9;
        Calculator instance = new Calculator();
        double expResult=3;
        double result=instance.Sqrt(x);
        assertEquals(expResult,result,0.0);
        
    }
    
}

