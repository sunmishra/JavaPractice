package main.method;

public class A {
    // overloading of main is possible
    public static void main(String[] args) {
        System.out.println(" void - main()");
        int []arr = {20,30};
        A.main(arr);
    }
    public static void main(int[] args) {
        System.out.println(" int - main()");
        A.main(false);
    }
    public static void main(boolean x) {
        System.out.println(" bool - main()");
    }
}
