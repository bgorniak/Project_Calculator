package pl.edu.wszib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        double result = calculator.add(3.0, 2.0);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    void testSubtract() {
        double result = calculator.subtract(3.0, 2.0);
        assertEquals(1.0, result, 0.001);
    }

    @Test
    void testMultiply() {
        double result = calculator.multiply(3.0, 2.0);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(6.0, 2.0);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    void testSquare() {
        double result = calculator.square(9.0);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    void testPower() {
        double result = calculator.power(2.0, 3.0);
        assertEquals(8.0, result, 0.001);
    }

    @Test
    void testFactorial() {
        double result = calculator.factorial(5);
        assertEquals(120.0, result, 0.001);
    }
}
