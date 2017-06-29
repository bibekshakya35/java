package lambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bibek on 6/29/17.
 */
public class LambdaExample {
    private static final Logger LOG = Logger.getLogger(LambdaExample.class.getName());

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> makeAdder = x -> y -> x + y;
        Function<Integer, Integer> addFunction = x -> x + 1;
        Function<String, String> concatFunction = x -> x + 1;
        LOG.log(Level.INFO, "here is add function {0} and here is concatFunction {1}", new Object[]{
                addFunction.apply(2), concatFunction.apply("Bibek")
        });
        addFunction = Utils::add;
        concatFunction = Utils::concat;
        LOG.log(Level.INFO, "here is add function {0} and here is concatFunction {1}", new Object[]{
                addFunction.apply(2), concatFunction.apply("Bibek")
        });
        Function adder1 = makeAdder.apply(2);
        LOG.log(Level.INFO, "function inside function {0}", new Object[]{
                adder1.apply(2)
        });
        Function<Integer, Function<Integer, Integer>> adder2 = Utils::adder;
        Function<Integer, Integer> add1 = adder2.apply(1);
        Function<Integer, Integer> mul3 = x -> x * 3;
        LOG.log(Level.INFO, "Function refering Utils {0}", new Object[]{
                add1.apply(1)
        });
        Function<Integer, Function<Integer, Integer>> multiplier = Utils::multiplier;
        Function<Integer, Integer> multiple = multiplier.apply(2);

        LOG.log(Level.INFO, "Function of multiplier {0}", new Object[]{
                multiple.apply(12)
        });
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        Integer res = sum.apply(1, 2);
        LOG.log(Level.INFO, "function of binaryOperator {0} ", new Object[]{
                res
        });
        //(f,g)->x->g(f(x))
        BinaryOperator<Function<Integer, Integer>> compose = (f, g) -> x -> g.apply(f.apply(x));
        Function<Integer, Integer> function = compose.apply(add1, mul3);
        Integer data = function.apply(2);
        LOG.log(Level.INFO, "Compose data function {0}", new Object[]{
                data
        });
        Function<Integer, Integer> compositeFunction = mul3.compose(add1);
        Integer composite = compositeFunction.apply(10);
        LOG.log(Level.INFO, "Composite function with compose {0}", new Object[]{
                composite
        });
        UnaryOperator<Integer> addUnary = n -> n + 1;
        UnaryOperator<String> concatUnary = s -> s + 1;
        Function<Integer, UnaryOperator<Integer>> sumUnary = x -> y -> x + y;
        UnaryOperator<Integer> sum10 = sumUnary.apply(10);
        Integer sum120 = sum10.apply(12);
        LOG.log(Level.INFO, "Level {0}", new Object[]{
                sum120
        });
        IntFx addData = n -> n + 1;
        IntFunction<IntFx> sumF = x -> y -> x + y;
        IntFx sum1210 = sumF.apply(12);
        LOG.log(Level.INFO, "Function in primitive {0}", new Object[]{
                sum1210.apply(12)
        });
        MathOperation mathOperation = (x,y) ->x*y;
        LOG.log(Level.INFO,"Trying {0}",mathOperation.operation(1,2));

    }
}
