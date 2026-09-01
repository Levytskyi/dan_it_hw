package java_hw_12.hw_task_2;

import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("opel", 215, 10000, 4);
        Vehicle bike = null;

        Vehicle firstCarExample = Optional.ofNullable(car).orElse(new Vehicle("bmw", 220, 15000, 4));
        Vehicle secondCarExample = Optional.ofNullable(car).orElseGet(() -> new Vehicle("bmw", 220, 15000, 4));
        Optional.ofNullable(car).ifPresent(x -> System.out.println("Object exists: " + x));
        Optional.ofNullable(car).ifPresentOrElse(
                x -> System.out.println("Object exists: " + x),
                () -> System.out.println("Object is empty")
        );
        Vehicle thirdCarExample = Optional.ofNullable(car).orElseThrow(() -> new IllegalStateException("Object is empty"));
        System.out.println(firstCarExample);
        System.out.println(secondCarExample);
        System.out.println(thirdCarExample);

        Vehicle firstBikeExample = Optional.ofNullable(bike).orElse(new Vehicle("ukraine", 8, 500, 2));
        Vehicle secondBikeExample = Optional.ofNullable(bike).orElseGet(() -> new Vehicle("ukraine", 8, 500, 2));
        Optional.ofNullable(bike).ifPresent(x -> System.out.println("Object exists: " + x));
        Optional.ofNullable(bike).ifPresentOrElse(
                x -> System.out.println("Object exists: " + x),
                () -> System.out.println("Object is empty")
        );
        System.out.println(firstBikeExample);
        System.out.println(secondBikeExample);
        Vehicle thirdBikeExample = Optional.ofNullable(bike).orElseThrow(() -> new IllegalStateException("Object is empty"));
        System.out.println(thirdBikeExample);
    }
}
