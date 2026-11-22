
interface Rentable {
    double calculateRent(int days);
}

abstract class Vehicle implements Rentable {

    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {

    Car(String brand, String model) {
        super(brand, model);
    }

    public double calculateRent(int days) {
        return days * 2000;
    }
}

class Bike extends Vehicle {

    Bike(String brand, String model) {
        super(brand, model);
    }

    public double calculateRent(int days) {
        return days * 800;
    }
}

public class VehicleRentalDemo {

    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota", "Fortuner");
        Vehicle v2 = new Bike("Royal Enfield", "Classic 350");

        System.out.println("===== CAR DETAILS =====");
        v1.display();
        System.out.println("Rent for 3 days: Rs. " + v1.calculateRent(3));

        System.out.println("\n===== BIKE DETAILS =====");
        v2.display();
        System.out.println("Rent for 3 days: Rs. " + v2.calculateRent(3));
    }
}
