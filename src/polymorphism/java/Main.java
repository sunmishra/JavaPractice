package polymorphism.java;

public class Main {
    public static void main(String[] args) {

        Camera camera = new SmartPhone();
        camera.clickPhoto();
//        camera.location(); // Not allowed because smartphone is restricted to be used as a camera

        CellPhone cellPhone = new SmartPhone();
        cellPhone.viewContacts();
//        cellPhone.browse();// Not allowed because smartphone is restricted to be used as a cellPhone

//      To use cellphone as a smartphone we have to downcast the cellphone to smartPhone
        SmartPhone smartPhone = (SmartPhone) cellPhone;
        smartPhone.browse();
        smartPhone.location(); // now this downcasted variable can be used as any device GPS, camera, cellphone etc

//        -------------------------------------------
//      This is exmaple of run time polymophism even though we are restricted to use only Cellphone data members
//      but we have overriden the call() in Smartphone so at runTime binding will happen with overriden method
        CellPhone oldPhone = new SmartPhone();
        oldPhone.call();
//      oldPhone.browse(); // but still we cant browse with oldphone
    }
}
