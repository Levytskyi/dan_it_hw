package java_hw_9.hw_task_2;

public class Vehicle {
    private static Vehicle instance;

    private Vehicle() {
    }

    public static Vehicle getInstance() {
        if (instance == null) {
            instance = new Vehicle();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void printMyName(String name) {
        System.out.println("My name is " + name);
    }
}
