package com.sjtu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<String>();

        Collection<String> collection1 = new LinkedList<String>();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

        collection.add("hhhh");
        collection.add("eeee");
        System.out.println(collection);
        System.out.println(collection.size());


        List<String> list = new ArrayList<String>();
    }
}
