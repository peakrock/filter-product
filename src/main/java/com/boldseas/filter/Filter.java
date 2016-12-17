package com.boldseas.filter;

import java.util.ArrayList;
import java.util.List;

import static com.boldseas.filter.Color.GREEN;
import static com.boldseas.filter.Color.RED;

/**
 * Created by jerry on 12/17/16.
 */
public class Filter {
    public List<Product> findByColor(List<Product> products, Color color) {
        List<Product> results = new ArrayList<>();
        for (Product p: products) {
            if (p.getColor()== color){
                results.add(p);
            }

        }
        return results;
    }

    public List<Product> findLtWeight(List<Product> products, int weight) {
        List<Product> results = new ArrayList<>();
        for (Product p: products) {
            if (p.getWeight() <  weight){
                results.add(p);
            }

        }
        return results;

    }
}
