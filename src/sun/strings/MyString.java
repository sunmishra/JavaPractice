package sun.strings;

public class MyString {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("sun");
        StringBuffer sb2 = sb1.append("Moon");
        System.out.println(sb2.append("Star"));
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
