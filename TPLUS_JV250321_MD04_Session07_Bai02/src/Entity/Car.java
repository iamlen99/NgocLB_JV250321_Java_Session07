package Entity;

public class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car name: " + name + ", Speed: " + speed + " km/h");
    }
}
