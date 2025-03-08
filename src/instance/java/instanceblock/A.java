package instance.java.instanceblock;

public class A {

    {
        System.out.println("IB-A");
        this.m1(); // We can access instance methods b4 executing c'tor using IB
    }
    void m1(){
        System.out.println("m1 - A");
    }
    A(){
        System.out.println("A ctor");
    }
}
