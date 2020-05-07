package com.daovantam.btvn_b1.bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
//        Bài 8: Dạng của hệ phương trình bậc nhất 2 ẩn như sau:
//
//        ax + by = c
//
//        dx + ey = f
//
//        Trong đó:
//
//        + a, b, c, d, e, f là các hệ số do người dung nhập vào
//
//        + x & y là nghiệm cần tính
//
//        - Yêu cầu: Giải hệ phương trình trên.

        System.out.println("Nhập vào hệ phương trình: ");
        System.out.println("Nhâp vào hệ số a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hệ số b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hệ số c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hệ số d: ");
        int d = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hệ số e: ");
        int e = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hệ số f: ");
        int f = new Scanner(System.in).nextInt();

//        Tính định thức

        float D = (float) a*e-d*b;
        float Dx = (float) c*e-f*b;
        float Dy = (float) a*f-d*c;

        float x =Dx/D;
        float y = Dy/D;

        if (D==0){
            if(Dx==0 && Dy==0){
                System.out.println("Hệ phương trình có vô số nghiệm!");
            }else {
                System.out.println("Hệ phương trình này vô nghiệm!");
            }
        }else {
            System.out.println("Hệ phương trình này có nghiệm duy nhất là x =  "+x+" và y = "+y);
        }
    }
}
