package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ierakstiet skaitli.");
        int factorials = Integer.valueOf(scanner.nextLine());
        int facSumma = 1;

        for (int i = 1; i <= factorials; i++) {
            facSumma = facSumma * i;
        }
        System.out.println(facSumma);
    }
}
