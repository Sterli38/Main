package Circle;

public class Circle {
    public static final double PI = 3.14;

    private final double radius;
    private final Coordinate coordinate;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.coordinate = new Coordinate(x, y);
    }

    public Circle(double radius, Coordinate coordinate) {
        this.radius = radius;
        this.coordinate = coordinate;
    }

    public double getCircumferenceLength() {
        return 2 * PI * radius;
    }

    public double getArcLength(double a) {
        return PI * radius * a / 180;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getAreaOfSector(double a) {
        return PI * radius * radius * a / 360;
    }

    public static double getPI() {
        return PI;
    }
}
