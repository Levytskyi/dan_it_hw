package java_hw_9.hw_task_4;

public class Program {
    public static void main(String[] args) {
        Car car = new Car.Builder().setModel("Opel Insignia").setPrice(8000.1).setMaxSpeed(240).setCountOfWheels(4).build();
        System.out.println(car);
    }
}
