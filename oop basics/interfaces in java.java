interfaces in java.java

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

public class Interfaces {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.pay(500);
        p2.pay(1000);
    }
}
