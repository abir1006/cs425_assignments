package products;

public class Product {
    String productNumber;
    double price;
    String description;

    public Product(String productNumber, double price, String description) {
        this.productNumber = productNumber;
        this.price = price;
        this.description = description;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                String.format("Product Number: %s\n", productNumber) +
                        String.format("Price: %.2f\n", price) +
                        String.format("Description: %s\n", description);

    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Product product)) return false;
        else {
            return this.productNumber.equals(product.productNumber) && this.price == product.price
                    && this.description.equals(product.description);
        }

    }
}
