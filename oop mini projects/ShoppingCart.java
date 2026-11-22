
import java.util.ArrayList;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - Rs. " + price);
    }
}

class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println(p.name + " added to cart!");
    }

    void displayCart() {
        System.out.println("\n===== SHOPPING CART =====");

        if (products.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            for (Product p : products) {
                p.display();
            }
        }
    }

    void calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.price;
        }

        System.out.println("Total Amount: Rs. " + total);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Cart cart = new Cart();

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();
        cart.calculateTotal();
    }
}
