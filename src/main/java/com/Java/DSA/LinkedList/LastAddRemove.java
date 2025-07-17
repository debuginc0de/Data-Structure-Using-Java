package com.Java.DSA.LinkedList;

public class LastAddRemove {
    private static int size=0;
    public static void AddLast(int data){
        Node newnode=new Node(data);

        if (Node.head == null) {
            Node.head = newnode;
            Node.tail = newnode;
        }else {
            Node.tail.next=newnode;
            Node.tail=newnode;
        }
        size++;
    }
    public static int RemoveLast(){
        if (Node.head == null) throw new IllegalStateException("List is empty");
        if (size == 1) {
            int val = Node.head.data;
            Node.head = null;
            Node.tail = null;
            size = 0;
            return val;
        }
        Node prev = Node.head;
        // Move to node before tail
        while (prev.next != Node.tail) {
            prev = prev.next;
        }
        int value = Node.tail.data;
        prev.next = null;
        Node.tail = prev;
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
