package Multithreading.java.objectLock;

import java.util.Arrays;

public class MyStack {
    private int[] arr;
    private int stackTop;
    MyStack(int capacity){
        arr = new int[capacity];
        stackTop = -1;
    }

    public boolean push(int data){
        if(isFull())
            return false;
        stackTop++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        arr[stackTop] = data;
        return true;
    }

    public int pop(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int data = arr[stackTop];
        stackTop--;
        return data;
    }
    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop >= arr.length;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(7);
//        stack.push(2);
//        stack.push(6);
//        stack.push(1);
//        stack.pop();
//        stack.push(9);
//        System.out.println(Arrays.toString(stack.arr));


        new Thread(()->{
            int counter = 0;
            while (++counter < 7)
                System.out.println(Thread.currentThread() +"  PUSHED --> " + stack.push(counter+100));
        },"Pusher").start();

        new Thread(()->{
            int counter = 0;
            while (++counter < 7)
                System.out.println(Thread.currentThread() +"  POPPED --> " + stack.pop());
        },"Popper").start();

    }
}
