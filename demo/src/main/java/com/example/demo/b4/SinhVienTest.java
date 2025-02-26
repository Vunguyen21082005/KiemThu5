package com.example.demo.b4;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SinhVienTest {
    SinhVienService sinhVienService= new SinhVienService();
    List<Sinhvien> list=new ArrayList<>();
    @Test
    void them(){
        Sinhvien sv= new Sinhvien("SV01","Vu",19,7,5,"PTPM");
        sinhVienService.add(sv);
        Assert.assertEquals(sv,sinhVienService.getList().get(0));
    }
    @Test
    void sua(){
        Sinhvien sv= new Sinhvien("SV01","Vu",19,7,5,"PTPM");
        sinhVienService.add(sv);
        Sinhvien sv1= new Sinhvien("SV01","Bin",19,7,5,"PTPM");
        sinhVienService.update(sv1,"SV01");
        Assert.assertEquals("Bin",sinhVienService.getList().get(0).getTen());
    }
    @Test
    void xoa(){
        Sinhvien sv= new Sinhvien("SV01","Vu",19,7,5,"PTPM");
        sinhVienService.add(sv);
        sinhVienService.delete("SV01");
        Assert.assertEquals(0,sinhVienService.getList().size());
    }
    
}
