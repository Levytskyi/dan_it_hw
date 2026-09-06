package java_hw_11.hw_task_2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Person petro = new Person("Petro", "Slododyan", 77, 4000);
        Person ryta = new Person("Marharyta", "Voloshyna", 15, 300);
        Person stepan = new Person("Stepan", "Banderenko", 87, 15000);
        Person oleksiy = new Person("Oleksiy", "Havrylyuk", 35, 6000);
        Person tomek = new Person("Tomek", "Pshek", 44, 2000);

        List<Person> people = new ArrayList<>(List.of(petro, ryta, stepan, oleksiy, tomek));

        System.out.println(people);

        List<String> newPeople = people.stream().filter(n -> n.getAge() < 70).map(n -> n.getName()).toList();

        System.out.println(newPeople);
    }
}
