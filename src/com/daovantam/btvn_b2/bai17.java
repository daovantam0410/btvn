package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai17 {

    private static int tinhGiaiThua(int n){
        if (n<=1)
            return 1;
        else
            return n*tinhGiaiThua(n-1);
    }

    private static float bai17(int n, int x){
        int tu = 1;
        int mau = 1;
        float tong = 0;
        for (int i = 1; i <= n ; i++) {
            tu = tu*x;
            tinhGiaiThua(n);
            tong = tong + (float) tu/tinhGiaiThua(n);
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào x = ");
        int x = scanner.nextInt();
        System.out.println("Nhập vào n = ");
        int n = scanner.nextInt();
        float tong = bai17(n,x);
        System.out.println("Tổng = "+tong);
    }
}
