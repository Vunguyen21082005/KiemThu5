package com.example.demo.b4;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<Sinhvien>list= new ArrayList<>();
    public void add(Sinhvien sv){
        list.add(sv);
    }

    public List<Sinhvien> getList() {
        return list;
    }
    public boolean update(Sinhvien emp, String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa() == ma) {
                list.set(i, emp);
                return true;
            }
        }
        return false;
    }
    public  void delete(String ma){
        list.removeIf(sv->sv.getMa().equals(ma));
    }

}
