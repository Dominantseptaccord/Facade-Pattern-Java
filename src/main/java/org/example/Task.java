package org.example;


public class Task {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Product foodProduct = new FoodProduct(500);
        Product elecProduct = new ElectronicsProduct(500);
        Product clothProduct = new ClothingProduct(500);
        Product houshProduct = new HouseholdProduct(500);
        System.out.println(discountCalculator.calculateDiscount(foodProduct));
        System.out.println(discountCalculator.calculateDiscount(elecProduct));
        System.out.println(discountCalculator.calculateDiscount(clothProduct));
        System.out.println(discountCalculator.calculateDiscount(houshProduct));
    }
}

