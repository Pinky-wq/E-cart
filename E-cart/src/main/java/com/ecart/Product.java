package com.ecart;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void addItem(Product product) {
        items.add(product);
    }
    
    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }


    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 20333);
        Product phone = new Product("Phone", 14560);
        
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(phone);
        
        System.out.println("Total Price: INR" + cart.calculateTotal());
    }
}
