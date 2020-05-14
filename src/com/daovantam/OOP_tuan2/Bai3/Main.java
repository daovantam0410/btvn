package com.daovantam.OOP_tuan2.Bai3;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();
        vehicle1.setTenChuXe("Đào Văn Tâm");
        vehicle1.setLoaiXe("Future neo");
        vehicle1.setDungTich(125);
        vehicle1.setTriGia(35000000);
        vehicle2.setTenChuXe("Đào Xuân Thanh");
        vehicle2.setLoaiXe("Wave RSX");
        vehicle2.setDungTich(110);
        vehicle2.setTriGia(20000000);
        vehicle3.setTenChuXe("Đào Xuân Sơn");
        vehicle3.setLoaiXe("Cup");
        vehicle3.setDungTich(50);
        vehicle3.setTriGia(15000000);
        vehicle1.xuatThongTinXe();
        vehicle2.xuatThongTinXe();
        vehicle3.xuatThongTinXe();
    }
}
