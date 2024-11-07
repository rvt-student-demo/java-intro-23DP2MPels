package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args ) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i == -1) {
                break;
            }
            statistics.addNumber(i);
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statistics.evenCount());
        System.out.println("Sum of odd numbers: " + statistics.oddCount());

    }
}