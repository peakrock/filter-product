package com.boldseas.filter;

import java.util.function.Predicate;

/**
 * Created by jerry on 12/17/16.
 */
public interface ProductSpec extends Predicate<Product> {

    static Predicate<Product> color(Color color){
        return p -> p.getColor() == color;
    }
    static Predicate<Product> ltWeight(int weight){
        return p -> p.getWeight() < weight;
    }


    static Predicate<Product> always(boolean bool){
        return p -> bool;
    }

}
