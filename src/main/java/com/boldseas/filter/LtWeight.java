package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class LtWeight implements ProductSpec {
    private final int weight;

    public LtWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean satisfy(Product p) {
        return p.getWeight()< weight;
    }
}
