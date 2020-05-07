package com.daovantam.btvn_b1.bai9;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
//        Bài 9: Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không ?

        System.out.println("Nhập vào số nguyên dương: ");
        int x = new Scanner(System.in).nextInt();
        int flag = 0;
        for (int i = 1; i <= Math.sqrt(x) ; i++) {
            if (i*i==x){
                flag=1;
                System.out.println(flag);
                break;
            }
        }
    }
}
