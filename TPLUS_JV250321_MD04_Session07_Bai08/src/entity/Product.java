package entity;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public double getDiscount() {
        return 0;
    }

    public double getFinalPrice() {
        return price - price * getDiscount();
    }

    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 0.05;
        }
        return getDiscount();
    }

    public double getFinalPrice(int quantity) {
        return (price - price * getDiscount(quantity) - price * getDiscount()) * quantity;
    }

    public void displayPerOne() {
        System.out.printf("Gia sau chiet khau khi mua 1 %s: %,.1f\n", this.name, getFinalPrice());
    }

    public void displayPerMany(int quantity) {
        System.out.printf("Gia sau chiet khau sau khi mua %d %s: %,.1f\n", quantity, this.name, getFinalPrice(quantity));
    }
}
