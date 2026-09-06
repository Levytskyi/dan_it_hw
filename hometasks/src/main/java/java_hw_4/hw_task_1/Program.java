package java_hw_4.hw_task_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String newString = "";

        while (!inputValue.equals("STOP")) {
            newString = newString + inputValue+ " " ;
            inputValue = scanner.nextLine();
        }
        System.out.println(newString.trim());
    }
}
