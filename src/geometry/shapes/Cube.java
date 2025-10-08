package geometry.shapes;

public class Cube extends Square implements ThreeDimensional {

    private double volume;
    private double surfaceArea;

    public Cube(double side) {
        super(side);
    }

    public double calculateVolume() {
        volume = calculateArea() * getSide();
        return volume;
    }

    public double calculateSurfaceArea() {
        surfaceArea = calculateArea() * 6;
        return surfaceArea;
    }
}