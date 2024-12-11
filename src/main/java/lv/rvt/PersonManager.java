package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {

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
            int weight_m = Integer.parseInt(parts[2]);;
            int height_m = Integer.parseInt(parts[3]);;

            Person person = new Person(name_m, age_m, weight_m, height_m);
            personList.add(person);

            System.out.printf("| %-7s | %-3d | %-6d | %-6d | %-21.2f |\n",
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
