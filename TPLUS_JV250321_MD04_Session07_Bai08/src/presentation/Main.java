package presentation;

import entity.Clothing;
import entity.Electronics;
import entity.Food;
import entity.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Kem danh rang", 40000.0);
        Product electronics = new Electronics("Sac dien thoai", 40000.0);
        Product clothing = new Clothing("T-shirt", 40000.0);
        Product food = new Food("Bun bo Hue", 40000.0);

        product.displayPerOne();
        product.displayPerMany(200);

        electronics.displayPerOne();
        electronics.displayPerMany(200);

        clothing.displayPerOne();
        clothing.displayPerMany(200);

        food.displayPerOne();
        food.displayPerMany(200);
    }
}
