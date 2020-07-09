package Andrey;

import java.util.ArrayList;

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
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}



