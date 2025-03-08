package functional.interfac;

public class Main {
    public static void main(String[] args) {

        OuterInterface outerInterface = new OuterInterface() {
            @Override
            public void print() {
                System.out.println("Data --> "+ data);
            }
        };
        outerInterface.print();
//      Above anonymous class can also be written in Lambda function Below


//      since we know that interface contains only one method hence need not use interface name and method name
//      we can directly use lambda expression(Anonymous class+method)
//      ()denotes that method do not have any parameters and {} denotes method body i.e. we have implemented print() of OuterInterface
        OuterInterface anInterface = () -> {
            System.out.println("Lambda Data --> "+OuterInterface.data);
        };
        anInterface.print();

        Animal animal = (int legs)->{
            System.out.println( "Dog have "+ legs+ " legs." );
            return legs;
        };
        System.out.println("Dog walks with " + animal.walks(4) + " legs");


//      if function is returning something then we can directly return the value if there is logic involved
//      Also if there is only one parameter then we dont have to specify the data type but for mutiple parameter we have to
        Animal spider = (legs) -> legs/2;
        System.out.println("Spider uses "+ spider.walks(8) + " legs to eat");

//----------------------------------------------------------

//      This is how we implement an interface with 2 methods using anonymous class but we can't use Lambda xpression
//      As Lambda works with functional interface only
        Cat cat = new Cat() {
            @Override
            public void meows() {
                System.out.println("Cat meows");
            }

            @Override
            public void eats() {
                System.out.println("cat eats fish");
            }
        };
        cat.eats();
        cat.meows();

    }
}
