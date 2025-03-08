package comparable.java;

public class Student implements Comparable{

    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student o2 = (Student)o;
//        if(this.age > o2.age)
//            return 1;
//        if(this.age < o2.age)
//            return -1;
//        else
//            return 0;
        return (this.age>o2.age)?1:(this.age<o2.age)?-1:0;
    }

    @Override
    public String toString() {
        return this.name+" --> "+this.age + "  " + this.rollNo;
    }
}
