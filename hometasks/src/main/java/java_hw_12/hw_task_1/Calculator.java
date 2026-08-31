package java_hw_12.hw_task_1;

import java.util.Scanner;

public class Calculator {

    public int operationHandler(String symbol, int a, int b) {
        switch (symbol) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    throw new DivisionByZero("Error: you can't divide by zero");
                }
            default:
                throw new UnexpectedExeption("An unexpected error occurred");
        }
    }

    public void calculatorApp(Scanner scanner) {
        while (true) {
            System.out.println("Keep working with calculator? y/n");
            String work = scanner.nextLine();
            if (work.equalsIgnoreCase("y")) {
                try {
                    System.out.println("Enter please the first value");
                    int firstNumber = parseToInteger(scanner);

                    System.out.println("Enter please the second value");
                    int secondNumber = parseToInteger(scanner);

                    System.out.println("Enter please symbol of the operation");
                    String symbol = scanner.nextLine();

                    int result = operationHandler(symbol, firstNumber, secondNumber);
                    System.out.println(result);
                } catch (DivisionByZero e) {
                    System.out.println(e.getMessage());
                } catch (ValueError e) {
                    System.out.println(e.getMessage());
                } catch (UnexpectedExeption e) {
                    System.out.println(e.getMessage());
                }
            } else if (work.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Choose correct option");
            }
        }
    }

    public static int parseToInteger(Scanner scanner) {
        String value = scanner.nextLine();
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new ValueError("Error: You entered non-numerical value");
        }
    }
}
