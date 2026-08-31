package java_hw_3.hw_task_4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of the day!");

        int dayNumber = scanner.nextInt();

        System.out.println(dayOfWeek(dayNumber));
    }

    public static String dayOfWeek(int value) {
        if ( value == 1) {
            return "Понеділок";
        } else if( value == 2) {
            return "Вівторок";
        } else if( value == 3) {
            return "Середа";
        } else if ( value == 4) {
            return "Четвер";
        } else if ( value == 5) {
            return "П'ятниця";
        } else if ( value == 6) {
            return "Субота";
        } else if ( value == 7) {
            return "Неділя";
        } else {
            return "Краще б сьогодні була п'ятниця";
        }
    }
}
