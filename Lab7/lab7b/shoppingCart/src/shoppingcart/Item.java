package shoppingcart;

import products.Product;

public class Item {
    int quantity;
    Product product;

    public Item() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nItem............................\n" +
                getProduct() +
                String.format("Quantity: %d", quantity);

    }
}
