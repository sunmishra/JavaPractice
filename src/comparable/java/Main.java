package comparable.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(525, "Sun", 12);
        Student s2 = new Student(125, "Moon", 11);
        Student s3 = new Student(105, "Pluto", 15);
        Student s4 = new Student(185, "Jupiter", 13);
        Student s5 = new Student(165, "Neptune", 10);
        List<Student> list = new ArrayList();
        list.add(s1); list.add(s2);list.add(s3);list.add(s4);list.add(s5);
        Collections.sort(list); // sorting based on age
        System.out.println(list);

        System.out.println(" ------------------------------- ");

        List<Student> list1 = new ArrayList();
        list1.add(s1); list1.add(s2);list1.add(s3);list1.add(s5);list1.add(s4);
        Comparator sortByRoll = (Object o1, Object o2) -> {
            Student stu1 = (Student) o1;
            Student stu2 = (Student) o2;
            return stu1.rollNo > stu2.rollNo ? 1 : stu1.rollNo < stu2.rollNo ? -1 : 0;
        };
        Collections.sort(list1, sortByRoll); // sorting based on rollno
        System.out.println(list1);

        System.out.println(" ------------------------------- ");

        List<Student> list2 = new ArrayList();
        list2.add(s1); list2.add(s2);list2.add(s3);list2.add(s5);list2.add(s4);
        Comparator sortByString = (o1, o2) -> { // we can ignore the DT also
            Student stu1 = (Student) o1;
            Student stu2 = (Student) o2;
            return stu1.name.compareTo(stu2.name); // As string also implements comparable Interface otherwise we have to write our own logic to sort the string objects
        };
        Collections.sort(list2, sortByString); // sorting based on rollno
        System.out.println(list2);

        System.out.println(" ------------------------------- ");
//        Instead of writing whole lambda and storing it in a reference we can write directly pass it as a parameter
        List<Student> list3 = new ArrayList();
        list3.add(s1); list3.add(s2);list3.add(s3);list3.add(s5);list3.add(s4);
        Collections.sort(list3, (stu1,stu2)->(stu1.name).compareTo(stu2.name));
        System.out.println(list3);

        System.out.println(" ------------------------------- ");
        List<Student> list4 = new ArrayList();
        list4.add(s1); list4.add(s2);list4.add(s3);list4.add(s5);list4.add(s4);
        Collections.sort(list4, (stu1,stu2)->(stu1.age > stu2.age) ? 1 : (stu1.age < stu2.age) ? -1 : 0);
        System.out.println(list4);
    }
}
