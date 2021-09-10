package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamOnList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(9);

        //Print the List
//        list.stream().forEach(System.out::print);
//        System.out.println("\n");

        //Sort the List
//        list.stream().sorted().forEach(System.out::print);
//        System.out.println("\n");

        //Find Maximum Even Number
//        System.out.println(list.stream().filter(n -> n % 2 == 1).max(Integer::compare).orElse(0));
//        System.out.println("\n");

        //Find minimum Even Number
//        System.out.println(list.stream().filter(n -> n % 2 == 1).min(Integer::compare).orElse(0));
//        System.out.println("\n");


        //Find Maximum Odd Number
//        System.out.println(list.stream().filter(n -> n % 2 != 1).max(Integer::compare).orElse(0));
//        System.out.println("\n");


        //Find Minimum Off Number
//        System.out.println(list.stream().filter(n -> n % 2 != 1).min(Integer::compare).orElse(0));
//        System.out.println("\n");

        //Displaying multiple of the list elements
        list.stream().map(i -> i*5).forEach(System.out::println);

    }
}
