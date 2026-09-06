package java_hw_6_2.hw_task_1;

public class Program {
    public static void main(String[] args) {

        Figure square = new Square(10.2);
        System.out.println("Square area is:");
        System.out.println(square.getArea());
        System.out.println("Square perimeter is:");
        System.out.println(square.getPerimeter());

        Figure circle = new Circle(10.2);
        System.out.println("Circle area is:");
        System.out.println(circle.getArea());
        System.out.println("Circle perimeter is:");
        System.out.println(circle.getPerimeter());

        Figure triangle = new Triangle(10.2, 10.2, 10.2, 10.2);
        System.out.println("Triangle area is:");
        System.out.println(triangle.getArea());
        System.out.println("Triangle perimeter is:");
        System.out.println(triangle.getPerimeter());
    }
}
