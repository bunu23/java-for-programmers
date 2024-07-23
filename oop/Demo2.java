package oop;

class Demo2 {
    public static void main(String[] args) {

        int num;
        num = 8;

        AKeyboard obj;
        obj = new AKeyboard();

        obj.pressed();
        obj.throwIt();

        obj.setColor("Blue");
        System.out.println(obj.getKeys());
    }

}

class AKeyboard {

    private int keys;
    private String color;

    public AKeyboard() {
        keys = 100;
        color = "white";
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void pressed() {
        System.out.println("signal sent!" + color);
    }

    public void throwIt() {
        System.out.println("got hit! ");
        keys = 85;
    }

}
