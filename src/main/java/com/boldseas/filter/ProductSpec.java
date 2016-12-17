package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public interface ProductSpec extends Specification<Product> {

    static Specification<Product> color(Color color){
        return p -> p.getColor() == color;
    }
    static Specification<Product> ltWeight(int weight){
        return p -> p.getWeight() < weight;
    }


    static Specification<Product> always(boolean bool){
        return p -> bool;
    }

}
