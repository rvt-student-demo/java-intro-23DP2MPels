package lv.rvt; // klases atrašanas vieta projektā
import java.util.*;

public class App
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = ("");
        ArrayList<String> strList = new ArrayList<>();
        int index = 1;

        while (true) {
            if(index == 0) {
                break;
            }
            else {
                input = (scanner.nextLine());
                strList.add(input);
                index = input.compareTo("");
            }
        }

        System.out.println(strList.get(2));

    } 
}