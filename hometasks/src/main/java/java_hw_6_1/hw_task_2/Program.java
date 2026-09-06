package java_hw_6_1.hw_task_2;

public class Program {
    public static void main(String[] args) {
        Vehicle horse = new Vehicle("Basturma", 40);
        horse.move();
        horse.stop();

        Vehicle car = new Car("Opel Insignia", 240, 5);
        car.move();
        car.stop();

        Vehicle truck = new Truck("Man", 90, 10);
        truck.move();
        truck.stop();

    }
}
