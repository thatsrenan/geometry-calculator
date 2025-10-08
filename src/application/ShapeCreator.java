package application;

import geometry.shapes.*;
import java.util.Scanner;

public class ShapeCreator {
    private Scanner sc;

    public ShapeCreator(Scanner sc) {
        this.sc = sc;
    }

    // ----- 2D SHAPES -----
    public void createCircle() {
        System.out.println("Circle");
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }

    public void createSquare() {
        System.out.println("Square");
        System.out.print("Side: ");
        double side = sc.nextDouble();

        Square square = new Square(side);
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }

    public void createRectangle() {
        System.out.println("Rectangle");
        System.out.print("Side A: ");
        double a = sc.nextDouble();
        System.out.print("Side B: ");
        double b = sc.nextDouble();

        Rectangle rectangle = new Rectangle(a, b);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }

    public void createTriangle() {
        System.out.println("Triangle");
        System.out.print("Side A: ");
        double a = sc.nextDouble();
        System.out.print("Side B: ");
        double b = sc.nextDouble();
        System.out.print("Side C: ");
        double c = sc.nextDouble();

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }

    // ----- 3D SHAPES -----
    public void createCylinder() {
        System.out.println("Cylinder");
        System.out.print("Radius: ");
        double r = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();

        Cylinder cylinder = new Cylinder(h, r);
        System.out.println("Volume: " + cylinder.calculateVolume());
        System.out.println("Surface Area: " + cylinder.calculateSurfaceArea());
    }

    public void createCube() {
        System.out.println("Cube");
        System.out.print("Side: ");
        double s = sc.nextDouble();

        Cube cube = new Cube(s);
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }

    public void createRectangularPrism() {
        System.out.println("Rectangular Prism");
        System.out.print("Side A: ");
        double a = sc.nextDouble();
        System.out.print("Side B: ");
        double b = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();

        RectangularPrism rp = new RectangularPrism(a, b, h);
        System.out.println("Volume: " + rp.calculateVolume());
        System.out.println("Surface Area: " + rp.calculateSurfaceArea());
    }

    public void createPyramid() {
        System.out.println("Pyramid");

        System.out.print("Base Side: ");
        double side = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();

        Pyramid pyramid = new Pyramid(side, height);
        System.out.println("Volume: " + pyramid.calculateVolume());
        System.out.println("Surface Area: " + pyramid.calculateSurfaceArea());
    }
}
