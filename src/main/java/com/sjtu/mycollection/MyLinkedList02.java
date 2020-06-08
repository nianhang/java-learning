package com.sjtu.mycollection;

public class MyLinkedList02 {

    private Node first;
    private Node last;
    private int size;


    public Object get(int index){

        if(index < 0 || index > size-1){
            throw new RuntimeException("索引数字不合法:"+index);
        }


        Node temp = null;
        int length = size / 2;

        if(index <= length){
            temp = first;
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
        }else {
            temp = last;
            for(int i = size-1;i>index;i--){
                System.out.println(size);
                temp = temp.previous;
            }
        }

        return temp.element;
    }


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
        MyLinkedList02 myLinkedList01 = new MyLinkedList02();
        myLinkedList01.add("a");
        myLinkedList01.add("b");
        myLinkedList01.add("c");
        myLinkedList01.add("d");
        myLinkedList01.add("e");
        System.out.println(myLinkedList01.size);

        System.out.println(myLinkedList01);

        System.out.println(myLinkedList01.get(4));


    }




}
