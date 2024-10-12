package org.example;

public class PaymentProcessor {
    // (Additionally) Check discount card
    public double checkDiscount(String discountCard){ // this is string, because we could have bronze,silver,golden discountCard like Sportmaster
        if (discountCard == null) {
            return 0; // If there is no discountCard
        }
        // Discounts Bronze,Silver,Golden.
        else if (discountCard.equals("Bronze")) {
            return 0.1; // 10%
        } else if (discountCard.equals("Silver")) {
            return 0.25; // 25%
        } else if (discountCard.equals("Golden")) {
            return 0.5; // 50%
        } else {
            return 0; // If card is not valid.
        }
    }
    // Process a transaction
    public boolean processTransaction() {
        // Simulate transaction processing
        System.out.println("Processing transaction...");
        return true; // The transaction is successful!
    }
    // Make a payment
    public void makePayment(String paymentDetails, double amount) {
        // Simulate payment processing
        System.out.println("Making payment of " + amount + " using: " + paymentDetails);
    }
}
