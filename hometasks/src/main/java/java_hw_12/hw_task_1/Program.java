package java_hw_12.hw_task_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to calculator");
        Calculator calculator = new Calculator();
        calculator.calculatorApp(scanner);

        System.out.println("Calculator has finished working");
    }
}
