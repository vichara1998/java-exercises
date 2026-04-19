package com.bandara.app;

import com.bandara.app.model.Student;

public class Main {
     public static void main(String[] args) {
        Student std =new Student();
        std=null;


        String a="98";
        int b=Integer.parseInt(a);
        /*final int a=2;
        System.out.println(a);*/
         System.gc();
         System.out.println(b);
         System.out.println(Integer.MAX_VALUE);
    }
}
