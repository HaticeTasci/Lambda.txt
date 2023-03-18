package dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date02 {
    public static void main(String[] args) {


        formatDateAndTime();
        printDateTime();


    }


    public static void formatDateAndTime(){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("before formatting : "+ localDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM/dd/yyyy hh:mm:ss a");

        String formattedDate= myFormatObj.format(localDateTime);
        System.out.println("After formatting : "+formattedDate);

    }


    public static void printDateTime(){
        LocalDateTime cdt= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(cdt);
    }



    public static void printTIme(){
        LocalTime time1= LocalTime.now();
        System.out.println(time1);//20:52:59.453598
    }



}

