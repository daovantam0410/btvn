package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai7 {

    private static float bai7(int n){
        float tong = 0;
        for (int i = 0; i <=n ; i++) {
            tong += (float) i/(i+1);
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử n: ");
        int n = scanner.nextInt();
        float tong = bai7(n);
        System.out.println("Tổng = "+tong);

    }
}
