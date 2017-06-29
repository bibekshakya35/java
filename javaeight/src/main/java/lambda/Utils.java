package lambda;

import java.util.function.Function;

/**
 * Created by bibek on 6/29/17.
 */
public class Utils {
    public static Integer add(Integer x) {
        return x + 1;
    }

    public static String concat(String x) {
        return x + 1;
    }

    public static Function<Integer, Integer> adder(Integer x) {
        return y -> x + y;
    }

    public static Function<Integer, Integer> multiplier(Integer x) {
        return y -> x * y;
    }

}
