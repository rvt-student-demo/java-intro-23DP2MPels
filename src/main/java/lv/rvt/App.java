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
        int score = 5;

        System.out.println("I am thinking of a number from 1 to 10. ");
        System.out.println("Try to guess the number."+"\nYour beginning score is 5 points. "+"\nEach time you guess wrong, your score is decreased by one.");
        System.out.println("\nEnter a guess:");

        for(i=0 ; i < 5 ; i++) {

            int userInput = scanner.nextInt();

            if (userInput == val) {
                System.out.println("Right!");
                break;
            }
            else if (userInput > val) {
                score = score - 1;
                System.out.println("Too high! Your score is "+score);
            }
            else{
                score = score - 1;
                System.out.println("Too low! Your score is "+score);
            }
        }

        if(score > 0) {
            System.out.println("You have won the game!");
            System.out.println("Yur score is "+score);
        }
        else {
            System.out.println("You have LOST the game!");
        }

        

    } 
}