package Multithreading.java;

public class MyThreadClass extends Thread{

    MyThreadClass(String threadName){
        super(threadName);
    }

//   Always override the run() to execute the thread
//  Thread.currentThread() will print Thread[<current_class_name>,<thread_priority>,<parent_thread_name>]
//  Here parent thread is main
    @Override
    public void run() {
        for (int i=0; i<5; i++)
            System.out.println(Thread.currentThread()+ " --> "+i);
    }
}
