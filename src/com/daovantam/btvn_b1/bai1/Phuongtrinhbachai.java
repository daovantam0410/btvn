package com.daovantam.btvn_b1.bai1;

import java.util.Scanner;

public class Phuongtrinhbachai {
    public static void main(String[] args) {

//        Bài tập 1: Giải phương trình bậc 2
//        ax^2+bx+c = 0
//        trong đó a,b,c là hằng số x là nghiệm phương trình

        System.out.println("Nhập vào hệ số bậc hai a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hệ số bậc nhất b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào hằng số c = ");
        int c = new Scanner(System.in).nextInt();
        if (a==0){
            if (b==0){
                System.out.println("Phương trình này vô nghiệm!");
            }else{
                System.out.println("Phương trình này có một nghiệm: "+ "x = "+ (-c/b));
            }
            return;
        }
        float delta = (float) (b*b-4*a*c);
        float x1,x2;
        if (delta>0){
            System.out.println("Phương trình này có hai nghiệm phân biệt: "+"x1 = "+(float)((-b+Math.sqrt(delta))/(2*a))+" và x2 = "+(float)((-b-Math.sqrt(delta))/(2*a)));
        }else if (delta<0){
            System.out.println("Phương trình này vô nghiệm!");
        }else {
            System.out.println("Phương trình này có nghiệm kép x1 = x2 = "+(-b/(2*a)));
        }
    }
}
