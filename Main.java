package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();
        Basket basket = new Basket();

        byte choice = -1;
        while(choice != 0) {
            System.out.println("Select one of following items");
            System.out.println("1: Add products to map");
            System.out.println("2: Get product from map");
            System.out.println("3: Add product from shop to basket");
            System.out.println("4: Remove product from basket");
            System.out.println("5: Clear basket ");
            System.out.println("6: Print out total price of products in basket");
            System.out.println("0: Exit");

            choice = in.nextByte();
            String choose;
            switch (choice) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: System.out.print("Enter the name of product: ");
                    String name = in.nextLine();
                    basket.removeProduct(name);
                    break;
                case 5:
                    basket.clearBasket();
                    break;
                case 6:
                    break;
                case 0:
                    break;
                default: choose = "You haven't chosen correctly";
            }
        }
    }
}
