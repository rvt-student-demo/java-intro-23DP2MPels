package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception{
        BufferedReader reader = Helper.getReader("persons.csv");
        
        ArrayList<Person> personList = new ArrayList<>();
        String line;
        
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            //System.out.println("Name: " + parts[0]);

            int age_m = Integer.parseInt(parts[1]);
            int weight_m = Integer.parseInt(parts[2]);;
            int height_m = Integer.parseInt(parts[3]);;

            Person person = new Person(parts[0], age_m, weight_m, height_m);
            
            personList.add(person);
        }

        return personList;
    }
    
    public static void addPerson(Person person) throws Exception{

        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
        
    }

}
