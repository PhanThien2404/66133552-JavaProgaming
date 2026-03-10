
public class Ex_Circle_1_1 {
    private double radius;
    private String color;

    public Ex_Circle_1_1() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Ex_Circle_1_1(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Ex_Circle_1_1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}