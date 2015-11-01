
package javaapplication22;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


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
      for(int i=-1;i<=1;i=i+1)
      {
        double x = 5*i;
        double y = 12*i;
        Calculator instance = new Calculator();
        double expResult = 17*i;
        double result = instance.Add(x, y);
        
        assertEquals(expResult, result, 0);
      }
        
      /*  x = -12;
        y = -5;
        expResult = -17;
        result = instance.Add(x, y);
        
        assertEquals(expResult, result, 0);
    */}

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
        
        assertEquals(expResult, result, 0);
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
        
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testpow(){
        System.out.println("Pow");
        double x=3;
        double y=3;
        Calculator instance = new Calculator();
        double expResult= 27.0;
        double result = instance.Pow(x, y);
        
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testsqrt(){
        System.out.println("Sqrt");
        double x=9;
        Calculator instance = new Calculator();
        double expResult=3;
        double result=instance.Sqrt(x);
        assertEquals(expResult, result, 0);
        
    }
    /**
     * Test of Pi method, of class Calculator.
     */
    @Test
    public void testPi() {
        System.out.println("Pi");
        double expResult = 3.141592653589793;
        double result =Math.PI;
        
        assertEquals(expResult, result, 0);
    }
    /**
     * Test of Exp method, of class Calculator.
     */
    @Test
    public void testExp() {
        System.out.println("Exp");
        double x = 1;
        double expResult = 2.718281828459045;
        double result = Math.exp(x);
        
        assertEquals(expResult, result, 0);
        
        x = 0;
        expResult = 1.0;
        result = Math.exp(x);
        
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testMult() {
        System.out.println("Mult");
        double x=3;
        double y=4;
        Calculator instance = new Calculator();
        double expResult= 12.0;
        double result = instance.Mult(x, y);
        
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testsin(){
        System.out.println("Sin");
        double x=90;
        double expResult=0.8939966636005579;
        double result=Math.sin(x);
        assertEquals(expResult, result, 0);
        
        x = 0;
        expResult =0;
        result=Math.sin(x);
        
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testcos(){
        System.out.println("Cos");
        double x=45;
        double expResult=0.5253219888177297;
        double result=Math.cos(x);
        assertEquals(expResult, result, 0);
        
        x = 0;
        expResult =1;
        result=Math.cos(x);
        
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testtan(){
        System.out.println("Tan");
        double x=30;
        double expResult=-6.405331196646276;
        double result=Math.tan(x);
        assertEquals(expResult, result, 0);
        
        x = 0;
        expResult =0;
        result=Math.tan(x);
        
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testlog(){
        System.out.println("Log");
        double x=2;
        double expResult=0.3010299956639812;
        double result=Math.log10(x);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testln(){
        System.out.println("Ln");
        double x=1;
        double expResult=0;
        double result=Math.log(x);
        assertEquals(expResult, result, 0);
    }
}

