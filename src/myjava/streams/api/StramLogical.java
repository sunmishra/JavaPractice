package myjava.streams.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StramLogical {

    public static void main(String[] args) {
        getEvenNumber();


//        System.out.println();
//        NumberStartingWithOne();
//        System.out.println();
//        DuplicateElements();
//        System.out.println(" \n duplicates");
//
//        findCountOfChars();
//
//        mergeMultipleList();
//
//        filterProductByPrice();
//
//        getSortedList();
    }

    private static void getEvenNumber() {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        intList.stream().filter(a -> a % 2 == 0).forEach(System.out::print);

//        String str = "Noorus Khan";
//        int len = str.length();
//        IntStream.range(0, len).map(i -> len - 1 - i).mapToObj(j -> str.charAt(j)).forEach(System.out::print);

    }

    private static void NumberStartingWithOne() {

        List<Integer> intList = Arrays.asList(1, 12, 23, 44, 15, 61, 7, 85, 9);

        intList.stream().map(s -> s + "").filter(a -> a.startsWith("1")).forEach(System.out::print);
    }

    private static void DuplicateElements() {

        List<Integer> intList = Arrays.asList(1, 23, 23, 44, 15, 15, 7, 85, 9);
        Set<Integer> setInt = new HashSet<Integer>();
        intList.stream().filter(d -> !setInt.add(d)).forEach(System.out::print);
    }

    private static void findCountOfChars() {
        String s = "find count the count of each count";
        Map<String, Long> map = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(str -> str, HashMap::new, Collectors.counting()));
        System.out.println(map.toString());

        String inputString = "Java Concept Of The Day";

        Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(u -> u, Collectors.counting()));

        System.out.println(charCountMap);

        List<String> list = Arrays.asList("Chennai", "Bangalore", "Pune", "Hyderabad", "Chennai", "Pune", "Mysore",
                "Delhi", "Hyderabad", "Pune");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> collect2 = list.stream().filter(w -> w.startsWith("C")).map(w -> w)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("collect groupingBy : " + collect1);
        System.out.println("collect start with : " + collect2);

    }

    private static void mergeMultipleList() {

        List<String> listA = List.of("A", "B", "C");
        List<String> listB = List.of("A", "B", "F");
        List<String> listC = List.of("A", "E", "F");

        Set<String> flatMapUniqueLists = Stream.of(listA, listB, listC).flatMap(Collection::stream)
                .collect(Collectors.toSet());
        List<String> flatMapLists = Stream.of(listA, listB, listC).flatMap(Collection::stream)
                .collect(Collectors.toList());
        List<String> concat = Stream.concat(listA.stream(), listB.stream()).collect(Collectors.toList());

        System.out.println("merge two list with unique data : " + flatMapUniqueLists);
        System.out.println("merge two list : " + flatMapLists);
        System.out.println("concat list " + concat);

    }

//    private static void filterProductByPrice() {
//
//        List<Product> productsList = new ArrayList<Product>();
//
//        // Adding Products
//        productsList.add(new Product(1, "HP Laptop", 25000));
//        productsList.add(new Product(2, "Dell Laptop", 30000));
//        productsList.add(new Product(3, "Lenevo Laptop", 28000));
//        productsList.add(new Product(4, "Sony Laptop", 28000));
//        productsList.add(new Product(5, "Apple Laptop", 90000));
//
//        // Converting product List using two different condition
//        List<Product> productPriceList = productsList.stream().filter(product -> product.getPrice() < 30000)
//                .map(product -> product).filter(p -> p.getId() <= 3).collect(Collectors.toList());
//        System.out.println("filtered product by price : " + productPriceList.toString());
//    }

    private static void getSortedList() {
        List<Integer> intList = Arrays.asList(1, 23, 23, 44, 15, 15, 7, 85, 9);

        List<Integer> sortedList = intList.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
        System.out.println("Sorted list :" + sortedList);
    }
}

