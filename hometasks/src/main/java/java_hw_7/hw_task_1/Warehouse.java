package java_hw_7.hw_task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {

    private List<T> newDelivery = new ArrayList<>();

    public void addItem(T item) {
        newDelivery.add(item);
        System.out.println("New item was added to the list");
    }

    public int getItemCount() {
        System.out.println("The size of the list is: ");
        return newDelivery.size();
    }

    public List<T> retrieveAll() {
        List<T> result = new ArrayList<>(newDelivery);
        newDelivery.clear();
        return result;
    }

    public List<T> viewItems() {
        return newDelivery;
    }

    public boolean isEmpty() {
        System.out.println("The list is empty: ");
        return newDelivery.isEmpty();
    }

    public void clear() {
        newDelivery.clear();
        System.out.println("The list has cleared");
    }
}
