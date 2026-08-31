package java_hw_6_2.hw_task_1;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
    return side * side;
    }

    @Override
    public double getPerimeter() {
    return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
