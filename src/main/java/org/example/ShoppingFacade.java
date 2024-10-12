package org.example;

public class ShoppingFacade {
    // Encapsulation
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        // Initialize all subsystems in the constructor
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.inventoryManager = new InventoryManager();
        this.shippingService = new ShippingService();
    }
    // without discount card
    public void placeOrder(String productName, String cardName, double amount){
        // We typed in if else PaymentProcessor if there was not be discountCard (null in if,else)
        placeOrder(productName,cardName,amount,null);
    }
    // (Aditionnaly) Checking with discount CARD
    public void placeOrder(String productName, String cardName, double amount, String discountCard){
        // Providing order tracking
        if(productCatalog.searchProduct(productName)){
            productCatalog.selectingProduct(productName);
            if(paymentProcessor.processTransaction()){
                // discount card amount
                double discount = paymentProcessor.checkDiscount(discountCard);
                double discountedAmount = amount - (amount * discount);
                paymentProcessor.makePayment(cardName,discountedAmount);
                if(inventoryManager.checkInventory(productName)){
                    shippingService.calculateShippingCharges(productName);
                    shippingService.shipProduct(productName);
                }
                else{
                    System.out.println("The product was not found in stock!");
                }
            }
            else{
                System.out.println("Payment was declined!");
            }
        }
        else{
            System.out.println("This Product is not sold here!");
        }
    }
}
