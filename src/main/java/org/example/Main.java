package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Facade - provides a simple interface for interacting with a more complex
        system consisting of many interconnected classes or subsystems.
         */
        ShoppingFacade shopping = new ShoppingFacade();
        shopping.placeOrder("Laptop HP", "Jusan Bank",599.999);
        // Extensibility: Ensure that your facade can be easily extended to support additional features, such as handling discounts
        System.out.println();
        shopping.placeOrder("Laptop HP", "Jusan Bank",599.999,"Bronze");
    }
}
