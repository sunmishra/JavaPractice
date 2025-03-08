package myjava.streams.api.stream_problems;

import myjava.streams.api.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void sortingProducts(){
        List<Product> productsList = new ArrayList<Product>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        System.out.println("--------------------------");

        // Sorting By Price
        productsList.stream().sorted( (p1,p2) -> p1.getPrice()> p2.getPrice() ? 1 :p1.getPrice() < p2.getPrice() ? -1 : 0).forEach(System.out::print);
//       OR
        System.out.println();
        productsList.stream().sorted( (p1,p2) -> Integer.compare(p2.getPrice(), p1.getPrice())).forEach(System.out::print); // in descending order
//       OR
        System.out.println();
        productsList.stream().sorted(Comparator.comparingInt(Product::getPrice)).forEach(System.out::print);

        System.out.println("--------------------------");
//      Sorting By name

    }
    public static void main(String[] args) {


        List<Integer> intList = Arrays.asList(1, 2, 9, 3, 4, 5, 1, 6, 3, 7, 8, 2, 5, 9);

        // find evens
        intList.stream().filter(i -> i % 2 == 0).toList().forEach(System.out::print);

        System.out.println(" -------------------------------------------- ");
        
        //remove duplicates
        intList.stream().distinct().forEach(System.out::print);

//        sortingProducts();

        String str = "ShubhamandshivaM";

    }
}
