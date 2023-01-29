package com.company.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(date);
        System.out.println(dateTime);

        String time = "2002-07-30 06:10:00";
        Date times = sdf.parse(time);
        System.out.println(times);

        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);
    }
}
