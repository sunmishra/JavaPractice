package design.pattern.objectFactory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("WebWeb");
        return 150000;
    }
}
