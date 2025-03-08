package statics.java.staticblocks;

public class StaticBlocks {
    int a = 10;
    static int b = 20;
    static int c = m1();
    static int m1(){
        System.out.println("m1-SB");
        return 5;
    }

    static {
//        System.out.println(i); // Not Allowed --> Can't access instance var inside static blocks

//        System.out.println(this.a); // Not Allowed --> `this` not allowed inside static blocks

//        But if we want to access instance var then we have to create object of current class
//        and we can access it using referance var of that class
        StaticBlocks st = new StaticBlocks();
        System.out.println(st.a);
        System.out.println(st.b); // can also access static var using ref var
    }
}
