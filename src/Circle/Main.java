package Circle;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(4, 6);
        Circle circle = new Circle(5,3, 4);
        Circle circle1 = new Circle( 5 , coordinate);
        System.out.println(Circle.PI);
    }
}
