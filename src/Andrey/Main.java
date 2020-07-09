package Andrey;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Male male1 = new Male();
        //System.out.println(male1.getChromosomes());
        Female female1 = new Female();
        //System.out.println(female1.getChromosomes());

        ArrayList<Human> human_array = new ArrayList<>();
        human_array.add(male1);
        human_array.add(female1);

        for(Human obj : human_array){
            System.out.println(obj.getChromosomes());
        }

        System.out.println("--------------------------");

        overloadingExample overloading1 = new overloadingExample();
        System.out.println(overloading1.calculate(5,4, 4));

        System.out.println("--------------------------");

        Override override1 = new Override();
        System.out.println(override1.calculation(10, 20));



        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Animal animal4 = new Animal(); //cannot instatiate an Abstract class.

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2; //Cat is not a Dog
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(dog3);
        bigDog2.greeting(dog2);
        bigDog2.greeting(dog3);


        ArrayList<String> strings = new ArrayList<String>();
        for(int i = 0; i<5; i++){
            Scanner in = new Scanner(System.in);
            System.out.println("PLease enter string no: " + (i+1));
            strings.add(in.nextLine());
        }
        System.out.println("Thank you, your input is saved");
        int howLong=strings.get(0).length();
        int indexOfLongest=0;
        int index = 0;
        for(String i : strings){

            if (i.length()>howLong){
                howLong=i.length();
                indexOfLongest = index;
            }
            index++;
        }
        System.out.println("The longest string is: " + strings.get(indexOfLongest) + " at position: " + (indexOfLongest+1));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.add(10);
        integers.add(12);
        integers.add(1);
        integers.add(18);

        System.out.println(integers);

        int theSmallest = integers.get(0);
        int indexOfTheSmallest = 0;

        for(int i=0; i<integers.size(); i++){
            if(integers.get(i)<theSmallest){
                theSmallest = integers.get(i);
                indexOfTheSmallest = i;
            }
        }
        int temp = integers.get(0);
        integers.set(0, integers.get(indexOfTheSmallest));
        integers.set(indexOfTheSmallest, temp);

        System.out.println(integers);

        System.out.println("Please enter a string");
        Scanner in = new Scanner(System.in);
        String theStringToMask = in.nextLine();
        System.out.println("The masked string:");
        maskify(theStringToMask);

    }

    public static void maskify(String text){
        String substring = "";
        String newString = "";
        int howMuchToMask = 0;
        int stringSize = text.length();
        if (stringSize > 4){
            howMuchToMask = stringSize - 4;
            substring = text.substring(howMuchToMask);
        }
        for(int i=0; i<howMuchToMask; i++){
            newString += "#";
        }
        newString += substring;
        System.out.println(newString);
    }
}



