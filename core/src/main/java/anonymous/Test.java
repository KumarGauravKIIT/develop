package anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        //Bi-Function simple multiplication
        BiFunction<Integer, Integer, Integer> multiply = (a,b) -> a * b;
        System.out.println(multiply.apply(2,3));

        //Consumer to Display a String
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };

        //Consumer to accept the String
        consumer.accept("Some String");

        Consumer<List<Integer>> modify = list ->
        {
            for (int i=0; i< list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        Consumer<List<Integer>> disp = list -> list.stream().forEach(a -> System.out.println("a : "+ a));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(12);
        integerList.add(5);
        integerList.add(3);

        System.out.println("\n\n +++++++Integer List display with multiple of 2+++++++++++++++");
        modify.andThen(disp).accept(integerList);


        Stream<Integer> stream = integerList.stream();
        System.out.println(stream.toString());
    }

}
