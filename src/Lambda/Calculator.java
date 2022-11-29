package Lambda;

import java.util.function.BinaryOperator;

public class Calculator {

    public static int calculate(int a , int b, BinaryOperator<Integer> operator) {
        return operator.apply(a , b);
    }
}

