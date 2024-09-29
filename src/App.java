import Inherence.Vehicle;

public class App {

    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle("Toyota", 2022);
        // vehicle.Brand = "Toyota";
        // vehicle.Year = 2022;
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getYear());


        vehicle.setBrand("Honda");
        vehicle.setYear(2023);

        // Print the updated values
        System.out.println("Updated Brand: " + vehicle.getBrand());
        System.out.println("Updated Year: " + vehicle.getYear());
        // System.out.println(vehicle.Year);
    }
}
