package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Ex3 {
    void MyLocalTime(){
        LocalTime time =LocalTime.now();
        DateTimeFormatter myformat= DateTimeFormatter.ofPattern("HH:mm:ss");
        time.format(myformat);
        System.out.println(time);
    }
    void GlobalTime(){
        Date now= new Date();
        TimeZone myTimeZone= TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+0"));
        System.out.println(""+now.getHours()+"."+now.getMinutes()+"."+now.getSeconds());


    }
}
