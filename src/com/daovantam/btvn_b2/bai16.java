package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai16 {

    private static float bai16(int n, int x) {
        int mau = 0;
        float tong = 0;
        int tu = 1;
        for (int i = 1; i <= n; i++) {
            mau += i;
            tu = tu * x;
            tong = tong + (float) tu / mau;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào x = ");
        int x = scanner.nextInt();
        System.out.println("Nhập vào n = ");
        int n = scanner.nextInt();
        float tong = bai16(n, x);
        System.out.println("Tổng  = " + tong);
    }
}
