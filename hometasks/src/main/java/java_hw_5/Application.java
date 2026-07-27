package java_hw_5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please!");
        String name = scanner.nextLine();
        NumbersApplication numbersApplication = new NumbersApplication(name);
        numbersApplication.startGame(scanner);
    }
}
