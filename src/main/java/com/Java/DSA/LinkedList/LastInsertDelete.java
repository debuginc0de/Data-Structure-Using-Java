package com.Java.DSA.LinkedList;

class Node2{
    int data;
    Node next;

    public Node2(int data){
        this.data=data;
        this.next=null;
    }
    public static Node Head=null;
    public static Node Tail=null;
}
public class LastInsertDelete {
    public static void InsertLast(int val){
        Node newnode=new Node(val);
        Node.Tail.next=newnode;
        Node.Tail=newnode;

    }
    public static int RemoveLast(){
        Node prev=Node.Head;
        while (prev!=null){
            int val=prev.next.data;
            prev.next=null;
            Node.Tail=prev;
            return val;

        }

        return 0;
    }
    public static void printList() {
        Node curr = Node.Head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        InsertLast(10);
        InsertLast(20);
        InsertLast(30);
        printList(); // Expect: 30 -> 20 -> 10 -> null

        RemoveLast();
        RemoveLast();
        printList();
    }
}
