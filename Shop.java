package com.company;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.Scanner;

public class Shop {

    Scanner in = new Scanner(System.in);
    public HashMap<Category, ArrayList<Product>> products = new HashMap<>();

    public void addProduct() {
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
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(id, name, brand, quantity, price));

        System.out.print("Select product category: ");
        System.out.println("1: BEAUTY");
        System.out.println("2: BOOKS");
        System.out.println("3: SOFTWARE");
        byte chooseCategory = in.nextByte();

        products.put(Category.getCategoryByCode(chooseCategory), productList);

    }
}
    
