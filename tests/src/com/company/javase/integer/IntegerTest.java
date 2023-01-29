package com.company.javase.integer;

public class IntegerTest {
    public static void main(String[] args) {
        // String --> int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 1); // 101

        // int --> String
        String s2 = i1 + "";
        System.out.println(s2 + 1); // 1001

        String s3 = String.valueOf(i1);
        System.out.println(s3 + 1); // 1001

        // int --> Integer
        Integer x = Integer.valueOf(i1);
        System.out.println(x + 1); // 101

        Integer x2 = 1000;
        System.out.println(x2 + 1); // 1001

        // Integer --> int
        int i2 = x.intValue();
        System.out.println(i2 + 1); // 101

        int i3 = x2;
        System.out.println(i3 + 1); // 1001

        // String --> Integer
        String s4 = "123";
        Integer y = Integer.valueOf(s4);
        System.out.println(y + 1); // 124

        // Integer --> String
        String s5 = String.valueOf(y);
        System.out.println(s5 + 1); // 1231

    }
}
