package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Basket {

    ArrayList<Product> selectedProduct = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addProduct(Product product) {
        System.out.print("Enter the ID: ");
        int id = in.nextInt();
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        System.out.print("Enter the brand: ");
        String brand = in.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = in.nextInt();
        System.out.print("Enter the price: ");
        int price = in.nextInt();
        product = new Product(id, name, brand, quantity, price);
        selectedProduct.add(new Product(id, name, brand, quantity, price));
        System.out.println("ID: " + id + ", " + "name: " + name + ", " + "brand: " + brand + ", " + "quantity: " + quantity + ", " + "price: " + price + ".");
    }

    public void removeProduct(String name) {
        int delete = 0;
        for(int i = 0; i < selectedProduct.size(); i++){
            if(selectedProduct.get(i).getName().equals(name)) {
                selectedProduct.remove(i);
                i--;
                delete++;
            }
        }
    }

    public void clearBasket() {
        selectedProduct.clear();
    }

//    public void getTotalPrice (Shop shop) {
//        double price = 0;
//
//        for (int allPrice : shop.addProduct()) {
//            Shop shop = addProduct(allPrice);
//            if (shop != null) {
//                price += shop.getProduct().getPrice();
//            }
//            return price;
//        }
//    }
}
