package org.deziras.function;

/**
 * Represents a function that accepts an int-valued and a object-valued argument,and
 * produces a result. This is the {@code (int, reference)} specialization for
 * {@link Function2}.
 *
 * @param <R> return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface IntFunction2<T, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param i function argument 1
     * @param t function argument 2
     *
     * @return the function result
     */
    R invoke(int i, T t);

    default Function2<Integer, T, R> boxed() {
        return this::invoke;
    }
}