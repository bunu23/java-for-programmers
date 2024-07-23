package oop;

//Abstraction
abstract class Appliance {
    private String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// subclass that extends the abstract class
class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    // Implementation of abstract method
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now running.");
    }
}

// subclass that extends the abstract class
class Refrigerator extends Appliance {

    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is now cooling.");
    }

}

public class Demo4 {
    public static void main(String[] args) {

        Appliance washer = new WashingMachine("samsung");
        Appliance fridge = new Refrigerator("LG");

        washer.displayBrand();
        washer.turnOn();
        fridge.displayBrand();
        fridge.turnOn();

    }
}
