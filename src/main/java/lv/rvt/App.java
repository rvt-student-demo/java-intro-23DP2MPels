package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet savu vārdu");

        String name = scanner.nextLine();

        System.out.println("Ievadiet savu uzvārdu");

        String lastname = scanner.nextLine();

        System.out.println("Ievadiet savu grupas numuru");

        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);
    }      
} 
