package java_hw_4.hw_task_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something please!");
        String someValue = scanner.nextLine();

        if (isPalindrome(someValue)) {
                System.out.println("Your word is palindrome");
        } else {
            System.out.println("Your word isn't palindrome");
        }
    }
    public static boolean isPalindrome(String string) {
        StringBuilder someString = new StringBuilder(string);
        someString.reverse();
        String reversed = someString.toString();
        return reversed.equals(string);
    }
}
