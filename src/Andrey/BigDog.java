package Andrey;

public class BigDog extends Dog {
    @java.lang.Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @java.lang.Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}