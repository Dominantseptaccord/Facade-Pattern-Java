package org.example;

class FoodProduct implements Product {
    public double price;
    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;
    }
}
