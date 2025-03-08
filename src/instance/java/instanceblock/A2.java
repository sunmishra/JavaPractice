package instance.java.instanceblock;

public class A2 {
    int i = m1();
    {
        System.out.println("IB-A2");
        System.out.println( "Value of I : "+i); // We can access instance methods b4 executing c'tor using IB
    }
    int m1(){
        System.out.println("m1 - A2");
        System.out.println( "Value of I : "+i);
        return 10;
    }
    A2(int i ) {
        System.out.println("A2 ctor");
        this.i = i;
    }
}
