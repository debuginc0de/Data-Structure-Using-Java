package com.Java.DSA.DoublyLinkedList;

class Node3{
    int data;
    Node3 next;
    Node3 prev;

    public Node3(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public static Node3 head;
    public static Node3 tail;
}
public class AddRemovePosition {

    public static Node3 insertKth(Node3 head,int k,int value){
        Node3 newNode = new Node3(value);
        if (k <= 1 || head == null) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            return newNode;
        }
        Node3 temp = head;
        int pos = 1;
        while (pos < k - 1 && temp.next != null) {
            temp = temp.next;
            pos++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        return head;

    }

    public static Node3 removeKth(Node3 head, int k) {
        if (head == null || k <= 0) return head;

        Node3 curr = head;
        int cnt = 1;
        while (curr != null && cnt < k) {
            curr = curr.next;
            cnt++;
        }

        // k is beyond list length—no removal
        if (curr == null) return head;

        Node3 back = curr.prev;
        Node3 front = curr.next;

        // Removing head
        if (back == null) {
            head = front;
        } else {
            back.next = front;
        }

        // Removing tail or middle
        if (front != null) {
            front.prev = back;
        }

        // Clear references in removed node
        curr.next = curr.prev = null;
        return head;
    }
    public static void printList(Node3 head) {
        Node3 curr = head;
        while (curr != null) {
            System.out.print(STR."\{curr.data} <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node3 head=null;
        head=insertKth(head,2,10);
        head = insertKth(head, 1, 1000);
        head = insertKth(head, 4, 20);
        head = insertKth(head, 3, 15);
        head = insertKth(head, 5, 30);
        printList(head);             // 1000 <-> 10 <-> 15 <-> 20 <-> 30 <-> null
        head=removeKth(head,4);
        printList(head);           // 1000 <-> 10 <-> 15 <-> 30 <-> null
    }
}
