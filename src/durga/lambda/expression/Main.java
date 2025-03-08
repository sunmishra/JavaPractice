package durga.lambda.expression;

public class Main {
    public static void main(String[] args) {
//        int x = 10, y = 25;
        A a = (x,y) -> x+y;
        System.out.println(a.add(20,22) );
        System.out.println(a.add(7,25) );

//        creating thread

        Runnable r = () ->{
            for (int i=0; i<5; i++)
                System.out.println(Thread.currentThread());
        };
        System.out.println("-------");
        Thread t = new Thread(r, "LambdaTh");
        t.start();
        t.run();
    }
}
