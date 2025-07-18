package com.Java.DSA.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node head;
    public static Node tail;
    public static int size;
}
