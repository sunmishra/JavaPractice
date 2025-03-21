package hash.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Student, Integer> studeMap = new HashMap<>();
        Map<Employee, Integer> empMap = new HashMap<>();

        Student s1 = new Student(101, "SUN");
        Student s2 = new Student(101, "SUN");

        studeMap.put(s1, 1);
        studeMap.put(s2, 2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        for(Map.Entry<Student, Integer> smap: studeMap.entrySet()){
            System.out.println("Key -- "+smap.getKey() +" --> "+smap.getValue());
        }

        System.out.println(" ---------------------------------------------------------------------------------");

        Employee e1 = new Employee(102, "MOON");
        Employee e2 = new Employee(102, "MOON");

        empMap.put(e1, 1);
        empMap.put(e2, 2);


        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        for (Map.Entry<Employee, Integer> smap : empMap.entrySet()) {
            System.out.println("Key -- " + smap.getKey() + " --> " + smap.getValue());
        }

    }
}
