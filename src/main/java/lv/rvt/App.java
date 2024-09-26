package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ierakstiet skaitli.");

        int summa = 0;
        int skaitli = 0;
        int paraSK = 0;
        int neparaSK = 0;

        while (true) {
            int ievads1 = Integer.valueOf(scanner.nextLine());
        
            if (ievads1 == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Summa: "+summa);
                System.out.println("Skaitli: "+skaitli);
                System.out.println("Vidējais arit. : "+((double)summa/(double)skaitli));
                System.out.println("Pāra skaitļi: "+paraSK);
                System.out.println("Nepāra skaitļi: "+neparaSK);
                break;
            }
            else {
                summa = summa + ievads1;
                skaitli += 1;
                if (ievads1%2==0) {
                    paraSK += 1;
                }
                else {
                    neparaSK += 1;
                }
            }
        }
        
    }
}
