package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class AndSpec implements ProductSpec {
    private final ProductSpec[] specs;

    public AndSpec(ProductSpec... specs) {
        this.specs = specs;
    }


    @Override
    public boolean satisfy(Product p) {
        for (ProductSpec spec :
                specs) {
            if(!spec.satisfy(p)){
                return false;
            }

        }

        return true;
    }
}
