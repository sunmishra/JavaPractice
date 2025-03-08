package Multithreading.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is starting");

//      Always call start() after creating thread obj to start the thread else run() will never execute
//      creating object of thread class
        Thread myThreadCls = new MyThreadClass("MyThreadClass"); // just providing the thread name
        myThreadCls.start();


//      Creating object of Runnable i/f
        Runnable myRunnable = new MyRunnableClass();
        Thread newThread = new Thread(myRunnable, "myRunnableInterfaceObject");
        newThread.start();

//      Creating thread using lambda i.e. implementing the run()
        Thread thread = new Thread(()->{
            for (int i=0;i<5;i++)
                System.out.println("Thread th "+ Thread.currentThread() +" "+ i);

//      Creating child thread
            Thread th = new Thread();
            th.start();
            for (int i=9;i>7;i--)
                System.out.println("Child Thread th "+ Thread.currentThread() +" "+ i);

        });

        System.out.println("Starting th Thread ----- ");
        thread.start();

        System.out.println("Main finished");

    }
}
