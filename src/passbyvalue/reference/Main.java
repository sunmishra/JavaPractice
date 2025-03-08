package passbyvalue.reference;

import java.util.Arrays;

public class Main {
    static void swap(int arr[]){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main(String[] args) {
        int []arr = {10,20};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
//    As arrays are treated as reference in JAVA hence value will swap

        System.out.println("------------------------");
        Student stu = new Student();
        stu.age = 13;
        stu.name = "SUN";
        System.out.println(stu);
        stu.updateAge(8);
        stu = stu.upDateRef(stu);
        System.out.println(stu.age);
    }
}
