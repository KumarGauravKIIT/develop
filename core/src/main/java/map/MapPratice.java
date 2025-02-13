package map;

import java.util.HashMap;
import java.util.Map;

public class MapPratice {

    Map<String, String> mapA = new HashMap<>();

    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<>();
        StringsObj1 obj1 = new StringsObj1();
        obj1.setA("A");
        obj1.setB("B");
        obj1.setC("C");

        StringsObj1 obj2 = new StringsObj1();
        obj2.setA("AA");
        obj2.setB("BB");
        obj2.setC("CC");

        Map<String, StringsObj1> mapB = new HashMap<>();

        mapB.put("ABC", obj1);
        mapB.put("XYZ", obj2);

        mapB.forEach((k, a) -> mapA.put(k, a.getA()));

        //System.out.println(mapA);
        //System.out.println("\n\n\n");
        //System.out.println(mapB);



    }
}
