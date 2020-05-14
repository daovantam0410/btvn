package com.daovantam.OOP_tuan2.Bai1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhap();
        hinhChuNhat.toString();
        System.out.println("Chu vi: " + hinhChuNhat.tinhChuVi());
        System.out.println("Diện tích: " + hinhChuNhat.tinhDienTich());

    }

}
