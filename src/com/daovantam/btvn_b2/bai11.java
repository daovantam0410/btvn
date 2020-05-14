package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai11 {
    private static int bai11(int n) {
        int tong = 0;
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * i;
            tong = tong + tich;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        int tong = bai11(n);
        System.out.println("Tổng = " + tong);
    }
}
