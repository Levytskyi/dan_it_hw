package java_hw_3.hw_task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to know difference of your numbers. Enter please first value!");
        int a = scanner.nextInt();
        System.out.println("Enter please second value!");
        int b = scanner.nextInt();
        System.out.println("the difference between " + a + " and " + b + " is : " + result( a, b ));
    }

    public static int result(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber - secondNumber: secondNumber - firstNumber;
    }
}
