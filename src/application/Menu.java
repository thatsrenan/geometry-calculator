package application;

import java.util.Scanner;

public class Menu {
    private Scanner sc;

    public Menu(Scanner sc) {
        this.sc = sc;
    }


    public int showMenu() {
        System.out.println("""
                
                MENU
                1 - 2D Shapes
                2 - 3D Shapes
                3 - EXIT
                """);
        int menuAwnser = sc.nextInt();
        return menuAwnser;
    }

    public int show2DShapes() {
        System.out.println("""
                1 - Circle
                2 - Square
                3 - Rectangle
                4 - Triangle
                """);
        int awnser2D = sc.nextInt();
        return awnser2D;
    }

    public int show3DShapes() {
        System.out.println("""
                1 - Cylinder
                2 - Cube
                3 - Rectangular Prism
                4 - Pyramid
                """);
        int awnser3D = sc.nextInt();;
        return awnser3D;
    }

    public static void invalidAwnser() {
        System.out.println("Invalid awnser.");
    }

}
