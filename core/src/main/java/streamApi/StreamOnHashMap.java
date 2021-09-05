package streamApi;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class StreamOnHashMap {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(101, "Kumar");
        m.put(22, "Rahul");
        m.put(42, "Priyanka");
        m.put(90, "Mayank");
        m.put(27, "Joseph");

//        List l = new


                //Print Map
//        m.entrySet().stream().forEach(System.out::println);
//        System.out.println("\n");
//
//        //Sort by key
//        m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        System.out.println("\n");
//
//        //Sort by value
//        m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//        System.out.println("\n");
//
//        //print key, value using Highest key
//        System.out.println(m.entrySet().stream().max(Map.Entry.comparingByKey()));
//        System.out.println("\n");
//
//        System.out.println(m.entrySet().stream().max(Map.Entry.comparingByValue()));
//        System.out.println("\n");
//
//
//        System.out.println(m.entrySet().stream().min(Map.Entry.comparingByKey()));
//        System.out.println("\n");
//        System.out.println(m.entrySet().stream().min(Map.Entry.comparingByValue()));
//        System.out.println("\n");
//
//        for (Map.Entry<Integer, String> s : m.entrySet()) {
//            if(s.getKey() == 42){
//                s.setValue("Priya");
//            }
//            System.out.println("key+Value :  "+ s.getKey()+s.getValue());
//
//        }
//
//        for(Integer k : m.keySet()){
//            System.out.println("Key is "+ k);
//        }
//
//        for(String v : m.values()){
//            System.out.println("value  : "+v);
//        }


                m.forEach((k, v) -> System.out.println("Key :" + k + "   Value :" + v));


    }
}
