package java_hw_4.hw_task_4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] time = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        System.out.println("Make your sentence!");

        System.out.println("Enter the first number please! (0-6");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number please! (0-5)");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number please! (0-5");
        int thirdNumber = scanner.nextInt();

        System.out.println(names[firstNumber]+ " буде йти у " + places[thirdNumber] + " o " + time[secondNumber] + ":00!");
    }
}
