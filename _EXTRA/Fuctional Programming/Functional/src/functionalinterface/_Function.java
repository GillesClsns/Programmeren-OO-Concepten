package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100)); // Normal Java function

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100)); // Using BiFunction

    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (x, y) -> (x + 1) * y;

    static int incrementByOne(int x) {
        return x + 1;
    }

    static int incrementByOneAndMultiply(int x, int y) {
        return (x + 1) * y;
    }

}