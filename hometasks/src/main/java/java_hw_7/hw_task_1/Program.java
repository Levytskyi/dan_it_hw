package java_hw_7.hw_task_1;

public class Program {
    public static void main(String[] args) {
        Warehouse<String> warehouse = new Warehouse<>();

        warehouse.addItem("One");
        warehouse.addItem("Two");
        warehouse.addItem("Three");

        System.out.println(warehouse.getItemCount());
        System.out.println(warehouse.viewItems());
        System.out.println(warehouse.isEmpty());
        System.out.println(warehouse.retrieveAll());
        System.out.println(warehouse.isEmpty());

        warehouse.addItem("Three");
        warehouse.addItem("Four");
        warehouse.addItem("Five");

        System.out.println(warehouse.viewItems());
        warehouse.clear();
        System.out.println(warehouse.isEmpty());

    }
}
