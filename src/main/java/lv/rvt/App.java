package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
    
        Random rand = new Random();
        int val = rand.nextInt(1,11);

        int i = 0;

        System.out.println("I am thinking of a number from 1 to 10. ");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:");

        System.out.println(val);

        for(i=0 ; i < 3 ; i++) {

            int userInput = scanner.nextInt();

            if (val == userInput) {
                System.out.println("Right!");
                break;
            }
            else {
                System.out.println("WRONG!");
            }
        }
        if(i < 3) {
            System.out.println("You have won the game!");
        }
        else {
            System.out.println("You have LOST the game!");
        }

        

    } 
}