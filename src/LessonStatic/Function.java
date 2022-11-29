package LessonStatic;

public class Function {
    public static final double PI = 3.14;

    public double square2(double radius) {
        double square1 = PI * radius * radius;

        return square1;
    }

    public static double length(double radius) {
        double square = 2 * PI * radius;
        return square;
    }

    public void info(double radius) {
        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + square2(radius));
        System.out.println("Длинна окружности = " + length(radius));
    }
//    public static int multiplication(int a, int b, int c) {
//        int result = a * b * c;
//
//        return result;
//    }

//    public static void division(int a, int b) {
//       int result = a / b ;
//       double  result2 = a % b;
//       System.out.println(result + " " + result2);
    }

