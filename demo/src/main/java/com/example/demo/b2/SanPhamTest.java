package com.example.demo.b2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class SanPhamTest {
    private SanPhamSevirce sevirce= new SanPhamSevirce();
    @Test
    void themSanPhamm(){
        SanPham sp = new SanPham("SP001", "Product 1", 2023, 100.0f, 10, "Category 1");
        sevirce.them(sp);
        Assert.assertEquals(1,sevirce.getList().size());
    }
    @Test
    void testXoaSanPha() {
        SanPham sp = new SanPham("SP001", "Product 1", 2023, 100.0f, 10, "Category 1");
        sevirce.them(sp);
        sevirce.xoa("SP001");
        Assert.assertEquals(0, sevirce.getList().size());
    }
    @Test
    void testXoaSanPham() {
        sevirce.xoa("SP002");
        Assert.assertEquals(0, sevirce.getList().size());
    }


}
