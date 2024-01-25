package pl.edu.wszib;

import org.apache.commons.math3.util.FastMath;

public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero.");
        }
        return x / y;
    }

    public double square(double x) {
        return FastMath.sqrt(x);
    }

    public double power(double x, double exponent) {
        return FastMath.pow(x, exponent);
    }

    public double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
        }
        double result = 1.0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
