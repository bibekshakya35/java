package lambda;

/**
 * Created by bibek on 6/29/17.
 */
@FunctionalInterface
public interface MathOperation {
    int operation(int a, int b);

    @Override
    String toString();

    @Override
    boolean equals(Object obj);
}
