package com.bandara.app.collectionframework.StringAPI;

public class Test {
    public static void main(String[] args) {
String name="Bndara";
String name2="ABC";

String name3=new String("RTT");

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.substring(2));
        System.out.println(name.concat("fff"));

        StringBuilder sb =new StringBuilder("A");
        System.out.println(sb);
        sb.append("B");
        System.out.println(sb);

        StringBuffer sbuf =new StringBuffer("C");
        System.out.println(sbuf);
        sbuf.append("D");
        System.out.println(sbuf);



    }
}
