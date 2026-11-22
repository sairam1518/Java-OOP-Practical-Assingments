
import java.util.*;

interface Rentable {
    void bookVehicle(int days);
}

abstract class Vehicle implements Rentable {
    String brand;
    double pricePerDay;
    boolean available = true;

    abstract double calculateRent(int days);

    public void bookVehicle(int days) {
        available = false;
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
    String name, phone;

    void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Phone: " + phone);
    }
}

public class vehicleRental {

    static ArrayList<String> history = new ArrayList<>();
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
            System.out.println("1. View Vehicles");
            System.out.println("2. Book Vehicle");
            System.out.println("3. Booking History");
            System.out.println("4. Total Bill");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
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
                        System.out.println("Invalid choice!");
                        break;
                    }

                    Vehicle selected = vehicles[choice - 1];

                    if (!selected.available) {
                        System.out.println("Vehicle already booked!");
                        break;
                    }

                    System.out.print("Enter rental days: ");
                    int days = sc.nextInt();

                    if (days <= 0) {
                        System.out.println("Invalid days!");
                        break;
                    }

                    double amount = selected.calculateRent(days);
                    selected.bookVehicle(days);

                    grandTotal += amount;

                    history.add(selected.brand + " | " +
                            days + " days | Rs. " + amount);

                    System.out.println("Booking successful!");
                    System.out.println("Amount: Rs. " + amount);
                    break;

                case 3:
                    System.out.println("\n===== BOOKING HISTORY =====");

                    if (history.isEmpty()) {
                        System.out.println("No bookings yet.");
                    } else {
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println((i + 1) + ". " + history.get(i));
                        }
                    }
                    break;

                case 4:
                    customer.displayCustomer();
                    System.out.println("Total Bookings: " + history.size());
                    System.out.println("Grand Total: Rs. " + grandTotal);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (option != 5);

        sc.close();
    }

    static void displayVehicles(Vehicle[] vehicles) {
        System.out.println("\n===== VEHICLES =====");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " +
                    vehicles[i].brand + " - Rs. " +
                    vehicles[i].pricePerDay + "/day - " +
                    (vehicles[i].available ? "Available" : "Booked"));
        }
    }
}
