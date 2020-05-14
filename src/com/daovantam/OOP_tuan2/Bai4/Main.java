package com.daovantam.OOP_tuan2.Bai4;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(19032893555668L, "DAO XUAN THANH", 500000);
        Account account1 = new Account();
        account1.setSoTaiKhoan(102002451399L);
        account1.setTenTaiKhoan("DAO VAN TAM");
        account1.setSoTienTrongTaiKhoan(1500000);
        account.xuat();
        account1.xuat();

        // Chuyển khoản
        if (account.chuyenKhoan(account, account1)) {
            System.out.println("Giao dịch thành công!");
        } else
            System.out.println("Giao dịch thất bại!, Số tiền chuyển không khả dụng");
        System.out.println("Số tiền account: " + account.getSoTienTrongTaiKhoan());
        System.out.println("Số tiền account1: " + account1.getSoTienTrongTaiKhoan());

        // Nạp tiền vào TK
//        account.napTienVaoTaiKhoan(account);

        // Rút tiền
//        account.rutTien(account);

        // Đáo hạn
//        account.daoHan(account);

    }
}
