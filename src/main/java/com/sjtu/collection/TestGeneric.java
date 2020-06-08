package com.sjtu.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGeneric {

    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("linfd",0);

        String s = mc.get(0);

        String name =(String)mc.get(0);

        System.out.println(s);

        List list = new ArrayList();

        Map map = new HashMap();

    }


}


class MyCollection<E>{
    Object[] objects = new Object[5];

    public void set(E obj,int index){
        objects[index] = obj;
    }

    public E get(int index){
        return (E)objects[index];
    }


}