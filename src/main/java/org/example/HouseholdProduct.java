package org.example;

class HouseholdProduct implements Product{
    public double price;

    public HouseholdProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.5;
    }
}
