package Amin.A4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A4 {

    public static ArrayList<Integer> putMinFirst (ArrayList<Integer> intArrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<>(intArrayList);
        Collections.sort(newArrayList);
        Integer minVal = newArrayList.get(0);
        intArrayList.remove(minVal); // remove min value from original ArrayList
        intArrayList.add(0, minVal); // add min value at the first position



        return intArrayList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> myIntArrayList = new ArrayList<>(Arrays.asList(10, 17, 2, 1, 6));
        System.out.println("Original ArrayList: " + myIntArrayList);

        System.out.println("Modified ArrayList: " + putMinFirst(myIntArrayList));


    }
}
