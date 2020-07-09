package Amin.A2;

public class Car extends Vehicle {
    String name;
    String engineType;
    String fuelType;

    // constructor
    public Car (String name, String engineType, int engineSize, String fuelType) {
        super(engineSize);
        this.engineType = engineType;
        this.name = name;
        this.fuelType = fuelType;

    }
    @Override
    public void engineInfo () {
        System.out.printf("%s has %d liter %s engine. %n", name, engineSize, engineType);
    }

    public void engineInfo (String str ) {
        if (str.equals("fullInfo")) {
            System.out.printf("Name %20s %nEngine Type %10s %nEngine Size %9d liter %nFuel Type %16s %n"
                    , name, engineType, engineSize, fuelType);
        } else {
            System.err.println("engineInfo() method accepts only 'fullInfo' or no argument.");
        }

    }


}
