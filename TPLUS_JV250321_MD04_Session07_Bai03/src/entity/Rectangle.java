package entity;

public class Rectangle implements Colorable {
    private float width;
    private float height;
    private String color;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        this.color = "no color";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Rectangle color: " + color);
    }
}
