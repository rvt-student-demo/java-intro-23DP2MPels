package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
    
        Random rand = new Random();

        int i = 0;
        int won_round = 0;

        for(int roundi=1 ; roundi < 11 ; roundi++) {

            int val = rand.nextInt(1,11);

            System.out.println("\nRound "+roundi+":");

            System.out.println("\nI am thinking of a number from 1 to 10. ");
            System.out.println("You must guess what it is in three tries.");
            System.out.println("Enter a guess:");

            for(i=0 ; i < 3 ; i++) {

                int userInput = scanner.nextInt();

                if (userInput == val) {
                    System.out.println("Right!");
                    won_round = won_round + 1;
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

            if(i >= 3) {
                System.out.println("The correct number was "+val);
            }

            System.out.println("You have won "+won_round+" out of "+roundi+" rounds.");


        }

        switch (won_round) {
            case 8:
                System.out.println("Your rating: amateur.");
                break;
            case 9:
                System.out.println("Your rating: professionals.");
                break;
            case 10:
                System.out.println("Your rating: hackers.");
                break;
            default:
                System.out.println("Your rating: amateurs.");
                break;
        }

        

    } 
}