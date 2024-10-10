package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main(String[] args) {
        Stars.printStars(5);
        System.out.println("");
        Stars.printStars(3);
        System.out.println("");
        Stars.printStars(9);
        System.out.println("");

        System.out.println("");

        Stars.printSquare(4);

        System.out.println("");

        Stars.printRectangle(17, 3);

        System.out.println("");

        Stars.printTriangle(4);

        System.out.println("");

        Stars.printTriangleMirror(4);

        System.out.println("");

        Stars.christmasTree(10);
    } 
}