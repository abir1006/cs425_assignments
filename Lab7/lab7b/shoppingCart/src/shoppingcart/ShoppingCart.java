package shoppingcart;

import java.util.ArrayList;

import products.Product;

public class ShoppingCart {
    ArrayList<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void action(Product product, String action) {

        switch (action) {
            case "add":
                addProduct(product);
                break;
            case "remove":
                removeProduct(product);
                break;
            case "print":
                printShoppingCart();
                break;
            default:
                System.out.println("Invalid Action");
        }


    }

    private void printShoppingCart() {
        System.out.println(itemList);
        System.out.println("Total price =" + getTotalPrice());
    }

    private void removeProduct(Product product) {
        for (Item item : itemList) {
            if (item.getProduct().equals(product))
                item.setQuantity(item.getQuantity() - 1);
            if (item.getQuantity() == 0) {
                itemList.remove(item);
                return;
            }
        }

    }

    private void addProduct(Product product) {

        for (Item item : itemList) {

            if (item.getProduct().equals(product)) {
                item.setQuantity(item.getQuantity() + 1);
                return;
            }

        }

        Item item = new Item();
        item.setProduct(product);
        item.setQuantity(1);
        itemList.add(item);

    }


    // get total price
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : itemList) {
            totalPrice = totalPrice + (item.getProduct().getPrice() * item.getQuantity());
        }
        return totalPrice;
    }
}
