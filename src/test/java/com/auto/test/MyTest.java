package com.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void testSmthng(){
        Figure fig = new Figure(5);
        Assert.assertEquals(fig.getSize(), 5.0);
    }
}
