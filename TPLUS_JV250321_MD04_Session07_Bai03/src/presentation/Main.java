package presentation;

import entity.Circle;
import entity.Rectangle;
import entity.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5F);
        Rectangle rectangle = new Rectangle(5.0F, 5.0F);
        Square square = new Square(10.0F);

        circle.setColor("Red");
        rectangle.setColor("Blue");
        square.setColor("Green");

        circle.display();
        rectangle.display();
        square.display();
    }
}
