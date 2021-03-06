package com.boldseas.filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by jerry on 12/17/16.
 */
public class Filter {
    public List<Product> findBySpec(List<Product> products, Predicate<Product> spec) {
        List<Product> results = products.stream().filter(spec::test).collect(Collectors.toList());
        return results;
    }
}
