package functional;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> {return n > 10; };
        System.out.println(p.test(12));
    }
}
