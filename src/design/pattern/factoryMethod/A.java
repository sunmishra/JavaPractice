package design.pattern.factoryMethod;

public class A {
    private A(){
        System.out.println("Ctor - A");
    }

    static A getReferenceA(){ // called factory method which returns object of current class whose c'tor is private
        A a = new A();
        return a;
    }
}
