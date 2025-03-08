package thisstatement.java;

class A{
    A getRef1(){
        return new A();
    }
    A getRef2(){
        return this; // 4th use of this(1st for fields, 2nd instance method, 3rd c'tor call of same class)
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.getRef1());
        System.out.println(a.getRef1());
        System.out.println(a.getRef2());
    }
}
