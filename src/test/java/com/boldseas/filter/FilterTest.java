package com.boldseas.filter;

import org.junit.Before;
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


    private List<Product> products;
    private Filter filter;

    @Before
    public void given(){

        //given
        Product product1 = new Product(RED,10);
        Product product2 = new Product(GREEN,4);
        Product product3 = new Product(RED,5);
        Product product4 = new Product(BLUE,12);

        products = Arrays.asList(product1,product2,product3,product4);

        filter = new Filter();
    }
    @Test
    public void given4ProductsWhenFindRedThenReturn2Products(){

        //when

        List<Product> results = filter.findBySpec(products,new ColorSpec(RED));
        //then
        assertThat(results.size(),is(2));



    }

    @Test
    public void given4ProductsWhenFindGreenThenReturn1Products(){
        //when

        List<Product> results = filter.findBySpec(products,new ColorSpec(GREEN));
        //then
        assertThat(results.size(),is(1));



    }


    @Test
    public void whenFindLtWeight10ThenReturn2Products(){
        //when

        List<Product> results = filter.findBySpec(products,new LtWeight(10));
        //then
        assertThat(results.size(),is(2));
    }

    @Test
    public void whenFindRedOrGreenAndLtWeight10ThenReturn2Products(){
        //when

        List<Product> results = filter.findBySpec(products,new AndSpec(
                new OrSpec(new ColorSpec(RED),new ColorSpec(GREEN)),
                        new LtWeight(10)));
        //then
        assertThat(results.size(),is(2));
    }

    @Test
    public void whenFindNotRedThenReturn2Products(){
        List<Product> results = filter.findBySpec(products,new NotSpec(new ColorSpec(RED)));
        //then
        assertThat(results.size(),is(2));
    }

}