package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sākuma skaitlis... ");
        int reiz = Integer.valueOf(scanner.nextLine());
        System.out.println(" ");
        noVienslidzParametrom(reiz);
        
        };

    public static void noVienslidzParametrom(int parm) {
        for (int i = 1; i <= parm; i++) {
            System.out.println(i);
        }
    } 
}
