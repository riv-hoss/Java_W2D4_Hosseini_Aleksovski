package Amin.A5;

import java.util.ArrayList;
import java.util.Arrays;

public class A5 {

    // static method finds longest element of an ArrayList string.
    public static String longestString (ArrayList<String> strArray) {
        int i = 0;
        String result = "";
        for (String item : strArray) {
            if (item.length() > i) {
                result = item;
                i = item.length();
            }
        }

        return result;
    }


    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(
                "Banana", "Catastrophic", "shortString", "longestStringMaybe"));

        System.out.printf("Longest element is: %10s", longestString(myArrayList));
    }
}
