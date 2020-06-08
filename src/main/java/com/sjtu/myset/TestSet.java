package com.sjtu.myset;


import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set<String> testSet = new HashSet<String>();

        testSet.add("aaa");
        testSet.add("aaa");
        testSet.add("bbb");

        System.out.println(testSet.toString());


    }

}
