package polymorphism.java;

public class SmartPhone extends CellPhone implements GPS,Camera {
    @Override
    public void clickPhoto() {
        System.out.println( " Click... Ckic ...");
    }

    @Override
    public void recVideo() {
        System.out.println("Recording started ... ");
    }

    @Override
    public void location() {
        System.out.println("Update your App ... ");
    }

    void browse(){
        System.out.println("Opening chrome ...");
    }

//    Example of compile time polymorphism
    void browse(String search){
        System.out.println("Searching in chrome");
    }

//    Exmaple of runtime polymorphism
    void call(){
        System.out.println("Calling from Smartphone");
    }
}
