package com.daovantam.OOP_tuan2.Bai2;

public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(01, "Đào Văn Tâm", 9.0f, 9.5f);
        SinhVien sinhVien2 = new SinhVien(02, "Cam Việt Hưng", 8.0f, 10.0f);
        SinhVien sinhVien3 = new SinhVien();
        sinhVien3.setMaSinhVien(03);
        sinhVien3.setHoTen("Đinh Thái Bình");
        sinhVien3.setDiemLyThuyet(9.0f);
        sinhVien3.setDiemThucHanh(8.5f);
        System.out.println(sinhVien1);
        System.out.println("Điểm trung bình: " + sinhVien1.tinhDiemTrungBinh());
        System.out.println("******************************************************************************");
        System.out.println(sinhVien2);
        System.out.println("Điểm trung bình: " + sinhVien2.tinhDiemTrungBinh());
        System.out.println("******************************************************************************");
        System.out.println(sinhVien3);
        System.out.println("Điểm trung bình: " + sinhVien3.tinhDiemTrungBinh());
    }
}
