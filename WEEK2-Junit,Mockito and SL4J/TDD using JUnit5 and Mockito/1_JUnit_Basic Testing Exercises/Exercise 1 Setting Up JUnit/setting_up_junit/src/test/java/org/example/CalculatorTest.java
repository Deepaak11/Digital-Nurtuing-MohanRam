package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    public void testSquare() {
        Calculator calc = new Calculator();
        assertEquals(49, calc.square(7));
    }
}
