
class Vehicle {

    String brand;
    double pricePerDay;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price per day: Rs. " + pricePerDay);
    }
}

// Child class Car
class Car extends Vehicle {

    int seats;

    void displayCar() {
        displayDetails();
        System.out.println("Seats: " + seats);
    }
}

// Child class Bike
class Bike extends Vehicle {

    int engineCC;

    void displayBike() {
        displayDetails();
        System.out.println("Engine: " + engineCC + " CC");
    }
}

public class vehicleRental {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.pricePerDay = 2000;
        c1.seats = 5;

        Bike b1 = new Bike();

        b1.brand = "Royal Enfield";
        b1.pricePerDay = 1000;
        b1.engineCC = 350;

        System.out.println("----- CAR DETAILS -----");
        c1.displayCar();

        System.out.println();

        System.out.println("----- BIKE DETAILS -----");
        b1.displayBike();
    }
}
