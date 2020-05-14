package com.daovantam.OOP_tuan2.Bai4;

import java.util.Scanner;

public class Account {
    public final float LAI_SUAT = 0.035f;
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTaiKhoan;

    public Account() {
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = 50;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public boolean napTienVaoTaiKhoan(Account account) {
        double soTienNapVao;
        do {
            System.out.println("Nhập số tiền nạp vào tài khoản: ");
            soTienNapVao = new Scanner(System.in).nextDouble();
            if (soTienNapVao < 0) {
                System.out.println("Số tiền nạp vào phải lớn hơn 0!");
            }
        } while (soTienNapVao < 0);
        account.setSoTienTrongTaiKhoan(account.getSoTienTrongTaiKhoan() + soTienNapVao);
        System.out.println("Giao dịch thành công!");
        System.out.println("Số tiền hiện tại của bạn là: " + account.getSoTienTrongTaiKhoan());
        return true;
    }

    public boolean rutTien(Account account) {
        double soTienRut;
        do {
            System.out.println("Nhập vào số tiền muốn rút: ");
            soTienRut = new Scanner(System.in).nextDouble();
            if (soTienRut + 1100 > account.getSoTienTrongTaiKhoan()) {
                System.out.println("Số tiền rút không hợp lệ! Yêu cầu nhập lại");
            }
        } while (soTienRut + 1100 > soTienTrongTaiKhoan);
        account.setSoTienTrongTaiKhoan(account.getSoTienTrongTaiKhoan() - (soTienRut + 1100));
        System.out.println("Giao dịch thành công!");
        System.out.println("Số tiền hiện tại của bạn là: " + account.getSoTienTrongTaiKhoan());
        return true;
    }


    public boolean daoHan(Account account) {
        account.setSoTienTrongTaiKhoan(account.getSoTienTrongTaiKhoan() + (account.getSoTienTrongTaiKhoan() * LAI_SUAT));
        System.out.println("Giao dịch thành công!");
        System.out.println("Số tiền hiện tại của bạn là: " + account.getSoTienTrongTaiKhoan());
        return true;
    }

    public boolean chuyenKhoan(Account account, Account account1) {
        double soTienMuonChuyen;
        System.out.println("Nhập vào số tiền muốn chuyển: ");
        soTienMuonChuyen = new Scanner(System.in).nextDouble();
        if (account.getSoTienTrongTaiKhoan() >= soTienMuonChuyen) {
            account.setSoTienTrongTaiKhoan(account.getSoTienTrongTaiKhoan() - soTienMuonChuyen);
            account1.setSoTienTrongTaiKhoan(account1.getSoTienTrongTaiKhoan() + soTienMuonChuyen);
            return true;
        } else {
            return false;
        }
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }


    public void xuat() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Tên tài khoản: " + tenTaiKhoan);
        System.out.println("Số tiền trong tài khoản: " + soTienTrongTaiKhoan);
    }
}
