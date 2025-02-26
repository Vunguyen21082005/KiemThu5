package com.example.demo.b2;

import java.util.ArrayList;
import java.util.List;

public class SanPhamSevirce {
    List<SanPham> list= new ArrayList<>();
    public void them(SanPham sanPham){
        list.add(sanPham);
    }

    public List<SanPham> getList() {
        return list;
    }
    public void xoa(String ma){
        list.removeIf(sp -> sp.getMa().equals(ma));
    }
}
