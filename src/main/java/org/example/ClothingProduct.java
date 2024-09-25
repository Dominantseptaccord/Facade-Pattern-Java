package org.example;

class ClothingProduct implements Product{
    public double price;
    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.2;
    }
}
