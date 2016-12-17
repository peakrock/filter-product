package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class ColorSpec implements ProductSpec {
    private final Color color;

    public ColorSpec(Color color) {
        this.color = color;
    }

    @Override
    public boolean satisfy(Product p) {
        return p.getColor() == color;
    }
}
