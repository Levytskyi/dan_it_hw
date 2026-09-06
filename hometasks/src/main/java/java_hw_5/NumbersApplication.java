package java_hw_5;

import java.util.Scanner;
import java.util.Random;

public class NumbersApplication {
    Random random = new Random();
    private final String name;
    private final int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        this.gameNumber = random.nextInt(101);
    }

    public void startGame(Scanner scanner) {
        System.out.println("Enter your number please!");
        int someNumber = scanner.nextInt();
        while (true) {
            if (someNumber < this.gameNumber) {
                System.out.println("Your number is too small. Please, try again");
                System.out.println("Enter your number please!");
                someNumber = scanner.nextInt();
            } else if (someNumber > this.gameNumber) {
                System.out.println("Your number is too big. Please, try again");
                System.out.println("Enter your number please!");
                someNumber = scanner.nextInt();
            } else {
                System.out.println("Congratulations, " + this.name + "!");
                break;
            }
        }
    }
}
