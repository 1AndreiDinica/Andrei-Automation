package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class alarmClock {

    public static void main(String[] args){

        Random randomGenerator = new Random();
        boolean isVacation= randomGenerator.nextBoolean();
        System.out.println(isVacation);

        LocalDateTime Date = LocalDateTime.of(2023, 8, 6, 0, 0);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E");
        String formattedDate = Date.format(dateFormat);

        System.out.println(formattedDate);

        if(isVacation){
            if(formattedDate.equals("Sat") || formattedDate.equals("Sun")){
                System.out.println("Alarm clock is off");
            }else System.out.println("Alarm clock should go out at 10:00 any day");
        }else if(formattedDate.equals("Sat") || formattedDate.equals("Sun")){
            System.out.println("Alarm clock should start at 10:00 in the weekend");
        }else {
            System.out.println("Alarm clock should start at 07:00 in the weekdays");
        }



    }

}
