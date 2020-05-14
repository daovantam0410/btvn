package com.daovantam.OOP_tuan2.Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;


    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        if (chieuDai<0){
            chieuDai=1;
        }
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        if (chieuRong<0){
            chieuRong=1;
        }
        this.chieuRong = chieuRong;
    }

    public int tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public int tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public void nhap() {
        do {
            System.out.println("Nhập vào chiều dài: ");
            chieuDai = new Scanner(System.in).nextInt();
            System.out.println("Nhập vào chiều rộng: ");
            chieuRong = new Scanner(System.in).nextInt();
            if (chieuDai < chieuRong) {
                System.out.println("Chiều dài phải lớn hơn chiều rộng!");
            }
        } while (chieuDai < chieuRong);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
