package Class.fornamemethod;

public class Student {
    public String rollNo;
    private String name;
    private double marks;

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    Student(){
        System.out.println("Default ctor");
    }

    @Override
    public String toString(){
        return "Mai student hu be";
    }
}
