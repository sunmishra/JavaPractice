package Class.fornamemethod;

public class Main {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Class.fornamemethod.Student");
            Student s2 = new Student();
            System.out.println(cls.toString());
//            We cant access members of Student class because forName()only loads the metadata in MA it doesnt create obj
            //System.out.println(cls.rollNo);

//            To create object via Class use newInstance() of class java.lang.Class
            Student o = (Student) cls.newInstance();
            System.out.println(o.rollNo + " " + s2.hashCode() + " " + s2);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
}
