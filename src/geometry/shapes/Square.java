package geometry.shapes;

public class Square extends Shape implements FlatShape {

    private double side;
    private double area;
    private double perimeter;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double calculateArea() {
        area = (side * side);
        return area;
    }

    public double calculatePerimeter() {
        perimeter = (side *4);
        return perimeter;
    }

    public double getSide() {
        return side;
    }
}