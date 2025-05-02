package singleton;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int num = 3;
        List<Integer> list = new ArrayList();
        for(int numfor : nums) {
            if(!nums.equals(num)) {
                list.add(numfor);
            }
        }
        list.stream().sorted();

        System.out.println(list);


    }
}
