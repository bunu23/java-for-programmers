

import java.util.function.Function;

public class FunctionChainingAndThen {
    public static void main(String[] args) {
        Function<String,Integer> stringLength= str->str.length();
        Function<Integer,Integer> square=num->num*num;
        Function<String,Integer> chainedFunction=stringLength.andThen(square);
        String input="hello";
        Integer result=chainedFunction.apply(input);
        System.out.println("the square length of string is: "+result);

    }
}
