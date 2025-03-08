package inner.classes;

class OuterClass{
    OuterClass(){

    }
    void print(){
        System.out.println("This is Parent cls");
    }
}

interface OuterInterface{
    int value = 99;
    void printValue();
}
public class LearnAnonymous {

    class InnerClass extends OuterClass{

    }
//    class childInnerAnotherAnonymous extends AnonymousParentClass{
//
//    }

    public static void main(String[] args) {
//      This is way to create object of inner class
        InnerClass innerAnonymous = new LearnAnonymous().new InnerClass();

//      But if don't want to create class  then we can create object directly without having any name this is anonymous class
//      So instead of creating another new class we can directly create obj by giving body.
//      it looks like we have created object of outer class but it is child class w/o name extending Outer class
//      USE CASE --- Since it is anonymous class we can use it only once, if we want to create any class which can be used only once then we can create anonymous class
        OuterClass parentClass = new OuterClass(){
            int integerFiled  = 12;

            void printData(){
                print();
                System.out.println("Data --> " + integerFiled);
            }
        };

//      we won't able to access the members of anonymous class as it is anonymous
//      parentClass.printData();

//      We can create Anonymous class with interface also
        OuterInterface outerInterface = new OuterInterface() {
            @Override
            public void printValue() {
                System.out.println( "Value --> "+ OuterInterface.value);
            }
        };
        outerInterface.printValue();

    }
}
