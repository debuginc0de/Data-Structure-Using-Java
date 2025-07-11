package com.Java.DSA.LinkedList;
class Node3{
    int data;
    Node3 next;
    public Node3(int data){
        this.data=data;
        this.next=null;
    }
    public static Node3 head;
    public static Node3 tail;
}
public class AddRemovePosition {
    private static int size=0;
    public static void AddLast(int data){
        Node3 newnode=new Node3(data);

        if (Node3.head == null) {
            Node3.head = newnode;
        }else {
            Node3.tail.next=newnode;
        }
        Node3.tail = newnode;
        size++;
    }
    public static void AddPosition(int index,int data) {
        int i=0;
        Node3 temp=Node3.head;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        Node3 newnode=new Node3(data);
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    public static int RemovePosition(int index){
        int i=0;
        Node3 temp=Node3.head;
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
        Node3 curr = Node3.head;
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
