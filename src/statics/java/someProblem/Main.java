package statics.java.someProblem;

public class Main {

    private int a = 10;

    static {
        System.out.println( "Print static value b got from instance var a => " +Main.b);
    }
    static int b = m1();


    Main(int a){ // ctor
        this.a = a;
        System.out.println("Main ctor");
    }
    static int m1(){
        System.out.println("M1-A");
        Main st = new Main(88);
        return st.a;
    }
    public static void main(String[] args) {
        System.out.println("Execution of main() starts");
        Main m = new Main(33);
        System.out.println("Execution of main() ends");
    }
}

//          Print static value b got from instance var a => 0
//          M1-A
//          Main ctor
//          Execution of main() starts
//          Main ctor
//          Execution of main() ends