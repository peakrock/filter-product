package com.boldseas.filter;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by jerry on 12/17/16.
 */
public class OrSpec implements ProductSpec{
    private final ProductSpec[] specs;

    public OrSpec(ProductSpec... specs) {
        this.specs = specs;
    }


    @Override
    public boolean satisfy(Product p) {
        for (ProductSpec spec :
                specs) {
            if(spec.satisfy(p)){
                return true;
            }

        }

        return false;
    }
}
