package design.pattern.objectFactory;

public class UIDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("UIUI");
        return 100000;
    }
}
