package geometry.shapes;

public class Cylinder extends Circle implements ThreeDimensional {

    private double height;
    private double volume;
    private double surfaceArea;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double calculateVolume() {
        volume = calculateArea() * height;
        return volume;
    }

    public double calculateSurfaceArea() {
        surfaceArea = (calculateArea() * 2) + (2 * getPi() * getRadius() * height);
        return surfaceArea;
    }
}