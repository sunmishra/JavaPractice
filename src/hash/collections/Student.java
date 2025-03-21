package hash.collections;

public class Student {
    private int roll;
    private String name;
    
    Student(int roll, String name){
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }

}
