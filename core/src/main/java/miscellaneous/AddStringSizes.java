package miscellaneous;

import java.util.*;

public class AddStringSizes {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj", "Hemant", "Ajay", "Gaurav");

        System.out.println(addStringSize(names));

    }

//    3+6+4+6 = 19


    public static int addStringSize(List<String> names){
        int count = 0;


        for(String name: names){
            int temp = name.length();
            count = count+temp;
        }

        return count;

    }
}


