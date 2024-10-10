

public class Car {
    public static void main(String[] args) {
        Car mycar=new Car("Toyota");
        Driver myDriver=new Driver();
        myDriver.drive(mycar);
    }
    private String model;
    private double speed;

    public Car(String model){
        this.model=model;
        this.speed=0;
    }

    public double getSpeed(){
        return speed;
    }


    public void accelerate(double increase){
        if(increase>0){
            speed+=increase;
            System.out.println(model + " accelerated to "+ speed + " km/h");

        }else {
            System.out.println("Invalid speed increase");
        }
    }

}

class Driver{
    public void drive(Car car){
        car.accelerate(40);
        System.out.println("current speed "+car.getSpeed()+"km/h");
    }
}

/*

Encapsulation: The Car class encapsulates its data (model and speed), making it accessible only through its public methods.
Controlled Access: Other classes (like Driver) can interact with the Car class without directly modifying its attributes, ensuring that the speed can only be changed through the provided methods, maintaining data integrity.
Ease of Maintenance: If you need to change how speed is calculated or validated, you can do so within the Car class without affecting other classes.
 */