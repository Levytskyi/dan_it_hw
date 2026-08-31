package java_hw_6_2.hw_task_1;

public class Circle extends Figure {
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double getArea() {
        return (radius * radius) * PI;
    }

    @Override
    public double getPerimeter() {
        return (2 * PI) * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
