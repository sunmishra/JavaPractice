package mystream.api;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // to get even number
        // Predicate is functional interface
        Predicate<Integer> predicate = p -> p % 2 == 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(13));

        //Function is functional interface need to explicitly mention  return type
        // to get length of string // here Integer is return type and String is input type
        Function <String, Integer> function = (f) -> f.length();
        System.out.println(function.apply("Raju Jhopadi"));
        System.out.println(function.apply("shubham"));

        System.out.println(" ----------------------------------- ");

        List<Product> productsList = new ArrayList<Product>();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

//        using Function to input Product and return its price string
        Function<Product, String> f = product -> {
            return product.getPrice()>30000 ? "Costly" : product.getPrice() <= 25000 ? "Cheap" : "Affordable";
        };

        for (Product product : productsList)
            System.out.println(product.getName() + " is " + f.apply(product));
        System.out.println("----------------------------------------------");

        //filter price > 25000
        List<Product> list = productsList.stream().filter(product -> product.getPrice() > 25000).collect(Collectors.toList());
        for (Product product : list)
            System.out.println(product.getName() + " is " + product.getPrice());

        System.out.println("----------------------------------------------");

        //filter price > 25000 and add gst 25%
        List<Product> listGst = productsList.stream().filter(product -> product.getPrice() > 25000).collect(Collectors.toList());
        for (Product product : list)
            System.out.println(product.getName() + " is " + product.getPrice());

        System.out.println("----------------------------------------------");

        //filtering price > 25000 and id < 3
        List<Product> listFiltered = productsList.stream().filter(product -> product.getPrice() > 25000).filter(product -> product.getId()<3).collect(Collectors.toList());
        long count = listFiltered.stream().count(); // to get count
        for (Product product : listFiltered)
            System.out.println(product.getName() + " is " + product.getPrice());

        System.out.println("----------------------------------------------");

        List<String> listCity = Arrays.asList("Chennai", "Bangalore", "Pune", "Hyderabad", "Chennai", "Pune", "Mysore",
                "Delhi", "Hyderabad", "Pune");

        String s = "find count the count of each count";
        Map<String, Long> map = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(str -> str, HashMap::new, Collectors.counting()));
        System.out.println(map.toString());
//
//        List<Integer> intList = Arrays.asList(1, 23, 23, 44, 15, 15, 7, 85, 9);
//
//        List<Integer> sortedList = intList.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
//        System.out.println("Sorted list :" + sortedList);
    }
}
