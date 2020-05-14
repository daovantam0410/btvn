package com.daovantam.OOP_tuan2.Bai7;

public class QuanLySinhVien {
    private SinhVien[] sinhViens;
    private int count;

    public QuanLySinhVien() {
        sinhViens = new SinhVien[10];
        count = 0;
    }

    public boolean themSinhVien() {
        if (count > 10) {
            return false;
        }
        sinhViens[count] = new SinhVien();
        sinhViens[count].nhapThongTin();
        count++;
        return true;
    }

    public void xuatThongTin() {
        for (int i = 0; i < count; i++) {
            System.out.println(sinhViens[i]);
        }
    }

    public void sapXepTangDanTheoMaSinhVien() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (sinhViens[i].getMaSinhVien() < sinhViens[j].getMaSinhVien()) {
                    SinhVien sinhVien = sinhViens[i];
                    sinhViens[i] = sinhViens[j];
                    sinhViens[j] = sinhVien;
                }
            }
        }
    }
}
