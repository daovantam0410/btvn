package com.daovantam.btvn_b2;

import java.util.Scanner;

public class bai6 {

    /*
    *S(n) = 1/(1*2) + 1/(2*3) +...+ 1/(n*(n+1)) 
    */
    
    private static float bai6(int n){
        float tong = 0;
        for (int i = 1; i <=n ; i++) {
            tong +=(float) 1.0/i*(i+1);
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử n: ");
        int n = scanner.nextInt();
        float tong = bai6(n);
        System.out.println("Tổng = "+tong);
    }
}
