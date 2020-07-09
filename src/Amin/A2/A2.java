package Amin.A2;

public class A2 {

    /* Method overriding: It allows a subclass or child class to provide a
    * specific implementation of a method that is already provided by one
    * of its superclasses or parent classes.
    *
    *
    *  Method overloading: It allows a class to have more than one method having
    * the same name, if their argument lists are different. Similar to 'constructor overloading'.
    * */


    public static void main(String[] args) {


        // ====================================== Override Example =======================================
        Vehicle vehicleOne = new Vehicle(4);
        Car carOne = new Car("911GT", "v8", 4, "Benzin");

        System.out.printf("%n====================================== Override Example ===================" +
                "====================%nResult of 'engineInfo()' method on Vehicle class: %n");
        vehicleOne.engineInfo(); // 'engineInfo()' method
        System.out.printf("%n----------------------------------" +
                "%nResult of overridden 'engineInfo()' method on Car class: %n");
        carOne.engineInfo(); // overridden 'engineInfo()' method


        // ====================================== Overload Example =======================================
        System.out.printf("%n====================================== Overload Example ===================" +
                "====================%nThe method 'engineInfo()' accepts 'fullInfo' argument and provides: %n");
        carOne.engineInfo("fullInfo");
    }
}
