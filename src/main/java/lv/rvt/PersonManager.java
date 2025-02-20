package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

    public static void run() throws Exception {
        
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
                    float weigth = scanner.nextInt();
                    System.out.println("Ierakstiet personas Augstumu");
                    float height = scanner.nextInt();
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

    public static void getPersonList() throws Exception{
        BufferedReader reader = Helper.getReader("persons.csv");
        
        ArrayList<Person> personList = new ArrayList<>();
        String line;
        
        reader.readLine();

        System.out.println("-----------------------------------------------------------");
        System.out.println("| Name    | Age | Weight | Height | BMI (body mass index) |");
        System.out.println("-----------------------------------------------------------");

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            String name_m = shortenName(parts[0], 7);
            int age_m = Integer.parseInt(parts[1]);
            float weight_m = Float.parseFloat(parts[2]);
            float height_m = Float.parseFloat(parts[3]);

            Person person = new Person(name_m, age_m, weight_m, height_m);
            personList.add(person);

            System.out.printf("| %-7s | %-3d | %-6.1f | %-6.1f | %-21.2f |\n",
                            name_m, age_m, weight_m, height_m, Person.bodyMassIndex(person));
        }

        System.out.println("-----------------------------------------------------------");
    }
    
    public static void addPerson(Person person) throws Exception{

        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
        
    }

    private static String shortenName(String name, int maxLength) {
        if (name.length() > maxLength) {
            return name.substring(0, maxLength - 1) + ".";
        }
        return name;
    }

}
