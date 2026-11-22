
class Vehicle {

    String brand;
    double pricePerDay;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price per day: Rs. " + pricePerDay);
    }

    double calculateRent(int days) {
        return pricePerDay * days;
    }
}

// Car inherits Vehicle
class Car extends Vehicle {

    int seats;

    @Override
    double calculateRent(int days) {
        return (pricePerDay * days) + 500;
    }
}

// Bike inherits Vehicle
class Bike extends Vehicle {

    int engineCC;

    @Override
    double calculateRent(int days) {
        return (pricePerDay * days) + 100;
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

        System.out.println("----- CAR RENTAL -----");
        c1.displayDetails();
        System.out.println("Total rent for 3 days: Rs. " + c1.calculateRent(3));

        System.out.println();

        System.out.println("----- BIKE RENTAL -----");
        b1.displayDetails();
        System.out.println("Total rent for 3 days: Rs. " + b1.calculateRent(3));
    }
}
