
public class Vehicle extends Machine {

    protected String brand;

    public Vehicle() {
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println("The engine has started.");
    }

}
