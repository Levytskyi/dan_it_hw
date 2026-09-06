package java_hw_6_1.hw_task_2;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " has a load capacity of "+ this.loadCapacity + " tons and moves with speed " + getSpeed() + " km/h");
    }
}
