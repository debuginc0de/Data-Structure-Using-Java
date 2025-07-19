package com.Java.DSA.QueueDSA;

public class UsingLL {
    public Node head=null;
    public Node tail=null;

    public void add(int data){
        Node newnode=new Node(data);
        if (tail==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public int remove(){
        if (head==null && tail==null){
            System.out.println("Empty...");
        }
        int front=head.data;
        if (head==tail){
            tail=null;
        }
        head=head.next;
        return front;
    }
    public int peek(){
        if(head==null && tail==null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
    public void display(){
        System.out.print("Queue (front→rear): ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + (curr.next != null ? ", " : ""));
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        UsingLL ll=new UsingLL();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.display();

        ll.remove();
        ll.display();

        System.out.println(ll.peek());
        //ll.display();



    }
}
