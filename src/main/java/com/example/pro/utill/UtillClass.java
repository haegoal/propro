package com.example.pro.utill;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtillClass {

    public static String dateTimeFormat(LocalDateTime dateTime){
        if(dateTime==null)
            return null;
        else
            return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
