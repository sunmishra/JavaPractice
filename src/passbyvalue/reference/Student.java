package passbyvalue.reference;

public class Student {
    String name;
    int age;

    void updateAge(int age){
        this.age = age;
    }

    Student upDateRef(Student s){
        s = new Student();
        return s;
    }

    public String toString() {
        return this.name + " AND " + this.age;
    }
}
