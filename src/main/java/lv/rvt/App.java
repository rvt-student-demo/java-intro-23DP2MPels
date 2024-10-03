package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args ) {
        
        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Sākuma skaitlis... ");
        //int reiz = Integer.valueOf(scanner.nextLine());
        //System.out.println(" ");
        noApgabalaKasDalasArTris(2,10);
        
        };

    public static void noApgabalaKasDalasArTris(int first,int second) {
        for (int i = first; i < second + 1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    } 
}
