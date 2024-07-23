package oop;

// Polymorphism

// Superclass
class BasicKeyboard {
    private int keys;
    private String color;

    public BasicKeyboard() {
        keys = 100;
        color = "white";
    }

    public int getKeys() {
        return keys;
    }

    public String getColor() {
        return color;
    }

    // Set keys with parameter
    public void setKeys(int keys) {
        this.keys = keys;
    }

    // Set color with parameter
    public void setColor(String color) {
        this.color = color;
    }

    // Methods intended to be overridden
    public void pressed() {
        System.out.println("BasicKeyboard: Signal sent!");
    }

    public void throwIt() {
        System.out.println("BasicKeyboard: Got hit!");
    }
}

// Subclass with method overriding and overloading
class AdvancedKeyboard extends BasicKeyboard {
    @Override
    public void pressed() {
        System.out.println("AdvancedKeyboard: Signal sent! " + getColor());
    }

    @Override
    public void throwIt() {
        System.out.println("AdvancedKeyboard: Got hit!");

        setKeys(85);
    }

    // Method overloading
    public void setKeys(int keys, String reason) {
        System.out.println("Setting keys to " + keys + " because " + reason);
        super.setKeys(keys);
    }
}

// Demonstration class
public class Demo3 {
    public static void main(String[] args) {

        BasicKeyboard k1 = new BasicKeyboard();
        BasicKeyboard k2 = new AdvancedKeyboard();

        // method overriding
        k1.pressed();
        k1.throwIt();

        k2.pressed();
        k2.throwIt();

        // method overloading
        AdvancedKeyboard aKeyboard = new AdvancedKeyboard();
        aKeyboard.setKeys(105);
        System.out.println("AdvancedKeyboard keys: " + aKeyboard.getKeys());
        aKeyboard.setKeys(110, "increased by user");
        System.out.println("AdvancedKeyboard keys: " + aKeyboard.getKeys());
    }
}
