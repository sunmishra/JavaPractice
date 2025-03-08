package statics.java.staticblocks;

public class Main {
    static {
        System.out.println("Main SB");
    }
    public static void main(String[] args) {
        System.out.println("hell");

//        It doesn't matter how many obj you create static block gets executed only once
//        when bytecode gets loaded in MA, and Bytecode only loaded if main() is present
//        Here Main class itself have static block then id doesn't matter if we create
//        obj of Main or not it will get execute as this Main class contains main().
//        So first bytecode of Main class will be loaded, and SB of Main will execute(Main SB)
//        now first statement is sout so, it will get executed(hell) and second st is object creation
//        of StaticBlock class so now Bytecode of StaticBlock class will get loaded in MA and hence SB
//        and static var(calling m1()) will execute, if we create the object of StaticBlock class again,
//        since Bytecode is already present in MA so now SB won't execute again so 10 and 20 will print only once.

//        So O/P -> Main SB
//                  hell
//                  m1-SB
//                  10
//                  20
        StaticBlocks st = new StaticBlocks();
        StaticBlocks ST1 = new StaticBlocks();
        StaticBlocks st2 = new StaticBlocks();
    }
}