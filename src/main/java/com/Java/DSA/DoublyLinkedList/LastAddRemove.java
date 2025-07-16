package com.Java.DSA.DoublyLinkedList;

public class LastAddRemove {
    private static int size=0;

    public static Node2 AddLast(Node2 head,int value){
        Node2 newnode=new Node2(value);
        if(head==null){
            return newnode;
        }
        Node2 curr=head;
        while (curr.next!=null){
            curr=curr.next;

        }
        curr.next=newnode;
        newnode.prev=curr;
        return head;
    }
    public static Node2 LastRemove(Node2 head){
        if(head==null){
            return null;
        }
        if (head.next==null){
            return null;
        }
        Node2 temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node2 newnode=temp.prev;
        newnode.next=null;
        temp.prev=null;
        return head;
    }

    public static void printList(Node2 head) {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data+" <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Node2 head=null;
        head=AddLast(head,10);
        head=AddLast(head,20);
        head=AddLast(head,30);
        printList(head);    //10 <-> 20 <-> 30 <-> null
        head=LastRemove(head);
        printList(head);   // 10 <-> 20 <-> null



    }
}
