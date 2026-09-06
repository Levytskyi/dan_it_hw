package java_hw_9.hw_task_1;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getSpeed() - car2.getSpeed();
    }

}
