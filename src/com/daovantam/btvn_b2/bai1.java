package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai1 {
    private static int bai1(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào giá trị n: ");
        int n = scanner.nextInt();
        int tong = bai1(n);
        System.out.println("Tổng = " + tong);
    }
}
