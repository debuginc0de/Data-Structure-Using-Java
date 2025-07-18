package com.Java.DSA.CircularLinkedlist;

public class AllOperation {
    Node head=null;
    Node tail=null;

    //Insert At end
    public void append(int val){
        Node newnode=new Node(val);
        if (head==null){
            head=tail=newnode;
            newnode.next = head;
        }
        else {
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }

    }
    //Insert at Begin
    public void preAppend(int val){
        Node newnode=new Node(val);
        if (head==null){
            head=tail=newnode;
            newnode.next= head;
        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
    }
    //Delete the first occurrence of a node with given value
    public void delete(){
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        }
        //int val=head.data;
        head=head.next;
        tail.next=head;
        //return val;
    }

    public void EndDelete(){
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node curr=head;
            while (curr.next!=tail){
                curr=curr.next;
            }
            curr.next=head;
            tail=curr;
        }
    }

    //Delete at position

    public void DeletePosition(int index){
        if (head==null || index<0){
            return;
        }
        int len=1;
        Node curr=head;
        while (curr.next!=head){
            len++;
            curr=curr.next;

        }
        if (index>=len){
            return;
        }
        if (index==0){
            delete();
            return;
        }
        // Traverse to node before deletion target
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
        if (toDelete == tail) {
            tail = prev;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        AllOperation cll = new AllOperation();
        cll.append(10);
        cll.append(20);
        cll.append(30);
        cll.append(40);

        System.out.println("Original:");
        cll.printList();  // 10 -> 20 -> 30 -> 40 -> (back to head)


        cll.preAppend(100);
        cll.printList();    //100 -> 10 -> 20 -> 30 -> 40 -> (back to head)

        cll.DeletePosition(2);
        cll.printList();    //100 -> 10 -> 30 -> 40 -> (back to head)

        cll.delete();
        cll.printList();    //10 -> 20 -> 30 -> 40 -> (back to head)

        cll.EndDelete();
        cll.printList();       //10 -> 20 -> 30 -> (back to head)
    }
}
