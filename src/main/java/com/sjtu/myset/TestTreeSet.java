package com.sjtu.myset;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);

        System.out.println(treeSet);


    }

}
