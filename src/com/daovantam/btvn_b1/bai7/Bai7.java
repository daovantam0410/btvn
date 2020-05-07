package com.daovantam.btvn_b1.bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {

//  Nhập vào độ dài 3 cạnh của 1 tam giác.
//  Kiểm tra xem 3 cạnh đó có tạo thành 1 tam giác hay không ?
//  Và nếu có thì sẽ tạo thành tam giác gì (thường/cân/vuông/vuông cân/đều)

        System.out.println("Nhập vào cạnh thứ nhất a = ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhập vào cạnh thứ hai b = ");
        float b = new Scanner(System.in).nextFloat();
        System.out.println("Nhập vào cạnh thứ ba c = ");
        float c = new Scanner(System.in).nextFloat();

        if (a+b<c || a+c<b || b+c<a){
            System.out.println("Đây không phải là tam giác!");
        }else{
            if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
                if (a==b && a!=c || b==a && b!=c || c==a && c!=b){
                    System.out.println("Đây là tam giác vuông cân!");
                }else
                    System.out.println("Đây là tam giác vuông!");
            }else if (a==b && a!=c || b==a && b!=c || c==a && c!=b ){
                System.out.println("Đây là tam giác cân");
            }else if (a==b && a==c && b==c){
                System.out.println("Đây là tam giác đều!");
            }else
                System.out.println("Đây là tam giác thường!");
        }
    }
}
