package inner.classes;

public class Main {
    class Toy{
        String name;
        void printName(){
            System.out.println(this.name);
        }
    }

    static class StaticToy{
        String name;
        void printStaticToyName(){
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
//        Toy is local inner class hence we to create is object we have create object of outer class first
        Main main = new Main();
        Toy toy1 = main.new Toy();
        toy1.name = "truck";
        toy1.printName();

        Toy toy2 = new Main().new Toy(); // simpler way to create obj of local inner class
        toy2.name = "Car";
        toy2.printName();

        StaticToy staticToy = new Main.StaticToy(); // creating object of static inner class
        staticToy.name = "Static Cycle";
        staticToy.printStaticToyName();

    }

}
