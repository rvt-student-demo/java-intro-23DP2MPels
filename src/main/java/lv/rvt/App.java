package lv.rvt; // klases atrašanas vieta projektā

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        // Mēs gribam uzzināt no lietotaā: Vārdu Uzvārdu un grupu
        System.out.println("Uzraksties savu vārdu");
        String vards = scanner.nextLine();
        System.out.println("Uzraksties savu vārdu");
        String uzvards = scanner.nextLine();
        System.out.println("Uzraksties savu vārdu");
        String grupa = scanner.nextLine();

        System.out.println(vards+", "+uzvards+", "+grupa);

    }      
} 
