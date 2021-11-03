package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSimple {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("One", 1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Two", 2);

        Map<String, Integer> map3 = new HashMap<>();
        map3.putAll(map1);

        map3.putAll(map2);

        System.out.println(map3);
    }
}
