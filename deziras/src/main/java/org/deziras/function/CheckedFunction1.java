package org.deziras.function;

/**
 * Represents a function with 1 argument.
 *
 * @param <T> argument 1 of the function
 * @param <R> return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface CheckedFunction1<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     *
     * @return the function result
     */
    R invoke(T t) throws Throwable;
}
