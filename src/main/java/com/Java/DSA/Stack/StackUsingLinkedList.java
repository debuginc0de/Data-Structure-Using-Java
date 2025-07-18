package com.Java.DSA.Stack;

import java.awt.*;

public class StackUsingLinkedList {
    private Node top;
    private int size;

    public StackUsingLinkedList() {
        top = null;
        size=0;
    }

    public void PushLL(int data){
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
        size++;
    }

    public int PopLL(){
        if (isEmpty()){
            System.out.println("Stack UnderFlow");
        }
        int value=top.data;
        top=top.next;
        return value;
    }

    public int peekLL(){
        return top.data;
    }

    public boolean isFull(){

        return false;
    }
    public boolean isEmpty(){
        return top==null;
    }

    public void Display(){
        System.out.println("Stack [top->bottom]: ");
        Node curr=top;
        while (curr!=null){
            System.out.print(curr.data + ((curr.next!=null)?",":""));
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingLinkedList sLL=new StackUsingLinkedList();
        sLL.PushLL(10);
        sLL.PushLL(20);
        sLL.PushLL(30);
        sLL.PushLL(40);

        sLL.Display();  //40,30,20,10

        sLL.PopLL();
        sLL.PopLL();
        sLL.Display();  //20,10


    }
}
