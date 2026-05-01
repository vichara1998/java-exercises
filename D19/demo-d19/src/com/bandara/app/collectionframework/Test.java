package com.bandara.app.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Test {
    public void arrListCheck() {

        int[] arr = new int[12];
        arr[0] = 12;
        System.out.println(arr[11]);


        ArrayList arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add("Bandara");
        arrayList.add(12.5);
        arrayList.add(new Employee());

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(15);
        //arrayList2.add("Bandara");
        //arrayList2.add(12.5);
        //arrayList2.add(new Employee());

        ArrayList<Object> arrayList3 = new ArrayList();
        arrayList3.add(15);
        arrayList3.add("Bandara");
        arrayList3.add(12.5);

        arrayList3.add(new Employee());
        arrayList3.remove(1);

        System.out.println(arrayList.get(3));
        System.out.println(arrayList2.get(0));
        System.out.println(arrayList3);

        //data smallest value first
        PriorityQueue pq = new PriorityQueue();
        pq.add(23);
        pq.add(234);
        pq.add(26);
        pq.add(2633);
        pq.add(13);

        System.out.println(pq);

        //no duplicate [55,33]   no get()
        HashSet hs = new HashSet();
        hs.add(55);
        hs.add(55);
        hs.add(33);
        System.out.println(hs);

        for (Object x : hs) {
        }
        //key value pair
        HashMap hm = new HashMap();
        hm.put(0, 11);
        hm.put(1, 13);
        hm.put(2, 1232);

        System.out.println(hm.get(0));
        HashMap<String, Integer> hm2 = new HashMap();
        hm2.put("amal", 11);
        hm2.put("saman", 13);
        hm2.put("bimal", 1232);

        System.out.println(hm2.get("saman"));

//return arrayList3;
    }

    public static int add() {
        int num1 = 1;
        int num2 = 3;
        int tot = num1 + num2;
        return tot;
    }
}



