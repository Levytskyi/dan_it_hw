package java_hw_9.hw_task_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Car bmw = new Car("bmw", 220);
        Car opel = new Car("opel", 180);
        Car mercedes = new Car("mercedes", 250);
        Car reno = new Car("reno", 140);
        Car toyota = new Car("toyota", 160);

        carList.add(bmw);
        carList.add(opel);
        carList.add(mercedes);
        carList.add(reno);
        carList.add(toyota);
        System.out.println(carList);

        System.out.println("--------------------");

        CarComparator carComparator = new CarComparator();
        carList.sort(carComparator);
        System.out.println(carList);
    }
}
