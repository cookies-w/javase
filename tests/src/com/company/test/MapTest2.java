package com.company.test;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;

public class MapTest2 {
    private static Map<String, List<List<String>>> map1 =  new HashMap<>();
    private static Map<String, List<List<String>>> map2 =  new HashMap<>();
    private static Map<String, List<List<String>>> mapAdd =  new HashMap<>();
    private static Map<String, List<List<String>>> mapDel =  new HashMap<>();

    public static void main(String[] args) {
        System.out.println("1");
        test();

        for(Map.Entry<String, List<List<String>>> entry : map1.entrySet()){
            List<List<String>> strArrlist = entry.getValue();

            List<List<String>> add = new ArrayList<>();
            List<List<String>> del = new ArrayList<>();

            for(Map.Entry<String, List<List<String>>> entry2 : map2.entrySet()){
                List<List<String>> strArrlist2 = entry2.getValue();
                for(int i = 0; i < strArrlist.size(); i ++){
                    List<String> str = strArrlist.get(i);
                    List<String> str2 = strArrlist2.get(i);
                    List<String> l = str.stream().filter(num -> !str2.contains(num)).collect(Collectors.toList());
                    List<String> l2 = str2.stream().filter(num -> !str.contains(num)).collect(Collectors.toList());
                    add.add(l);
                    del.add(l2);

                }
            }
            mapAdd.put("map1", add);
            mapDel.put("map2", del);
        }

        for(Map.Entry<String, List<List<String>>> entry : mapAdd.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for(Map.Entry<String, List<List<String>>> entry : mapDel.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void test(){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        for(int i = 0; i < 4 ; i ++){
            String s = "" + i + "";
            list1.add(s);
        }
        for(int i = 6; i < 8 ; i ++){
            String s = "" + i + "";
            list1.add(s);
        }

        for(int i = 10; i < 20 ; i ++){
            String s = "" + i + "";
            list2.add(s);
        }
        for(int i = 2; i < 7 ; i ++){
            String s = "" + i + "";
            list3.add(s);
        }
        for(int i = 9; i < 12 ; i ++){
            String s = "" + i + "";
            list3.add(s);
        }
        for(int i = 12; i < 22 ; i ++){
            String s = "" + i + "";
            list4.add(s);
        }
        List<List<String>> list5 = new ArrayList<>();
        List<List<String>> list6 = new ArrayList<>();
        list5.add(list1);
        list5.add(list2);
        list6.add(list3);
        list6.add(list4);
        map1.put("map1", list5);
        map2.put("map2", list6);

        for(Map.Entry<String, List<List<String>>> entry : map1.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for(Map.Entry<String, List<List<String>>> entry : map2.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }



}
