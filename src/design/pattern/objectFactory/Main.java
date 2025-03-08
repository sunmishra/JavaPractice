package design.pattern.objectFactory;

public class Main {
    public static void main(String[] args) {
//        Here we are mentioning explicitly that we need Android Developer obj
//        Employee employee = new AndroidDeveloper();

//        So Now we create a factory class which will return the Employee obj without mentioning explicitly
        Employee emp = EmployeeFactory.getEmployee("Web");
        System.out.println("salary of"+" Web dev " + emp.getSalary());

    }
}
