package miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfAllCharInString {
    public static void main(String[] args) {
        String str = "India is my country";

        Map<Character, Integer> map = new HashMap<>();


        for (char ch: str.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);

        }
        System.out.println(map);
    }
}
