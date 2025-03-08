package design.pattern.singleTon;

public class SingleTon {

    static SingleTon st = null;
    private SingleTon(){
        System.out.println("Ctor - SingleTon");
    }

    public static SingleTon getReferenceA(){
        if( SingleTon.st == null)
            st = new SingleTon();
        return st;
    }
}
