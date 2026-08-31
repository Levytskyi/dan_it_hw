package java_hw_9.hw_task_3;

public class AnimalFactory {

    public Animal createAnimal(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Bird":
                return new Bird();
            default:
                System.out.println("You entered incorrect type of animals");
                return null;
        }
    }
}
