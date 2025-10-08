package geometry.shapes;

public class Triangle extends Shape implements FlatShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Triangle");
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Invalid triangle sides: " + sideA + ", " + sideB + ", " + sideC);
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        // Heron
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double calculatePerimeter() {
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            return sideA + sideB + sideC;
        } else {
            return 0;
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) &&
                (a + b > c) &&
                (a + c > b) &&
                (b + c > a);
    }

}