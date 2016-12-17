package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public interface ProductSpec {
    boolean satisfy(Product p);

    static ProductSpec color(Color color){
        return p -> p.getColor() == color;
    }
    static ProductSpec ltWeight(int weight){
        return p -> p.getWeight() < weight;
    }
    static ProductSpec and(ProductSpec... specs){
        return p -> {
            for (ProductSpec spec: specs) {
                if (!spec.satisfy(p)){
                    return false;
                }
            }
            return true;
        };
    }
    static ProductSpec or(ProductSpec... specs){
        return p -> {
            for (ProductSpec spec: specs) {
                if (spec.satisfy(p)){
                    return true;
                }
            }
            return false;
        };
    }

    static ProductSpec not(ProductSpec spec){
        return p -> !spec.satisfy(p);
    }

    static ProductSpec always(boolean bool){
        return p -> bool;
    }

}
