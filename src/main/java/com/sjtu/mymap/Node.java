package com.sjtu.mymap;

public class Node {

    int hash;
    Object key;
    Object value;
    Node next;

    public Node(){

    }
    public Node(int hash, Object key, Object value, Node next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
