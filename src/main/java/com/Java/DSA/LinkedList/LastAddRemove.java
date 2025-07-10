package com.Java.DSA.LinkedList;
class Node2{
    int data;
    Node2 next;

    public Node2(int data){
        this.data=data;
        this.next=null;
    }
    public static Node2 head;
    public static Node2 tail;
}
public class LastAddRemove {
    private static int size=0;
    public static void AddLast(int data){
        Node2 newnode=new Node2(data);

        if (Node2.head == null) {
            Node2.head = newnode;
            Node2.tail = newnode;
        }else {
            Node2.tail.next=newnode;
            Node2.tail=newnode;
        }
        size++;
    }
    public static int RemoveLast(){
        if (Node2.head == null) throw new IllegalStateException("List is empty");
        if (size == 1) {
            int val = Node2.head.data;
            Node2.head = null;
            Node2.tail = null;
            size = 0;
            return val;
        }
        Node2 prev = Node2.head;
        // Move to node before tail
        while (prev.next != Node2.tail) {
            prev = prev.next;
        }
        int value = Node2.tail.data;
        prev.next = null;
        Node2.tail = prev;
        size--;
        return value;
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
        AddLast(10);
        AddLast(20);
        AddLast(30);
        printList();         // Should print: 10 -> 20 -> 30 -> null
        System.out.println("Size: " + getSize()); // Size: 3

        RemoveLast();
        RemoveLast();
        printList();         // Should print: 10 -> null
        System.out.println("Size: " + getSize()); // Size: 1

    }

}
