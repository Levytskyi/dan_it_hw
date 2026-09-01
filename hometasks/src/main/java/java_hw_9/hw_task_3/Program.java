package java_hw_9.hw_task_3;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.createAnimal("Dog");
        Animal cat = animalFactory.createAnimal("Cat");
        Animal bird = animalFactory.createAnimal("Bird");

        dog.speak();
        cat.speak();
        bird.speak();
    }
}
