package com.Java.DSA.Stack;

import java.util.ArrayList;

public class StackUsingArray {
    private int[] arr;
    private int size;
    private int top;

    public StackUsingArray(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("Stack is Full "+ data);
            return;
        }
        arr[++top]=data;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Underflow");
        }
        //size--;
        return arr[top--];

    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public int size(){
        return top+1;
    }
    public void display() {
        System.out.print("Stack (bottom→top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + (i < top ? ", " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
       StackUsingArray s=new StackUsingArray(20);
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       s.push(50);

       s.display();
        System.out.println(s.size());//Stack (bottom→top): 10, 20, 30, 40, 50
       s.pop();
       s.pop();
       s.display();    //Stack (bottom→top): 10, 20, 30
        System.out.println(s.size());

    }

}
