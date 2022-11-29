package Exception1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            System.out.println(div(0, 2));
//        } catch (DelitelNolException delitelNolException) {
//            System.out.println("Ошибка , а не может быть равно нулю");
//        }
        System.out.println(div(0, 2));
    }

    public static double div(int a, int b) throws DelitelNolException {
        if(a == 0)  {
            throw new DelitelNolException("Первый делитель равен нулю.");
        }
        return a / b;
    }
}
