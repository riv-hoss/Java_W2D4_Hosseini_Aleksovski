package Andrey;

public class Dog extends Animal {
    @java.lang.Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("WOOOOOOF!");
    }
}