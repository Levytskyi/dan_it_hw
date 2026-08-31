package java_hw_6_1.hw_task_2;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity)  {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " moves with speed " + getSpeed() + "km/h" + " and has a passenger capacity of " + this.passengerCapacity + ".");
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
