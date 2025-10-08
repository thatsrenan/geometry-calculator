package geometry.shapes;

public class Rectangle extends Shape implements FlatShape {

    private double sideA;
    private double sideB;
    private double area;
    private double perimeter;

    public Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculatePerimeter() {
        perimeter = (sideA *2 + sideB *2);
        return perimeter;
    }

    public double calculateArea() {
        area = (sideA * sideB);
        return area;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}