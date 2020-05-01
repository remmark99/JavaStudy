package firstHomework;

public class AreaCalculator {
    public static void main(String[] args) {
    }

    public static double area(double radius) {
        if (radius >= 0) return Math.PI * radius * radius;

        return -1d;
    }

    public static double area(double width, double length) {
        if (width >= 0 && length >= 0) return width * length;

        return -1d;
    }
}
