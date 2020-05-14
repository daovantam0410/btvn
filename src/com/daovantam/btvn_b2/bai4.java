package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai4 {

    private static float bai4(int n) {
        float tong = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            tong += 1.0 / i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị n: ");
        int n = scanner.nextInt();
        float tong = bai4(n);
        System.out.println("Tổng = " + tong);
    }
}
