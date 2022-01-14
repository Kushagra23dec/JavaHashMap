package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Map<String, Integer> marks = new HashMap<>();

        marks.put("naveen", 100);
        marks.put("Tom", 200);
        marks.put("Sam", 300);

        Scanner s = new Scanner(System.in);
        int i = 0;
//
//            while (i<=5) {
//                System.out.println("\n Enter Name: and Marks:  ");
//                marks.put(s.next(), s.nextInt());
//            i++;
//            }


        i = marks.size();
        System.out.println(" \n i: " + i);

        System.out.println(marks.get("Tom"));

        marks.put("Tom", 350);

        i = marks.size();
        System.out.println(" \n i: " + i);
        System.out.println(marks.get("Tom"));


       // System.out.println(marks);

//        Iterator it = marks.entrySet().iterator();
//
//        while (it.hasNext()) {
//            Map.Entry mapElement = (Map.Entry) it.next();
//
//            int var;
//            var = ((int) mapElement.getValue());
//            System.out.println(mapElement.getKey() + " : " + var);
//        }


        {
            for(Map.Entry mapelement : marks.entrySet()){
                String key = (String)mapelement.getKey();
                int value = (int)mapelement.getValue();

                System.out.println("Key: "+key+" Value: "+ value);
            }
        }
    }
}
