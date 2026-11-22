
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
        if (available) {
            available = false;
            System.out.println("Vehicle booked for " + days + " days");
        }
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

        String again;
        double grandTotal = 0;
        int totalBookings = 0;

        do {

            System.out.println("\n===== AVAILABLE VEHICLES =====");

            for (int i = 0; i < vehicles.length; i++) {
                System.out.println((i + 1) + ". " +
                        vehicles[i].brand + " - Rs. " +
                        vehicles[i].pricePerDay + "/day - " +
                        (vehicles[i].available ? "Available" : "Booked"));
            }

            System.out.print("\nChoose vehicle (1-5): ");
            int choice = sc.nextInt();

            System.out.print("Enter number of rental days: ");
            int days = sc.nextInt();

            if (days <= 0) {
                System.out.println("Invalid number of days!");
            }
            else if (choice >= 1 && choice <= 5) {

                Vehicle selected = vehicles[choice - 1];

                if (selected.available) {

                    double amount = selected.calculateRent(days);

                    generateBill(customer, selected, days);

                    grandTotal += amount;
                    totalBookings++;

                } else {
                    System.out.println("Sorry! This vehicle is already booked.");
                }
            }
            else {
                System.out.println("Invalid vehicle choice!");
            }

            System.out.print("\nDo you want to book another vehicle? (yes/no): ");
            again = sc.next();

        } while (again.equalsIgnoreCase("yes"));

        System.out.println("\n========== FINAL BILL SUMMARY ==========");
        customer.displayCustomer();
        System.out.println("----------------------------------------");
        System.out.println("Total Vehicles Booked: " + totalBookings);
        System.out.println("Grand Total: Rs. " + grandTotal);
        System.out.println("========================================");
        System.out.println("Thank you for using our rental system!");

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
    }
}
