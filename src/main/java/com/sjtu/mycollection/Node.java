package com.sjtu.mycollection;

import lombok.Data;

@Data
public class Node {

    Node previous;

    Node next;

    Object element;


    public Node(Node previous, Node next, Object element) {
        super();
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object object){
        this.element = object;
    }

}
