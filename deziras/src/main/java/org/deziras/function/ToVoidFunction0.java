package org.deziras.function;

import org.deziras.Unit;

/**
 * Represents a function with no argument and returns no result.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToVoidFunction0
        extends CheckedToVoidFunction0 {

    /**
     * Performs this function.
     */
    void invoke();

    default Function0<Unit> boxed() {
        return () -> {
            invoke();
            return Unit.instance();
        };
    }
}
