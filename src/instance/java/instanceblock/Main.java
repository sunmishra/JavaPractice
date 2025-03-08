package instance.java.instanceblock;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        System.out.println("--------------");

        A2 a2 = new A2(15);
        System.out.println( "Value of I : "+a2.i);
    }
}
