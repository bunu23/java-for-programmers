
public class Car {

    private String make = "tesla";
    private String model;
    private String color = "grey";
    private String doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(
                doors + " Door " + color + " " + make + " " + model + " " + (convertible ? "convertible" : " "));
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
