package java_hw_8.hw_task_1;

import java.util.Map;
import java.util.Scanner;

public class ListHandler {

    public void addPerson(Map<String, Person> people, String surname, Person person) {
        people.put(surname.toUpperCase(), person);
        System.out.println(surname.toUpperCase() + " has been added to your list");
    }

    public void getPerson(Map<String, Person> people, String key) {
        System.out.println(people.get(key));
    }

    public void startProgram(Scanner scanner, Map<String, Person> people) {
        while (true) {
            System.out.println("Hello, what do you want to do with your list today?");
            System.out.println("Enter <1> if you want to add new person");
            System.out.println("Enter <2> if you want to find the person");
            System.out.println("Enter <3> if you want to exit");
            String option = scanner.nextLine();
            while (true) {
                if (option.trim().equalsIgnoreCase("1") || option.trim().equalsIgnoreCase("2") || option.trim().equalsIgnoreCase("3")) {
                    break;
                } else {
                    System.out.println("Enter correct option please");
                    option = scanner.nextLine();
                }
            }
            switch (option.trim()) {
                case "1":
                    System.out.println("Enter surname please");
                    String surname = scanner.nextLine();
                    System.out.println("Enter name please");
                    String name = scanner.nextLine();
                    System.out.println("Enter age please");
                    int age;
                    while (true) {
                        if (scanner.hasNextInt()) {
                            age = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Please enter correct value of age");
                            scanner.nextLine();
                        }
                    }

                    Person person = new Person(surname.toUpperCase(), name, age);
                    boolean alreadyExist = people.containsKey(person.getSurname().toUpperCase());

                    if (alreadyExist) {
                        System.out.println("Person with surname: " + person.getSurname().toUpperCase() + " already exist!");
                        System.out.println("Do you want to replace it?");
                        String replace = scanner.nextLine();
                        while (true) {
                            if (replace.equalsIgnoreCase("yes")) {
                                addPerson(people, surname, person);
                                break;
                            } else if (replace.equalsIgnoreCase("no")) {
                                break;
                            } else {
                                System.out.println("Enter only yes/no");
                                replace = scanner.nextLine();
                            }
                        }
                    } else {
                        addPerson(people, surname, person);
                    }
                    break;
                case "2":
                    if (!people.isEmpty()) {
                        System.out.println("Enter surname please");
                        String surnameThatNeedFind = scanner.nextLine();
                        while (true) {
                            if (people.containsKey(surnameThatNeedFind.toUpperCase())) {
                                getPerson(people, surnameThatNeedFind.toUpperCase());
                                break;
                            } else {
                                System.out.println("Your person hasn't found, please check it and try again");
                                surnameThatNeedFind = scanner.nextLine();
                            }
                        }
                    } else {
                        System.out.println("The list is empty");
                        break;
                    }
                    break;
                case "3":
                    return;
            }
        }
    }
}
