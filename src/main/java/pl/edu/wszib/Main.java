package pl.edu.wszib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Witaj w kalkulatorze!");

        while (true) {
            System.out.println("\nWybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Pierwiastek kwadratowy");
            System.out.println("6. Potęga");
            System.out.println("7. Silnia");
            System.out.println("0. Zakończenie");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Koniec!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Podaj pierwszą liczbę: ");
                    double addOperand1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    double addOperand2 = scanner.nextDouble();
                    result = calculator.add(addOperand1, addOperand2);
                    break;
                case 2:
                    System.out.print("Podaj pierwszą liczbę: ");
                    double subtractOperand1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    double subtractOperand2 = scanner.nextDouble();
                    result = calculator.subtract(subtractOperand1, subtractOperand2);
                    break;
                case 3:
                    System.out.print("Podaj pierwszą liczbę: ");
                    double multiplyOperand1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    double multiplyOperand2 = scanner.nextDouble();
                    result = calculator.multiply(multiplyOperand1, multiplyOperand2);
                    break;
                case 4:
                    System.out.print("Podaj pierwszą liczbę: ");
                    double divideOperand1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    double divideOperand2 = scanner.nextDouble();
                    try {
                        result = calculator.divide(divideOperand1, divideOperand2);
                    } catch (ArithmeticException e) {
                        System.out.println("Błąd: " + e.getMessage());
                        continue;
                    }
                    break;
                case 5:
                    System.out.print("Podaj liczbę: ");
                    double sqrtOperand = scanner.nextDouble();
                    result = calculator.square(sqrtOperand);
                    break;
                case 6:
                    System.out.print("Podaj liczbę: ");
                    double base = scanner.nextDouble();
                    System.out.print("Podaj wykładnik: ");
                    double exponent = scanner.nextDouble();
                    result = calculator.power(base, exponent);
                    break;
                case 7:
                    System.out.print("Podaj liczbę całkowitą: ");
                    int factorialOperand = scanner.nextInt();
                    result = calculator.factorial(factorialOperand);
                    break;
                default:
                    System.out.println("Spróbuj ponownie.");
                    continue;
            }

            System.out.println("Wynik: " + result);
        }
    }
}
