package com.daovantam.OOP_tuan2.Bai7;

import java.util.Scanner;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String hoTen, String diaChi, String soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public void nhapThongTin(){
        System.out.println("Nhập vào mã sinh viên: ");
        this.maSinhVien=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào họ tên: ");
        this.hoTen=new Scanner(System.in).nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        this.diaChi=new Scanner(System.in).nextLine();
        System.out.println("Nhập vào số điện thoại: ");
        this.soDienThoai=new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }
}
