package com.Java.DSA.DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public static Node head;
    public static Node tail;
}
public class FirstAddRemove {
    private static int size=0;


    public static Node addFirst(Node head,int data){
        Node newnode=new Node(data);
        newnode.next= head;
        return newnode;
    }


    public static Node RemoveFirst(Node head){
        if(head ==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        //head.prev=null;
        temp.next=null;

        if (head != null) {
            head.prev = null;
        }
        return head;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public int getSize() { return size; }
    public static void main(String[] args) {
        Node head = null;
        head=addFirst(head,21);
        head=addFirst(head,22);
        head=addFirst(head,23);
        head=addFirst(head,24);
        printList(head); //24 <-> 23 <-> 22 <-> 21 <-> null
        head = RemoveFirst(head);
        head = RemoveFirst(head);
        head = RemoveFirst(head);
        printList(head);   //21 <-> null
    }
}
