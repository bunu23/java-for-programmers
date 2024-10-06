
public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("K", "big", 50);
    }

    public Dog(String type, String size, double weight) {
        this(type, size, weight, "ro", "cur");
    }

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    private void bark() {
        System.out.print("Woof!");
    }

    private void run() {
        System.out.print("Dog running");
    }

    private void walk() {
        System.out.print("Dog walking");
    }

    private void wagTail() {
        System.out.print("tail waging");
    }

    public void makeNoise() {
        bark();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
