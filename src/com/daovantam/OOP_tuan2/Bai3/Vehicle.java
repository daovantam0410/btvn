package com.daovantam.OOP_tuan2.Bai3;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public float tinhThueTruocBa() {
        if (dungTich < 100) {
            return (float) (triGia * 0.01);
        } else if (dungTich >= 100 || dungTich <= 200) {
            return (float) (triGia * 0.03);
        } else
            return (float) (triGia * 0.05);
    }

    public void nhapThongTinXe() {

    }

    public void xuatThongTinXe() {
        System.out.println("Tên chủ xe: " + tenChuXe);
        System.out.println("Loại xe: " + loaiXe);
        System.out.println("Dung tích: " + dungTich);
        System.out.println("Trị giá: " + triGia);
        System.out.println("Thuế phải nộp: " + tinhThueTruocBa());
    }

}
