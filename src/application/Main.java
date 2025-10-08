package application;

import geometry.shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc);
        ShapeCreator creator = new ShapeCreator(sc);
        boolean isRunning = true;

        while (isRunning) {

            int menuAwnser = menu.showMenu();

            switch (menuAwnser) {

                case 1:

                    int awnser2D = menu.show2DShapes();;

                    switch (awnser2D) {

                        case 1 -> creator.createCircle();
                        case 2 -> creator.createSquare();
                        case 3 -> creator.createRectangle();
                        case 4 -> creator.createTriangle();
                        case 5 -> menu.invalidAwnser();

                    }

                    break;

                case 2:

                    int awnser3D = menu.show3DShapes();

                    switch(awnser3D) {

                        case 1 -> creator.createCylinder();
                        case 2 -> creator.createCube();
                        case 3 -> creator.createRectangularPrism();
                        case 4 -> creator.createPyramid();
                        default -> menu.invalidAwnser();
                    }

                    break;

                case 3:

                    System.out.println("Stopping...");
                    isRunning = false;

                    break;

                default:

                    System.out.println("Invalid input.");

            }
        }
    }
}