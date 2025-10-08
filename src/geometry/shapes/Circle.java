package geometry.shapes;

public class Circle extends Shape implements FlatShape {

    private double radius;
    private static double pi = 3.14159265359;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return (2 * pi * radius);
    }

    public double calculateArea() {
        return (pi * radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }
}