package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class ColorAndWeightSpec implements ProductSpec {
    private final Color color1;
    private final Color color2;
    private final int weight;

    public ColorAndWeightSpec(Color color1, Color color2, int weight) {
        this.color1 = color1;
        this.color2 = color2;
        this.weight = weight;
    }


    @Override
    public boolean satisfy(Product p) {
        return (p.getColor() == color1 || p.getColor()==color2) && p.getWeight()< weight;
    }
}
