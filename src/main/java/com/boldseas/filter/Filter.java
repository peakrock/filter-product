package com.boldseas.filter;

import java.util.ArrayList;
import java.util.List;

import static com.boldseas.filter.Color.RED;

/**
 * Created by jerry on 12/17/16.
 */
public class Filter {
    public List<Product> findRed(List<Product> products) {
        List<Product> results = new ArrayList<>();
        for (Product p: products) {
            if (p.getColor()== RED){
                results.add(p);
            }

        }
        return results;
    }
}
