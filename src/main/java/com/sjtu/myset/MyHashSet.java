package com.sjtu.myset;

import java.util.HashMap;

public class MyHashSet {


    HashMap map;
    private static final Object PRESENT = new Object();


    public MyHashSet(){
        map = new HashMap();
    }


    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Object key:map.keySet()){
            sb.append(key+",");
            //System.out.println(map.get(key));
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add("aaa");
        myHashSet.add("aaa");
        myHashSet.add("bbbb");
        myHashSet.add("cccc");
        System.out.println(myHashSet.toString());

    }

}
