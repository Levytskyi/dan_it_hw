package java_hw_12.hw_task_2;

public class Vehicle {
    private String name;
    private int speed;
    private int price;
    private int countOfWheels;

    public Vehicle(String name, int speed, int price, int countOfWheels) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.countOfWheels = countOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
