package com.example.demo.b1;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TinhTest {
    private Tinh tinh= new Tinh();
    @Test
   void testSum1(){
        Assert.assertEquals(9,tinh.calculateSum(5));
    }
    @Test
    void testSum2(){
        Assert.assertEquals(16,tinh.calculateSum(7));
    }
    @Test
    void testSum3(){
        Assert.assertEquals(25,tinh.calculateSum(9));
    }
}
