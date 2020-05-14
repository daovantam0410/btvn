package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai10 {

    private static float bai10(int n, int x) {
        float tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * i;
        }
        return tich;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        System.out.println("Nhập vào x: ");
        int x = scanner.nextInt();
        float tich = bai10(n, x);
        System.out.println("Tích = " + tich);
    }
}
