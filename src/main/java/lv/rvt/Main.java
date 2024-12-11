package lv.rvt;

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        boolean isPrograRun = true;

        while (isPrograRun) {
            System.out.println();
            System.out.println("Ievadiet jūsu komandu (Priekš palidzībai ierakstiet \"help\")");
            System.out.println();
            switch (scanner.nextLine().toLowerCase()) {
                case "exit":
                    System.out.println("Thanks, bye bye!");
                    isPrograRun = false;
                    break;
                case "help":
                    System.out.println("show : parādit visas personas no csv faila");
                    System.out.println("add : pievienot personu csv failam");
                    System.out.println("help : parāda iespējamas komandas");
                    System.out.println("exit : aptur programmas darbību");
                    break;
                case "show":
                    PersonManager.getPersonList();
                    break;
                case "add":
                    System.out.println("Ierakstiet personas Vārdu");
                    String name = scanner.nextLine();
                    System.out.println("Ierakstiet personas Vecumu");
                    int age = scanner.nextInt();
                    System.out.println("Ierakstiet personas Svaru");
                    int weigth = scanner.nextInt();
                    System.out.println("Ierakstiet personas Augstumu");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    Person person = new Person(name, age, weigth, height);
                    PersonManager.addPerson(person);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
