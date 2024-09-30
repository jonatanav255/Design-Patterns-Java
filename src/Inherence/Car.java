package Inherence;

// Car class extends Vehicle class
public class Car extends Vehicle {

    private int numberOfDoors;

    // Constructor with parameters for brand, year, and numberOfDoors
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);  // Call the constructor of the Vehicle class
        this.numberOfDoors = numberOfDoors;
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Setter for numberOfDoors
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // You can also override methods from Vehicle, if needed
    @Override
    public void startVehicle() {
        super.startVehicle();  // Calls Vehicle's startVehicle method
        System.out.println("The car is starting");
    }
}
