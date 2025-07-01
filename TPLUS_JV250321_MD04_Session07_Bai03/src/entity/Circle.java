package entity;

public class Circle implements Colorable {
    private float radius;
    private String color;

    public Circle(float radius) {
        this.radius = radius;
        this.color = "no color";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Circle color: " + color);
    }
}
