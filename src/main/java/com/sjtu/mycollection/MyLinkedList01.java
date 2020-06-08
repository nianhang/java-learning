package com.sjtu.mycollection;

public class MyLinkedList01 {

    private Node first;
    private Node last;
    private int size;


    public void add(Object object){
        Node node = new Node(object);

        if(first == null){
            first = node;
            last = node;
        }else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;
        }
        size ++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node temp = first;
        while(temp != null){
            sb.append(temp.element);
            sb.append(",");
            temp = temp.next;
        }

        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }


    public static void main(String[] args) {
        MyLinkedList01 myLinkedList01 = new MyLinkedList01();
        myLinkedList01.add("a");
        myLinkedList01.add("b");
        myLinkedList01.add("c");
        myLinkedList01.add("d");
        myLinkedList01.add("e");
        System.out.println(myLinkedList01.size);

        System.out.println(myLinkedList01);




    }




}
