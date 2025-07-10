package com.Java.DSA.LinkedList;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public static Node head;
    public static Node tail;
    public static int size;
}
public class FirstAddRemove {

    private static int size = 0;

    public static void insertFirst(int data) {
        Node new_node = new Node(data);
        new_node.next = Node.head;
        Node.head = new_node;

        if (Node.tail == null) {
            Node.tail = new_node;
        }
        size++; // increment size
    }

    public static int RemoveFirst() {
        if(size==0){
            System.out.println("LL is empty.....");
        }else if(size==1){
            int val=Node.head.data;
            Node.head=Node.tail=null;
            size=0;
            return val;
        }
        int val=Node.head.data;
        Node.head=Node.head.next;
        size--;
        return val;
    }

    public static int getSize() {
        return size;
    }

    public static void printList() {
        Node curr = Node.head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertFirst(10);
        insertFirst(20);
        insertFirst(30);
        printList(); // 30 -> 20 -> 10 -> null
        System.out.println("Size: " + getSize()); // Size: 3

        RemoveFirst();
        RemoveFirst();
        printList(); //  10 ->  null
        System.out.println("Size: " + getSize()); // Size: 1
    }
}
