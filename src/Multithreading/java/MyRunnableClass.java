package Multithreading.java;

public class MyRunnableClass implements Runnable{

//   Always override the run() to execute the thread
    @Override
    public void run() {
        for (int i=0; i<5; i++)
            System.out.println(Thread.currentThread() +"--> "+i);
    }
}
