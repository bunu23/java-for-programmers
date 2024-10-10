
public class AbstractionDemo {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.displayVehicleName();
        car.startEngine();
        car.stopEngine();
        Maintenance carMain = new Car();
        carMain.changeOil();
        carMain.checkBrakes();

        bike.displayVehicleName();
        bike.startEngine();
        bike.stopEngine();
        Maintenance bikeMaintenance = new Bike();
        bikeMaintenance.checkBrakes();
        bikeMaintenance.changeOil();

    }

}

abstract class Vehicle {
    String name;

    abstract void startEngine();

    void stopEngine() {
        System.out.println("Engine Stopped");
    }

    void displayVehicleName() {
        System.out.println("This is a " + name);
    }
}

class Car extends Vehicle implements Maintenance {

    Car() {
        name = "Car";
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void changeOil() {
        System.out.println("car oil changed");
    }

    @Override
    public void checkBrakes() {
        System.out.println("car brakes checked");
    }
}

class Bike extends Vehicle implements Maintenance {

    Bike() {
        name = "bike";
    }

    @Override
    void startEngine() {
        System.out.println("Bike engine started");
    }

    @Override
    public void changeOil() {
        System.out.println("bike oil changed");
    }

    @Override
    public void checkBrakes() {
        System.out.println("bike brakes checked");
    }
}

interface Maintenance {
    void changeOil();

    void checkBrakes();
}
