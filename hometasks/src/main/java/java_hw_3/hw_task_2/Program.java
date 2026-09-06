package java_hw_3.hw_task_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello my friend! Do you want to know if you can make a triangle from your numbers?");
        System.out.println("Enter please length of the first side!");

        int a = scanner.nextInt();
        System.out.println("Enter please length of the second side!");
        int b = scanner.nextInt();
        System.out.println("Enter please length of the third side!");
        int c = scanner.nextInt();

        System.out.println(result( a, b, c ));



    }
    public static String result(int firstSide, int secondSide, int thirdSide){
        if( firstSide + secondSide > thirdSide && thirdSide + firstSide > secondSide && secondSide + thirdSide > firstSide) {
            return "You can make triangle!";
        } else {
            return "You can't make triangle.";
        }
    }
}
