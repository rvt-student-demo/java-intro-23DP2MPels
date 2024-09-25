package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int ciparu_skaits = 0;
        int summa = 0;

        while (true) {
            System.out.println("Ierakstiet skaitli.");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Skaitļu skaits: "+ciparu_skaits);
                System.out.println("Skaitļu summa: "+summa);
                break;
            }
            else {
                ciparu_skaits = ciparu_skaits + 1;
                summa = summa + number;
            }
        }
    }
}
