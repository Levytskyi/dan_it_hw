package java_hw_3.hw_task_5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What you want calculate? Enter symbol of operation");

        String symbol = scanner.nextLine();
        System.out.println("Enter the first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number!");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " " + symbol + " " + secondNumber + " = " + result(symbol, firstNumber, secondNumber));
    }

    public static int result(String symbol, int firstNumber, int secondNumber) {
        return symbol.equals("+") ? firstNumber + secondNumber
                : symbol.equals("-")  ? firstNumber - secondNumber
                : symbol.equals("*") ? firstNumber * secondNumber
                : symbol.equals("/") ? firstNumber / secondNumber
                : symbol.equals("%") ? firstNumber % secondNumber
                : 0;
    }
}
