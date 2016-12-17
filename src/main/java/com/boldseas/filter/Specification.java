package com.boldseas.filter;

/**
 * Created by jerry on 12/17/16.
 */
public interface Specification<T> {
    boolean test(T t);
    
    default Specification<T> and(Specification... specs){
        return p -> {
            for (Specification spec: specs) {
                if (!spec.test(p)){
                    return false;
                }
            }
            return true;
        };
    }
    default Specification<T> or(Specification... specs){
        return p -> {
            for (Specification spec: specs) {
                if (spec.test(p)){
                    return true;
                }
            }
            return false;
        };
    }

    default Specification<T> not(){
        return p -> test(p);
    }
}
