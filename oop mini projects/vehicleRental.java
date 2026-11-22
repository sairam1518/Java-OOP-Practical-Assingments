
import java.util.Scanner;

interface Rentable {
    void bookVehicle(int days);
}

abstract class Vehicle implements Rentable {

    String brand;
    double pricePerDay;

    abstract double calculateRent(int days);

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price per day: Rs. " + pricePerDay);
    }

    public void bookVehicle(int days) {
        System.out.println("Vehicle booked for " + days + " days");
        System.out.println("Total rent: Rs. " + calculateRent(days));
    }
}

class Car extends Vehicle {

    int seats;

    double calculateRent(int days) {
        return (pricePerDay * days) + 500;
    }
}

class Bike extends Vehicle {

    int engineCC;

    double calculateRent(int days) {
        return (pricePerDay * days) + 100;
    }
}

// Customer class
class Customer {

    String name;
    String phone;

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phone);
    }
}

public class vehicleRental {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.name = "Sairam";
        customer.phone = "9876543210";

        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.pricePerDay = 2000;

        Bike b1 = new Bike();
        b1.brand = "Royal Enfield";
        b1.pricePerDay = 1000;

        System.out.println("===== CUSTOMER DETAILS =====");
        customer.displayCustomer();

        System.out.println();

        System.out.println("===== CAR BOOKING =====");
        c1.displayDetails();
        c1.bookVehicle(3);

        System.out.println();

        System.out.println("===== BIKE BOOKING =====");
        b1.displayDetails();
        b1.bookVehicle(3);
    }
}
