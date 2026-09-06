package java_hw_4.hw_task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter capacity of your storage please!");
        int storage = scanner.nextInt();

        System.out.println("What weight do you want to leave in your storage?");
        int someWeight = scanner.nextInt();

        while (storage > 0 ) {
            if (someWeight < 5){
                System.out.println("You can't put less than 5 kg");
                someWeight = scanner.nextInt();
            } else if (someWeight > storage) {
                System.out.println("Our storage is too small for your weight");
                someWeight = scanner.nextInt();
            } else if (someWeight >= 5 && storage >= someWeight) {
                storage = storage - someWeight;
                System.out.println("Storage left: " + storage);
                if(storage >= 5) {
                    someWeight = scanner.nextInt();
                }
            }
            if (storage < 5 ) {
                System.out.println("The storage is full!");
                break;
            }
        }
    }
}
