package lv.rvt; // klases atrašanas vieta projektā
import java.io.BufferedReader;
import java.util.*;

public class App
{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = Utils.getReader("persons.csv");
        
        ArrayList<Person> personList = new ArrayList<>();

        String line;
        double average_age = 0;

        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            //System.out.println("Name: " + parts[0]);

            int age_m = Integer.parseInt(parts[1]);
            int weight_m = Integer.parseInt(parts[2]);;
            int height_m = Integer.parseInt(parts[3]);;

            average_age += age_m;

            Person person = new Person(parts[0], age_m, weight_m, height_m);
            
            personList.add(person);
        }
        
        for(int i = 0; i < personList.size(); i++) {
                System.out.println(personList.get(i));
            }
        
            System.out.println("Vidējais vecums ir " + average_age/personList.size() + " gadi");
    }
} 