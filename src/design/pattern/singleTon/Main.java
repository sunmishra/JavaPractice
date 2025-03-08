package design.pattern.singleTon;

public class Main {
    public static void main(String[] args) {
        SingleTon a = SingleTon.getReferenceA();
        SingleTon b = SingleTon.getReferenceA();
        SingleTon c = SingleTon.getReferenceA();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

//        Ctor - SingleTon
//        design.pattern.singleTon.SingleTon@5a39699c
//        design.pattern.singleTon.SingleTon@5a39699c
//        design.pattern.singleTon.SingleTon@5a39699c