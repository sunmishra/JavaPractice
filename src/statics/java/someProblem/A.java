package statics.java.someProblem;

public class A {
    static int x = 10;
    int y = 20;

//    static int m1(){
//        static int z = 15; // static k/w cannot be used as local
//
//    }

    public static void main(String[] args) {
        A a = null;
        System.out.println(a.x); // won't give nullPointer for accessing static var
//        System.out.println(a.y); // but give NullPointer for accessing instance var

//        static int p = 10; static k/w can't be used as local i.e. not  allowed inside instance methods/static methods

    }
}
