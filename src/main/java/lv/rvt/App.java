package lv.rvt; // klases atrašanas vieta projektā

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadiet savu vādru");
        
        String name = scanner.nextLine();

        System.out.println("Sveiki, " + name + "!");
    }

}
