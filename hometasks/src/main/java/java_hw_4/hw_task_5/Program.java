package java_hw_4.hw_task_5;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*99);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter please some value 0-99");
        int guessNumber = scanner.nextInt();
        boolean exist = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == guessNumber) {
                exist = true;
            }
        }

        if (exist) {
            System.out.println("The list contains your number!");
        } else {
            System.out.println("Sorry, not today!");
        }
    }
}
