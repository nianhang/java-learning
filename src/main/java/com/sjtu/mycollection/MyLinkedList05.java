package com.sjtu.mycollection;

public class MyLinkedList05<E> {

    private Node first;
    private Node last;
    private int size;

    public void add(int index,E element){
        checkRange(index);

        Node newNode = new Node(element);
        Node temp = getNode(index);

        if(temp != null){
            Node up = temp.previous;

            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;

            size ++;
        }

    }


    public void remove(int index){
        checkRange(index);

        Node temp = getNode(index);

        if(temp != null){
            Node up = temp.previous;
            Node down = temp.next;

            if(up !=null){
                up.next = down;
            }

            if(down != null){
                down.previous = up;
            }

            if(index == 0){
                first = down;
            }

            if(index == size - 1){
                last = up;
            }
            size --;

        }

    }

    public E get(int index){

        checkRange(index);

        Node temp = getNode(index);

        return temp != null? (E) temp.element:null;
    }


    private void checkRange(int index){
        if(index < 0 || index > size-1){
            throw new RuntimeException("索引数字不合法:"+index);
        }
    }


    public Node getNode(int index){

        checkRange(index);

        Node temp = null;
        int length = size >> 1;

        if(index <= length){
            temp = first;
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
        }else {
            temp = last;
            for(int i = size-1;i>index;i--){
                temp = temp.previous;
            }
        }
        return temp;
    }


    public void add(E element){
        Node node = new Node(element);

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
        MyLinkedList05<String> myLinkedList01 = new MyLinkedList05<String>();
        myLinkedList01.add("a");
        myLinkedList01.add("b");
        myLinkedList01.add("c");
        myLinkedList01.add("d");
        myLinkedList01.add("e");
        //System.out.println(myLinkedList01.size);

        System.out.println(myLinkedList01);
        myLinkedList01.remove(0);
        System.out.println(myLinkedList01);


    }




}
