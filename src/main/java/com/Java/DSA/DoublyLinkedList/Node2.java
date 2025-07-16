package com.Java.DSA.DoublyLinkedList;

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static Node2 head;
    public static Node2 tail;
}
