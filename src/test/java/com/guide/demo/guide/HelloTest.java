package com.guide.demo.guide;

import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void should_be_sum_return_2() {
        Hello hello = new Hello();
        int actaultResult = hello.sum(1,1);
        assertEquals(2, actaultResult);
    }

    @Test
    public void should_be_return_4() {
        Hello hello = new Hello();
        int actaultResult = hello.sum(2,2);
        assertEquals(4, actaultResult);
    }
}
