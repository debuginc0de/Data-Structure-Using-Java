package com.Java.DSA.LinkedList;

public class AddRemovePosition {
    private static int size=0;
    public static void AddLast(int data){
        Node newnode=new Node(data);

        if (Node.head == null) {
            Node.head = newnode;
        }else {
            Node.tail.next=newnode;
        }
        Node.tail = newnode;
        size++;
    }
    public static void AddPosition(int index,int data) {
        int i=0;
        Node temp=Node.head;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        Node newnode=new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    public static int RemovePosition(int index){
        int i=0;
        Node temp=Node.head;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        int value=temp.next.data;
        temp.next=temp.next.next;
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
        AddLast(12);
        AddLast(14);
        AddPosition(0, 5);   // at front
        AddPosition(2, 15);  // in middle
        AddPosition(size, 40); // at end
        printList();
        System.out.println("Size: " + getSize());//size- 5
        // 12 -> 5 -> 15 -> 14 -> 40 -> null
        RemovePosition(2); // 12 -> 5 -> 14 -> 40 -> null
        printList();
        System.out.println("size: "+getSize());

    }
}
