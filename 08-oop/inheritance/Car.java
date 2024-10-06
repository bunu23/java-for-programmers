
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand) {
        super(brand);
    }

    public Car() {
        super(); // call cons of vehicle class
        System.out.println("car created");
    }

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Doors " + numberOfDoors);
    }

    public void startEngine() {
        this.startEngine(); // call vehicle method
        System.out.println("car engine started!");
    }

}
