package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public class Product {
    private final int weight;
    private final Color color;

    public Product(Color color, int weight) {

        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }
}
