package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int InputFirst = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");

        int InputSecond = Integer.valueOf(scanner.nextLine());

        System.out.println(InputFirst + " + " + InputSecond + " = " + (InputFirst + InputSecond));
        System.out.println(InputFirst + " - " + InputSecond + " = " + (InputFirst - InputSecond));
        System.out.println(InputFirst + " * " + InputSecond + " = " + (InputFirst * InputSecond));
        System.out.println(InputFirst + " / " + InputSecond + " = " + (double) InputFirst / InputSecond);

    }      
} 
