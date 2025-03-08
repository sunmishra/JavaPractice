package design.pattern.objectFactory;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("ANdroid");
        return 120000;
    }


}
