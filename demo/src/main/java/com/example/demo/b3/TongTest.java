package com.example.demo.b3;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TongTest {
    public int tongSoNguyen(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    @Test
    void tong1(){
        int [] arr={1,2,4,6};
        Assert.assertEquals(13,tongSoNguyen(arr));
    }
    @Test
    void tong(){
        int [] arr={};
        Assert.assertEquals(0,tongSoNguyen(arr));
    }
    @Test
    void tong2(){
        int [] arr={-1,-2,-4,-6};
        Assert.assertEquals(-13,tongSoNguyen(arr));
    }
    @Test
    void tong3(){
        int [] arr={-1,2,-4,6};
        Assert.assertEquals(3,tongSoNguyen(arr));
    }

}
