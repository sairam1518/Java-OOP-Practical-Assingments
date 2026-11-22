
abstract class Shape {

    abstract double calculateArea();

    void display() {
        System.out.println("Calculating Area...");
    }
}

class Circle extends Shape {

    double radius = 5;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {

    double length = 10;
    double breadth = 5;

    double calculateArea() {
        return length * breadth;
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        System.out.println("Circle Area: " + c.calculateArea());

        r.display();
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
