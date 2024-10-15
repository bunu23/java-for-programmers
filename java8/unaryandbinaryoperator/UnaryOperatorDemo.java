

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square=x->x*x;
        int result=square.apply(3);
        System.out.println("square of 3 is : "+ result);
    }
}
