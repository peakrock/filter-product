package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class AlwaysSpec implements ProductSpec {
    private final boolean bool;

    public AlwaysSpec(boolean bool) {
        this.bool = bool;
    }

    @Override
    public boolean satisfy(Product p) {
        return bool;
    }
}
