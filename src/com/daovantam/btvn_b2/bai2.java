package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai2 {
    private static int bai2(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i * i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị n: ");
        int n = scanner.nextInt();
        int tong = bai2(n);
        System.out.println("Tổng = " + tong);
    }
}
