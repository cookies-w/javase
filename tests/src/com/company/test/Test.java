package com.company.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String time1 = "202209011055".substring(0,8);
        String time2 = "202208250840".substring(0,8);
        int time = Integer.parseInt(time1) - Integer.parseInt(time2);
        System.out.println(time);

        String dateStart = "20220902024332".substring(0,8);
        String dateStop = "20220825164555".substring(0,8);

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);

            //毫秒ms
            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = Math.abs(diff / 1000);
            long diffDays = Math.abs(diff / (24 * 60 * 60 * 1000));

            System.out.print("两个时间相差：");
            System.out.print(diffDays + " 天, ");
            System.out.print(diffSeconds + " 秒.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String s = "double(5,2)";
        String[] split = s.split("[()]+");
        for (String s1 : split) {
            System.out.println(s1);
        }

        String ecode = "MbsdCore-21423432";
        boolean sign = ecode.charAt(0) >= 'a' && ecode.charAt(0) <= 'z';
        System.out.println(sign);

        System.out.println("master test");

        System.out.println("11111111");

    }
}
