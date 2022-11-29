package Lesson1;

public class Functions {

    public static  double pow(double a, int b) {
        int result = 1;

        for(int i = 0; i < b; i++) {
           result *= a;
        }

        return result;
    }

    public static double getModule(double a) {
        if(a < 0) {
            a *= -1;
        }

        return a;
    }

    public static int getRounding(double a) {
        return (int) a;
    }

    public static double getRoundingDown(double a) {

        return  (int) a / 10 * 10;
    }
}
