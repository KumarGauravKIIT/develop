package miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumberInList {


    public static void main(String[] args) {
        //Code to find the 2nd Largest number from a List<Integer>

        List<Integer> list = new ArrayList<>();

        list.add(13);
        list.add(6);
        list.add(33);
        list.add(67);
        list.add(102);
        list.add(17);
        list.add(49);

        System.out.println("******* 2nd Highest Number in the List is : "+ secondLargNum(list));

    }

    public static int secondLargNum(List list){
        Integer secondLargest = (Integer) list.get(0);
        Integer largest = (Integer) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if((Integer)list.get(i) > largest) {
                secondLargest = largest;
                largest = (Integer) list.get(i);
            }
            if((Integer)list.get(i) > secondLargest && list.get(i) != largest) {
                secondLargest = (Integer)list.get(i);
            }
        }
        System.out.print("Second biggest number ");
        return secondLargest;
    }
}
