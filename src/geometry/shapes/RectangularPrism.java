package geometry.shapes;

public class RectangularPrism extends Rectangle implements ThreeDimensional {

    private double volume;
    private double height;
    private double surfaceArea;

    public RectangularPrism(double sideA, double sideB, double height) {
        super(sideA, sideB);
        this.height = height;
    }

    public double calculateVolume() {
        volume = calculateArea() * height;
        return volume;
    }

    public double calculateSurfaceArea() {
        surfaceArea = (calculateArea() * 2 + getSideA() * height * 2 + getSideB() * height * 2);
        return surfaceArea;
    }
}