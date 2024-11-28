package lv.rvt; // klases atrašanas vieta projektā
import java.io.BufferedReader;
import java.util.*;

public class App
{
    public static void main(String[] args) {

        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);


        System.out.println();

        
        Counter books = new Counter(20);
        Counter soldBooks = new Counter();

        books.decrease(5);
        soldBooks.increase(5);

        System.out.println(books.value());
        System.out.println(soldBooks.value());
    }
} 