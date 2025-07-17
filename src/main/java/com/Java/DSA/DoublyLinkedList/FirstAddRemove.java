package com.Java.DSA.DoublyLinkedList;

public class FirstAddRemove {
    private static int size=0;


    public static Node2 addFirst(Node2 head,int data){
        Node2 newnode=new Node2(data);
        newnode.next= head;
        return newnode;
    }


    public static Node2 RemoveFirst(Node2 head){
        if(head ==null){
            return null;
        }
        Node2 temp=head;
        head=head.next;
        //head.prev=null;
        temp.next=null;

        if (head != null) {
            head.prev = null;
        }
        return head;
    }
    public static void printList(Node2 head) {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public int getSize() { return size; }
    public static void main(String[] args) {
        Node2 head = null;
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
