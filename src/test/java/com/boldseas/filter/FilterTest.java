package com.boldseas.filter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.boldseas.filter.Color.BLUE;
import static com.boldseas.filter.Color.GREEN;
import static com.boldseas.filter.Color.RED;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by jerry on 12/17/16.
 */
public class FilterTest {

    @Test
    public void given4ProductsWhenFindRedThenReturn2Products(){
        //given
        Product product1 = new Product(RED,10);
        Product product2 = new Product(GREEN,4);
        Product product3 = new Product(RED,5);
        Product product4 = new Product(BLUE,12);

        List<Product> products = Arrays.asList(product1,product2,product3,product4);

        Filter filter = new Filter();

        //when

        List<Product> results = filter.findRed(products);
        //then
        assertThat(results.size(),is(2));



    }

}