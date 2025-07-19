package com.Java.DSA.QueueDSA;

public class QueueOperation {
    int n=5;
    int front=0;int rear=0;
    int size=0;
    int[] arr=new int[n];
    public void add(int data){
        if(rear==n-1){
            System.out.println("Queue is Full..");
            return;
        }
        arr[rear%n]=data;
        rear++;
        size++;
    }
    public int remove(){
        if (rear==0){
            System.out.println("Queue is Empty");
        }
        int val=arr[front];
        for (int i=front;i<rear-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return val;
    }
    public void display(){
        System.out.println("Queue (Front->Rear)");
        for (int i=front;i<rear;i++){
            System.out.print(arr[i] + (i < rear - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueOperation op=new QueueOperation();
        op.add(10);
        op.add(20);
        op.add(30);

        op.display();

        op.remove();
        op.remove();
        op.display();

    }
}
