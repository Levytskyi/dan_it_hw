package java_hw_8.hw_task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();
        ListHandler startProgram = new ListHandler();
        startProgram.startProgram(scanner, people);
    }
}
