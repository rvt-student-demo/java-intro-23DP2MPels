package lv.rvt;

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ierakstiet personas vārdu un vecumu piemērs --->  [Vārds], [Vecums]");

        PersonManager.addPerson(scanner.nextLine());


    }


}
