package java_hw_9.hw_task_2;

public class Program {
    public static void main(String[] args) {
        Vehicle car = Vehicle.getInstance();
        Vehicle boat = Vehicle.getInstance();
        Vehicle bicycle = Vehicle.getInstance();
        Vehicle horse = Vehicle.getInstance();

        System.out.println(car);
        System.out.println(boat);
        System.out.println(bicycle);
        System.out.println(horse);

        car.getInstance().sayHello();
        horse.getInstance().printMyName("Misha");
    }
}
