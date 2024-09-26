package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int ciparu_skaits = 0;
        int videjais = 0;

        while (true) {
            System.out.println("Ierakstiet skaitli.");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (ciparu_skaits == 0) {
                    System.out.println("Nevar izreiķināt vidējo");
                    break;
                }
                else {
                    System.out.println("Pozitivu skaitļu vidējais aritmētiskais: "+((double)videjais/(double)ciparu_skaits));
                    break;
                }
            }   
            else {
                if (number > 0) {
                    ciparu_skaits = ciparu_skaits + 1;
                    videjais = videjais + number;
                }
                else {
                    continue;
                }
            }
        }
    }
}
