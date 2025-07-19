package com.Java.DSA.QueueDSA;

import java.util.Stack;

public class UsingStack {
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();

    public void add(int data){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int remove(){
        if (s1.isEmpty()){
            System.out.println("Empty stack");
        }
        return s1.pop();
    }
    public int peek(){
        return s1.peek();
    }
    public void display() {
        System.out.print("Queue (front→rear): ");

        // Clone stacks so we don't change original queue
        Stack<Integer> sOut = (Stack<Integer>) s1.clone();
        Stack<Integer> sIn  = (Stack<Integer>) s2.clone();

        // 1️⃣ Print all elements ready to dequeue (outbox stack)
        while (!sOut.isEmpty()) {
            System.out.print(sOut.pop());
            if (!sOut.isEmpty() || !sIn.isEmpty()) System.out.print(", ");
        }

        // 2️⃣ Print inbox elements in the correct order (bottom→top)
        Stack<Integer> reverse = new Stack<>();
        while (!sIn.isEmpty()) {
            reverse.push(sIn.pop());
        }
        while (!reverse.isEmpty()) {
            System.out.print(reverse.pop());
            if (reverse.size() > 0) System.out.print(", ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        UsingStack us=new UsingStack();
        us.add(10);
        us.add(20);
        us.add(30);

        us.display();
        us.remove();
        us.remove();
        us.display();
    }
}
