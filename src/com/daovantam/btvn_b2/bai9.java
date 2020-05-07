package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai9 {

    private static float bai9(int n){
        float tich = 1;
        for (int i = 1; i <=n ; i++) {
            tich = tich*i;
        }
        return tich;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử n: ");
        int n = scanner.nextInt();
        float tich = bai9(n);
        System.out.println("Tích = "+tich);
    }
}
