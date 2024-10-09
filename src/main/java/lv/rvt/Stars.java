package lv.rvt; // klases atrašanas vieta projektā

import java.util.*;

public class Stars {

    public static void printStars(int number) {
        for(int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for(int i = 1; i <= size; i++) {
            Stars.printStars(size);
        }

    }

    public static void printRectangle(int width, int height) {
        for(int i = 1; i <= height; i++) {
            Stars.printStars(width);
        }
    }
    
    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            Stars.printStars(i);
        }
    }
}

