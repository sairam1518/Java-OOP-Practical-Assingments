
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

        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.pricePerDay = 2000;

        Bike b1 = new Bike();
        b1.brand = "Royal Enfield";
        b1.pricePerDay = 1000;

        System.out.println("\n===== AVAILABLE VEHICLES =====");
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
            generateBill(customer, c1, days);
        }
        else if (choice == 2) {
            generateBill(customer, b1, days);
        }
        else {
            System.out.println("Invalid vehicle choice!");
        }

        sc.close();
    }

    static void generateBill(Customer customer, Vehicle vehicle, int days) {

        double total = vehicle.calculateRent(days);
        double baseRent = vehicle.pricePerDay * days;
        double extraCharge = total - baseRent;

        vehicle.bookVehicle(days);

        System.out.println("\n========== BOOKING RECEIPT ==========");
        customer.displayCustomer();
        System.out.println("-------------------------------------");
        vehicle.displayDetails();
        System.out.println("Rental Days: " + days);
        System.out.println("Base Rent: Rs. " + baseRent);
        System.out.println("Additional Charges: Rs. " + extraCharge);
        System.out.println("-------------------------------------");
        System.out.println("FINAL AMOUNT: Rs. " + total);
        System.out.println("=====================================");
        System.out.println("Thank you for choosing our service!");
    }
}
