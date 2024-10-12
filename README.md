Facade Pattern Online Shopping System Documentation
Overview
The Online Shopping System implements the Facade Design Pattern to provide a simplified interface for interacting with complex subsystems. This documentation describes the functionality of each subsystem and explains how the Facade Pattern enhances the user experience by hiding the complexities of the underlying processes.

Subsystems
1. ProductCatalog
Functionality:

Searching for Products: The ProductCatalog class provides methods to search for products by name.
Selecting Products: Allows the selection of a specific product once it has been found.
Methods:

searchProduct(String productName): Searches for a product by name. Returns true if the product is found; otherwise, false.
selectingProduct(String productName): Selects the specified product.

2. PaymentProcessor
Functionality:

Processing Transactions: Manages payment processing and transaction approvals.
Making Payments: Handles the actual payment transactions.
Discount Handling: Checks the discount based on a provided discount card.
Methods:

processTransaction(): Simulates the transaction processing. Returns true if successful.
makePayment(String paymentDetails, double amount): Processes the payment with the specified details and amount.
checkDiscount(String discountCard): Returns the discount percentage based on the type of discount card.

3. InventoryManager
Functionality:

Checking Inventory: Verifies whether a specific product is available in stock.
Methods:

checkInventory(String productName): Checks the inventory for the specified product. Returns true if available; otherwise, false.

4. ShippingService
Functionality:

Calculating Shipping Charges: Computes shipping fees based on the selected product.
Shipping Products: Manages the shipping process for the ordered products.
Methods:

calculateShippingCharges(String productName): Calculates and displays shipping charges for the specified product.
shipProduct(String productName): Initiates the shipping of the specified product.

Facade: ShoppingFacade
Functionality: The ShoppingFacade class provides a unified interface for the subsystems, allowing clients to interact with the system without needing to understand its internal complexities.

Methods:
placeOrder(String productName, String cardName, double amount): Places an order for the specified product, processes payment, checks inventory, and arranges shipping.
placeOrder(String productName, String cardName, double amount, String discountCard): Overloaded method that applies discounts based on the provided discount card.

Facade: ShoppingFacade
Functionality: The ShoppingFacade class provides a unified interface for the subsystems, allowing clients to interact with the system without needing to understand its internal complexities.

Methods:
placeOrder(String productName, String cardName, double amount): Places an order for the specified product, processes payment, checks inventory, and arranges shipping.
placeOrder(String productName, String cardName, double amount, String discountCard): Overloaded method that applies discounts based on the provided discount card.
