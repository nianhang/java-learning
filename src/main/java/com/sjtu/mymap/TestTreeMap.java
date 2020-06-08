package com.sjtu.mymap;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {

        Map<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(30,"test1");
        treeMap.put(10,"test2");
        treeMap.put(25,"test3");

       /* for(Integer key:treeMap.keySet()){
            System.out.println("key:"+key+"\tvalue:"+treeMap.get(key));
        }
        System.out.println(treeMap.toString());*/

        Emp e1 = new Emp(100,"test1",50000);
        Emp e2 = new Emp(300,"test2",5000);
        Emp e3 = new Emp(200,"test3",10000);
        Emp e4 = new Emp(150,"test4",100000);
        Emp e5 = new Emp(20,"test5",50000);


        Map<Emp,String> testMap = new TreeMap<Emp, String>();
        testMap.put(e1,"test1");
        testMap.put(e2,"test2");
        testMap.put(e3,"test3");
        testMap.put(e4,"test4");
        testMap.put(e5,"test5");

        System.out.println(testMap.toString());
    }

}
