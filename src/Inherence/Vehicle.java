package Inherence;

public class Vehicle {

    private String Brand;
    private int Year;

    public Vehicle(String brand, int year) {
        this.Brand = brand;
        this.Year = year;
    }

    public Vehicle() {
        this.Brand = "Unknown";
        this.Year = 0;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    // Getter for Year
    public int getYear() {
        return Year;
    }

    // Setter for Year
    public void setYear(int year) {
        this.Year = year;
    }

    public void startVehicle() {
        System.out.println("The vehicle is starting");
    }

    public void stopVehicle() {
        System.out.println("The vehicle is stopping");
    }
}
