package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai15 {

    private static float bai15(int n) {
        float tong = 0;
        int mau = 0;
        for (int i = 1; i <= n; i++) {
            mau = mau + i;
            tong = tong + (float) 1.0 / mau;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        float tong = bai15(n);
        System.out.println("Tổng = " + tong);
    }
}
