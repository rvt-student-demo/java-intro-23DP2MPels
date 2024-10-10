package lv.rvt; // klases atrašanas vieta projektā

import java.util.*;

public class Stars {

    public static void printStars(int number) {
        for(int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        //System.out.println("");
    }

    public static void printSpace(int number) {
        for(int i = number; i >= 1; i--) {
            System.out.print(" ");
        }
        //System.out.println("");
    }

    public static void printSquare(int size) {
        for(int i = 1; i <= size; i++) {
            Stars.printStars(size);
            System.out.println("");
        }

    }

    public static void printRectangle(int width, int height) {
        for(int i = 1; i <= height; i++) {
            Stars.printStars(width);
            System.out.println("");
        }
    }
    
    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            Stars.printStars(i);
            System.out.println("");
        }
    }

    public static void printTriangleMirror(int size) {
        for(int i = 1; i <= size; i++) {
            Stars.printSpace(size-i);
            Stars.printStars(i);
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        for(int i = 1; i <= height; i++) {
            Stars.printSpace(height-i);
            Stars.printStars(i);
            Stars.printStars(i-1);
            System.out.println("");
        }

        for(int i = 1; i <= 2; i++) {
            Stars.printSpace(height-2);
            System.out.print("***");
            Stars.printSpace(height-2);
            System.out.println("");
        }
           
    }
}

