package geometry.shapes;

public class Pyramid extends Square implements ThreeDimensional {
    private double height;

    public Pyramid(double side, double height) {
        super(side);
        this.height = height;
    }

    public double calculateVolume() {
        return (calculateArea() * height) / 3;
    }

    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(getSide()/2, 2) + Math.pow(height, 2));
        double lateralArea = 2 * getSide() * slantHeight;
        return calculateArea() + lateralArea;
    }
}