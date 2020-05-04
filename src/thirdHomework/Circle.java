package thirdHomework;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
