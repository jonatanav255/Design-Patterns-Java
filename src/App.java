import Inherence.Car;

public class App {

    public static void main(String[] args) throws Exception {
        // Vehicle vehicle = new Vehicle("Toyota", 2022);

        // Vehicle vehicle2 = new Vehicle();
        // System.out.println(vehicle2.getBrand() + ", " + vehicle2.getYear());  // Output: Unknown, 0
        Car car = new Car("Toyota", 2002, 4);
        // vehicle.Brand = "Toyota";
        // vehicle.Year = 2022;
        car.startVehicle();
        // System.out.println(car.startVehicle());
        // System.out.println(vehicle.getYear());


        // vehicle.setBrand("Honda");
        // vehicle.setYear(2023);

        // Print the updated values
        // System.out.println("Updated Brand: " + vehicle.getBrand());
        // System.out.println("Updated Year: " + vehicle.getYear());
        // System.out.println(vehicle.Year);
    }
}
