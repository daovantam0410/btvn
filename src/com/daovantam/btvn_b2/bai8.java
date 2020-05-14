package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai8 {

    private static float bai8(int n) {
        float tong = 0;
        for (int i = 0; i <= n; i++) {
            tong += (float) (2 * i + 1) / (2 * i + 2);
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        float tong = bai8(n);
        System.out.println("Tổng = " + tong);
    }
}
