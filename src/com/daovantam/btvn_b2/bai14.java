package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai14 {
    private static int bai14(int n, int x) {
        int tong = 0;
        int luythua = 1;
        for (int i = 1; i <= 2 * n + 1; i += 2) {
            luythua = luythua * x * x;
            tong = tong + luythua;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        System.out.println("Nhập vào x: ");
        int x = scanner.nextInt();
        int tong = bai14(n, x);
        System.out.println("Tổng = " + tong);
    }
}
