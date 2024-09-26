package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ierakstiet skaitli.");
        int reiz = Integer.valueOf(scanner.nextLine());

        for (int i = reiz; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
