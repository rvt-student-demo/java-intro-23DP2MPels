package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Integer> summa = new ArrayList<>();

        int a = 0;
        int sumbla = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            summa.add(number);
            sumbla = sumbla + summa.get(a);
            a=a+1;

        }  
        System.out.println(summa);
        System.out.println(summa.get(1)+summa.get(2));
        System.out.println(sumbla);

    } 
}