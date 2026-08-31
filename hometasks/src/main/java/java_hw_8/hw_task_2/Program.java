package java_hw_8.hw_task_2;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        Person galya = new Person("Galyna", "Semenivna", 45);
        Person ilya = new Person("Ilya", "Hora", 15);
        Person kolya = new Person("Mykola", "Horbatyi", 32);
        Person galya1 = new Person("Galyna", "Semenivna", 45);
        Person kolya1 = new Person("Mykola", "Horbatyi", 32);

        people.add(galya);
        people.add(ilya);
        people.add(kolya);
        people.add(galya1);
        people.add(kolya1);
        System.out.println(people);

        System.out.println(people.size());

        System.out.println(people.contains(galya));

        people.remove(ilya);
        System.out.println(people);

        people.clear();
        System.out.println(people);

    }
}
