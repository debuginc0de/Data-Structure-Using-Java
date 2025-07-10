package com.Java.DSA.Data.Structure.Using.Java.LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public static Node Head=null;
    public static Node Tail=null;
}


public class FirstInsertDelete {
    public static void insertFirst(int data){
        Node new_node=new Node(data);
        new_node.next= Node.Head;
        Node.Head=new_node;

        if (Node.Head == null) {
            Node.Head= Node.Tail=new_node;
        }
    }
    public static int removefirst(){
        int val=Node.Head.data;
        Node.Head=Node.Head.next;
        return val;
    }

    public static void printList() {
        Node curr = Node.Head;
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
          printList(); // Expect: 30 -> 20 -> 10 -> null

        removefirst();
        removefirst();
        printList();

    }
}
