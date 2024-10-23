package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Account myAccount = new Account("My account", 0.00);
        Account matthewsAccount = new Account("Matthew's account", 1000.00);

        System.out.println("Initial state");
        System.out.println(myAccount);
        System.out.println(matthewsAccount);

        System.out.println("");

        myAccount.deposit(100);
        matthewsAccount.withdrawal(100);
        System.out.println("The balance of MY account is now: " + myAccount.balance());
        System.out.println("The balance of Matthews account is now: " + matthewsAccount.balance());

        System.out.println("");

        System.out.println("End state");
        System.out.println(myAccount);
        System.out.println(matthewsAccount);
    } 
}