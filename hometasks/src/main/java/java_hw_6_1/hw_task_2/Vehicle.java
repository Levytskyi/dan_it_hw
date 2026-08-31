package java_hw_6_1.hw_task_2;

public class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public void move() {
        System.out.println("The vehicle moves with speed: " + this.speed + "km/h");
    }

    public void stop() {
        System.out.println("The vehicle " + this.name + " stopped");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
