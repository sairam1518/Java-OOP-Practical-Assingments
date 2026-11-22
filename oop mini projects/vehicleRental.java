
import java.util.Scanner;

interface Rentable {
    void bookVehicle(int days);
}

abstract class Vehicle implements Rentable {

    String brand;
    double pricePerDay;
    boolean available = true;

    abstract double calculateRent(int days);

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price per day: Rs. " + pricePerDay);
    }

    public void bookVehicle(int days) {
        available = false;
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

    static String[] history = new String[5];
    static int bookingCount = 0;
    static double grandTotal = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Enter customer name: ");
        customer.name = sc.nextLine();

        System.out.print("Enter phone number: ");
        customer.phone = sc.nextLine();

        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Car();
        vehicles[0].brand = "Toyota";
        vehicles[0].pricePerDay = 2000;

        vehicles[1] = new Car();
        vehicles[1].brand = "Honda";
        vehicles[1].pricePerDay = 1800;

        vehicles[2] = new Car();
        vehicles[2].brand = "Hyundai";
        vehicles[2].pricePerDay = 1500;

        vehicles[3] = new Bike();
        vehicles[3].brand = "Royal Enfield";
        vehicles[3].pricePerDay = 1000;

        vehicles[4] = new Bike();
        vehicles[4].brand = "KTM";
        vehicles[4].pricePerDay = 800;

        int option;

        do {

            System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
            System.out.println("1. View Available Vehicles");
            System.out.println("2. Book a Vehicle");
            System.out.println("3. View Booking History");
            System.out.println("4. View Total Bill");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    displayVehicles(vehicles);
                    break;

                case 2:
                    displayVehicles(vehicles);

                    System.out.print("Choose vehicle (1-5): ");
                    int choice = sc.nextInt();

                    if (choice < 1 || choice > 5) {
                        System.out.println("Invalid vehicle choice!");
                        break;
                    }

                    Vehicle selected = vehicles[choice - 1];

                    if (!selected.available) {
                        System.out.println("Vehicle is already booked!");
                        break;
                    }

                    System.out.print("Enter rental days: ");
                    int days = sc.nextInt();

                    if (days <= 0) {
                        System.out.println("Invalid number of days!");
                        break;
                    }

                    double amount = selected.calculateRent(days);

                    selected.bookVehicle(days);

                    grandTotal += amount;

                    history[bookingCount] = selected.brand +
                            " | " + days + " days | Rs. " + amount;

                    bookingCount++;

                    System.out.println("\nBooking successful!");
                    System.out.println("Rental Amount: Rs. " + amount);
                    break;

                case 3:
                    System.out.println("\n===== BOOKING HISTORY =====");

                    if (bookingCount == 0) {
                        System.out.println("No bookings yet.");
                    } else {
                        for (int i = 0; i < bookingCount; i++) {
                            System.out.println((i + 1) + ". " + history[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n===== TOTAL BILL =====");
                    customer.displayCustomer();
                    System.out.println("Total Vehicles Booked: " + bookingCount);
                    System.out.println("Grand Total: Rs. " + grandTotal);
                    break;

                case 5:
                    System.out.println("Thank you for using our system!");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (option != 5);

        sc.close();
    }

    static void displayVehicles(Vehicle[] vehicles) {

        System.out.println("\n===== VEHICLE LIST =====");

        for (int i = 0; i < vehicles.length; i++) {

            System.out.println((i + 1) + ". " +
                    vehicles[i].brand +
                    " - Rs. " + vehicles[i].pricePerDay +
                    "/day - " +
                    (vehicles[i].available ? "Available" : "Booked"));
        }
    }
}
