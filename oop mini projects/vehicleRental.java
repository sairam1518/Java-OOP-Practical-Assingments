
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

    double calculateRent(int days) {
        return (pricePerDay * days) + 500;
    }
}

class Bike extends Vehicle {

    double calculateRent(int days) {
        return (pricePerDay * days) + 100;
    }
}

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

        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Enter customer name: ");
        customer.name = sc.nextLine();

        System.out.print("Enter phone number: ");
        customer.phone = sc.nextLine();

        System.out.println("\n===== CUSTOMER DETAILS =====");
        customer.displayCustomer();

        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.pricePerDay = 2000;

        Bike b1 = new Bike();
        b1.brand = "Royal Enfield";
        b1.pricePerDay = 1000;

        System.out.println("\n===== VEHICLE RENTAL =====");
        System.out.println("1. Car - Toyota");
        System.out.println("2. Bike - Royal Enfield");

        System.out.print("Choose vehicle (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        if (days <= 0) {
            System.out.println("Invalid number of days!");
        }
        else if (choice == 1) {
            c1.displayDetails();
            c1.bookVehicle(days);
        }
        else if (choice == 2) {
            b1.displayDetails();
            b1.bookVehicle(days);
        }
        else {
            System.out.println("Invalid vehicle choice!");
        }

        sc.close();
    }
}
