package application;

import products.Product;
import shoppingcart.ShoppingCart;

public class Application {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("A123", 100.0, "TV");
        shoppingCart.action(product1, "add");
        Product product2 = new Product("A665", 75.0, "mp3 Player");
        shoppingCart.action(product2, "add");
        Product product3 = new Product("A665", 75.0, "Smart Watch");
        shoppingCart.action(product3, "add");

        shoppingCart.action(null, "print");

        shoppingCart.action(product3, "remove");
        shoppingCart.action(product2, "remove");

        shoppingCart.action(null, "print");
    }
}
