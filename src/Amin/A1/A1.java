package Amin.A1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A1 {

    public static void main(String[] args) {
        Male firstBeing = new Male();
        Male secondBeing = new Male();
        Female thirdBeing = new Female();
        Male fourthBeing = new Male();
        Male fifthBeing = new Male();
        Female sixthBeing = new Female();
        Female seventhBeing = new Female();

        ArrayList<Human> humanArrayList = new ArrayList<>(Arrays.asList(firstBeing, secondBeing,
                thirdBeing, fourthBeing, fifthBeing, sixthBeing, seventhBeing));

        for (Human i : humanArrayList) {
            i.getChromosomes();
        }



    }
}
