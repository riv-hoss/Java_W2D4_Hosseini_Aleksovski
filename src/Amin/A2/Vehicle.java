package Amin.A2;

public class Vehicle {
    int engineSize;

    // constructor
    public Vehicle(int engineSize) {
        this.engineSize = engineSize;
    }

    public void engineInfo () {
        System.out.printf("Engine size is %d. %n", engineSize);
    }
}
