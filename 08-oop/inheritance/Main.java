
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 4);
        car.startEngine();
        car.displayInfo();
        car.powerOn();

        System.out.println("=============");

        Animal anima = new Animal("G", "Small", 200);
        doAnimalStuff(anima, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog y = new Dog("y", "small", 12);
        doAnimalStuff(y, "fast");
        Dog retriever = new Dog("Lab", "medium", 33, "flopp", "swimmer");
        doAnimalStuff(retriever, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }

}
