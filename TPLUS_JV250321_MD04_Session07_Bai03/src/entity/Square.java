package entity;

public class Square implements Colorable {
    private float side;
    private String color;

    public Square(float side) {
        this.side = side;
        this.color = "none";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Square color: " + color);
    }
}
