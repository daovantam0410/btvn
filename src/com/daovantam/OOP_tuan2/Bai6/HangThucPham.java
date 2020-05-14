package com.daovantam.OOP_tuan2.Bai6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham {
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham(int maHang) {
        this.maHang = maHang;
    }

    public HangThucPham() {
        this.maHang = 01;
    }

    public HangThucPham(int maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    // Kiểm tra hàng thực phẩm hết hạn chưa ?
    public boolean checkDate() {
        if (this.getNgaySanXuat().after(this.getNgayHetHan())) {
            System.out.println("Sản phẩm này đã hết hạn!");
            return false;
        }
        System.out.println("Sản phẩm này vẫn còn hạn sử dụng!");
        return true;
    }

    public void nhapThongTin() {
        System.out.println("Nhập vào mã hàng: ");
        this.maHang = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tên hàng: ");
        this.tenHang = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào ngày sản xuất: ");
        String ngaySX = new Scanner(System.in).nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaySanXuat = dateFormat.parse(ngaySX);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập vào ngày hết hạn: ");
        String ngayHH = new Scanner(System.in).nextLine();
        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayHetHan = dateFormat1.parse(ngayHH);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void xuatThongTin() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Ngày sản xuất: " + ngaySanXuat);
        System.out.println("Ngày hết hạn: " + ngayHetHan);

    }
}
