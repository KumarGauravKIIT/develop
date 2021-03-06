package string;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class MaxOccaraceChar {

  static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
//
//        System.out.println("Count+++++"+count.length);

        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

//        Consumer
//        Predicate
//        Supplier
//        Function
        return result;
    }

    // Driver Method
    public static void main(String[] args)
    {
        String str = " samapale striang ass";
        System.out.println("Max occurring character is " +
                getMaxOccuringChar(str));
    }
}
