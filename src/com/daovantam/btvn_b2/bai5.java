package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai5 {

    private static float bai5(int n){
        float tong = 0;
        for (int i = 1; i <=2*n+1 ; i+=2) {
            tong += 1.0/i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị n: ");
        int n = scanner.nextInt();
        float tong = bai5(n);
        System.out.println("Tổng = "+tong);
    }
}
