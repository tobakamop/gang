package test;
import main.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator cal = new Calculator();
    @Test
    public void oneAndTwoAdd(){

        assertEquals(3,cal.add(1,2));
    }
    @Test
    public void negativesAdd(){

        assertEquals(-2,cal.add(-1,-1));
    }
    @Test
    public void multipleNumbersAdd(){

        assertEquals(15,cal.add(1,2,3,4,5));
    }
    @Test
    public void oneAndThreeMultiply(){

        assertEquals(3,cal.multiply(1,3));
    }
    @Test
    public void multiplyNegative(){

        assertEquals(-3,cal.multiply(-1,3));
    }
    @Test
    public void multiplyFiveNumbers(){

        assertEquals(120,cal.multiply(1,2,3,4,5));
    }





}
