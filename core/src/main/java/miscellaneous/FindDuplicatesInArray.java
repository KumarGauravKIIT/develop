package miscellaneous;


import java.util.*;

public class FindDuplicatesInArray {


    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 3, 2};

        int[] result = findDup(input);

        for(int i: result){
            System.out.println(i);
        }

    }

    private static int[] findDup(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: input){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        int[] temp1 = {};
        int count =0;
        List<Integer> temp = new ArrayList<>();

        for(Integer key : map.keySet()){
            if(key > 1){
                temp.add(key);
                temp1[0] = key.intValue();
                count++;
            }
        }

        return temp1;

    }


}
