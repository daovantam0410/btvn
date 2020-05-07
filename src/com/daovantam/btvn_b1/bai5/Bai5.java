package com.daovantam.btvn_b1.bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
//  Bài 5: Nhập vào 4 số nguyên a, b, c, d. In ra màn hình kết quả số lớn nhất, nhỏ nhất.

        int a,b,c,d;
        System.out.println("Nhập vào số nguyên a: ");
        a=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        b=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số nguyên c: ");
        c=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số nguyên d: ");
        d=new Scanner(System.in).nextInt();

//      === cách 1: so sánh từng cặp ===
//        int max,min,max1,max2,min1,min2;
//        if (a<b){
//            max1=b;
//        }else max1=a;
//
//        if (c<d){
//            max2=d;
//        }else max2=c;
//
//        if (max1<max2){
//            max=max2;
//        }else max=max1;
//        System.out.println("Số lớn nhất là: "+max);
//
//        if (a<b){
//            min1=a;
//        }else min1=b;
//
//        if (c<d){
//            min2=c;
//        }else min2=d;
//
//        if (min1<min2){
//            min=min1;
//        }else min=min2;
//        System.out.println("Số bé nhất là: "+min);

//      === cách 2: dùng thuật toán lính canh ===
//        int flagMax=a;
//        if (flagMax<b){
//            flagMax=b;
//        }if (flagMax<c){
//            flagMax=c;
//        }if (flagMax<d){
//            flagMax=d;
//        }
//        System.out.println("Số lớn nhất là: "+flagMax);
//
//        int flagMin=a;
//        if (flagMin>b){
//            flagMin=b;
//        }if (flagMin>c){
//            flagMin=c;
//        }if (flagMin>d){
//            flagMin=d;
//        }
//        System.out.println("Số bé nhất là: "+flagMin);

//      === cách 3: dùng toán tử 3 ngôi ===
        int max1=(a>b)?a:b;
        int max2=(c>d)?c:d;
        int max=(max1 > max2) ? max1 : max2;
        System.out.println("Số lớn nhất là: "+ max);

        int min1=(a<b)?a:b;
        int min2=(c<d)?c:d;
        int min=(min1 < min2) ? min1 : min2;
        System.out.println("Số bé nhất là: "+min);
    }

}
