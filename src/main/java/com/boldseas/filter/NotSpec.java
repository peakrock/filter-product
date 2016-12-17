package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class NotSpec implements ProductSpec {
    private final ProductSpec spec;

    public NotSpec(ProductSpec spec) {
        this.spec = spec;
    }


    @Override
    public boolean satisfy(Product p) {
        return !spec.satisfy(p);
    }
}
