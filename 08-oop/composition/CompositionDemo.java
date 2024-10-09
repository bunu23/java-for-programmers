
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine starting");
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("starting the car " + model);
        engine.start();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

        Engine e = new Engine("V");
        Car myCar = new Car("Ford", e);

        myCar.startCar();

    }
}