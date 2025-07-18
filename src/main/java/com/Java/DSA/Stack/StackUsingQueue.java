package com.Java.DSA.Stack;
    //Stack implementation using 2 queue


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> q1=new LinkedList<>();
    private Queue<Integer> q2=new LinkedList<>();


    void push(int data){
        while (!q1.isEmpty()){
            q2.add(q1.poll());
            //q1.p();
        }
        q1.add(data);

        while (!q2.isEmpty()){
            q1.add(q2.poll());
            //q2.pop();
        }

    }
    public int pop(){
        if (q1.isEmpty()){
            System.out.println("Empty stack");
            return -1;
        }
        int ans=q1.poll();
        //q1.poll();
        return ans;
    }
    public int peek(){
        if (q1.isEmpty()){
            System.out.println("Empty stack");
            return -1;
        }
        return q1.peek();
    }
    public void display() {
        System.out.println("Stack (top→bottom): " + q1);
    }

    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();
        st.push(10);
        st.push(20);
        st.push(30);

        st.display();
        st.push(40);
        st.display();

        st.pop();
        st.display();


    }
}
