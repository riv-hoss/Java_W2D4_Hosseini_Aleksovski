package Andrey;

public class overloadingExample {
    public int calculate(int a, int b){
        return a +b;
    }

    public String calculate(int a, int b, int c){
        int temp = a + b + c;
        return "The result is: " + temp;
    }
}
