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

        for(i=0 ; i < 3 ; i++) {

            int userInput = scanner.nextInt();

            if (userInput == val) {
                System.out.println("Right!");
                    break;
            }
            else if (userInput == val+1 || userInput == val-1) {
                System.out.println("hot!");
            }
            else if (userInput == val+2 || userInput == val-2) {
                System.out.println("Warm");
            }
            else{
                System.out.println("Cold");
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