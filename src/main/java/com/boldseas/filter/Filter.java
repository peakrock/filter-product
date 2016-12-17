package com.boldseas.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 12/17/16.
 */
public class Filter {
    public List<Product> findBySpec(List<Product> products, ProductSpec spec) {
        List<Product> results = new ArrayList<>();
        for (Product p: products) {
            if (spec.satisfy(p)){
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
