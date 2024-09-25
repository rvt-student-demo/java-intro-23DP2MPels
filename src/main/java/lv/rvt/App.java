package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ierakstiet skaitli.");
            int number = Integer.valueOf(scanner.nextLine());
    
            if (number > 0) {
                System.out.println(number*number);
            }
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            if (number == 0) {
                break;
            }
        }
    }
}
