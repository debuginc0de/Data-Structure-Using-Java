package com.Java.DSA.DoublyLinkedList;

import static com.Java.DSA.DoublyLinkedList.Node2.head;

public class Reverse {
    public static Node2 reverse(Node2 head) {
        Node2 current = head;
        Node2 temp = null;

        while (current != null) {
            // Swap next and prev for the current node
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to the next node (originally next, now in prev)
            current = current.prev;
        }

        // After the loop, temp points to old node before null
        // New head is temp.prev (since temp holds old node's prev)
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
    public static void printList(Node2 head) {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Node2 head = new Node2(1);
        head.next = new Node2(2);
        head.next.prev = head;
        head.next.next = new Node2(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node2(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original list:");
        printList(head); //1 <-> 2 <-> 3 <-> 4



        head = reverse(head);

        System.out.println("Reversed list:");
        printList(head);  //4 <-> 3 <-> 2 <-> 1

    }
}

