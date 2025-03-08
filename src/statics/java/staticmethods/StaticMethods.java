package statics.java.staticmethods;

public class StaticMethods {
    int a = 10;
    static int b = 20;

    void m1(){ // Instance Method
        System.out.println("m1-A");
        this.m3();
        this.m2(); // Accessing static methods using this is allowed in instance methods
    }
    static void m2(){
        System.out.println("m2-A-static");
    }
    static void m3(){
//        System.out.println(a); // Not allowed -> Non-static field 'a' cannot be referenced from a static context
//        System.out.println(this.a); // this not allowed inside static method
        StaticMethods st = new StaticMethods();
        System.out.println(st.a); // valid --> Accessing instance variables through ref var
        int x = 30; // local var Allowed
        System.out.println(x);
    }
}
