package com.sjtu.testiterator;


import java.util.*;

public class TestIterator {

    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<Integer>();

        testList.add(100);
        testList.add(200);
        testList.add(300);


      /*  for(Iterator<Integer> iterator = testList.iterator();iterator.hasNext();){
            Integer next = iterator.next();
            System.out.println(next);
        }*/


        Set<Integer> testSet = new HashSet<Integer>();

        testSet.add(100);
        testSet.add(200);
        testSet.add(300);


       /* for(Iterator<Integer> iterator = testSet.iterator(); iterator.hasNext();){
            Integer next = iterator.next();
            System.out.println("----"+next);
        }*/

        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(10,"100");
        map.put(20,"200");
        map.put(30,"300");
        map.put(40,"400");

       /* Set<Entry<Integer, String>> entries = map.entrySet();

        for(Iterator<Entry<Integer, String>> iterator = entries.iterator();iterator.hasNext();){
            Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());

        }*/

        Set<Integer> keySet = map.keySet();


        for(Iterator<Integer> iterator = keySet.iterator(); iterator.hasNext();){
            Integer next = iterator.next();
            System.out.println(next+":"+map.get(next));

        }





    }


}
