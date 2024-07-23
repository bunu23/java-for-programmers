package oop;

public class Demo {
    public static void main(String[] args) {

        int num;
        num = 8;

        AdvKeyboard obj;
        obj = new AdvKeyboard();

        obj.pressed();
        obj.throwIt();
        obj.hitNum();

        System.out.println(obj.keys);
    }

}

class Keyboard {

    int keys = 100;
    String color = "Blue";

    public void pressed() {
        System.out.println("signal sent!" + color);
    }

    public void throwIt() {
        System.out.println("got hit! ");
        keys = 85;
    }

}

class AdvKeyboard extends Keyboard {

    public void hitNum() {
        System.out.println("sent number");
    }

}