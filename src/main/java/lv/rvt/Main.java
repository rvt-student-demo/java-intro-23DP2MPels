package lv.rvt;

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Person matt = new Person("Matt");
        matt.setWeight(86);
        matt.setHeight(180);

        Person jasper = new Person("Jasper");
        jasper.setWeight(34);
        jasper.setHeight(132);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);

        if (waterTrack.allowedToRide(matt)) {
            System.out.println(matt.getName() + " may enter the ride");
        } else {
            System.out.println(matt.getName() + " may not enter the ride");
        }

        if (waterTrack.allowedToRide(jasper)) {
            System.out.println(jasper.getName() + " may enter the ride");
        } else {
            System.out.println(jasper.getName() + " may not enter the ride");
        }

        System.out.println(waterTrack);

    }
}
