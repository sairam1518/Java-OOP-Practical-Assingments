
class Vehicle {

    String brand;
    double pricePerDay;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price per day: Rs. " + pricePerDay);
    }
}

public class VehicleRental {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        v1.brand = "Toyota";
        v1.pricePerDay = 2000;

        v1.displayDetails();
    }
}
