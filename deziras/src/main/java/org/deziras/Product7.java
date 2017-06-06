package org.deziras;

/**
 * Product7 is a Cartesian product of 7 components.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product7<T1, T2, T3, T4, T5, T6, T7>
        extends Product {

    /**
     * A projection of element 1 of this Product.
     *
     * @return A projection of element 1.
     */
    T1 _1();

    /**
     * A projection of element 2 of this Product.
     *
     * @return A projection of element 2.
     */
    T2 _2();

    /**
     * A projection of element 3 of this Product.
     *
     * @return A projection of element 3.
     */
    T3 _3();

    /**
     * A projection of element 4 of this Product.
     *
     * @return A projection of element 4.
     */
    T4 _4();

    /**
     * A projection of element 5 of this Product.
     *
     * @return A projection of element 5.
     */
    T5 _5();

    /**
     * A projection of element 6 of this Product.
     *
     * @return A projection of element 6.
     */
    T6 _6();

    /**
     * A projection of element 7 of this Product.
     *
     * @return A projection of element 7.
     */
    T7 _7();

    @Override
    default int productArity() {
        return 7;
    }
}