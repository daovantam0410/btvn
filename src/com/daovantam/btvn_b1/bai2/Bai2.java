package com.daovantam.btvn_b1.bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

//        Bài tập 2:Viết chương trình nhập vào 1 số có 2 chữ số in ra cách đọc của số này
//        VD: 12 => Muoi Hai

        System.out.println("Nhập vào số có hai chữ số: ");
        int n = new Scanner(System.in).nextInt();
        int hdv=n%10;
        n=n/10;
        int hc=n%10;
        n=n/10;
        switch (hc){
            case 1:
                System.out.println("Mười");
                break;
            case 2:
                System.out.println("Hai mươi");
                break;
            case 3:
                System.out.println("Ba mươi");
                break;
            case 4:
                System.out.println("Bốn mươi");
                break;
            case 5:
                System.out.println("Năm mươi");
                break;
            case 6:
                System.out.println("Sáu mươi");
                break;
            case 7:
                System.out.println("Bảy mươi");
                break;
            case 8:
                System.out.println("Tám mươi");
                break;
            case 9:
                System.out.println("Chín mươi");
                break;
        }
        switch (hdv){
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba ");
                break;
            case 4:
                System.out.println("bốn ");
                break;
            case 5:
                System.out.println("năm ");
                break;
            case 6:
                System.out.println("sáu ");
                break;
            case 7:
                System.out.println("bảy ");
                break;
            case 8:
                System.out.println("tám ");
                break;
            case 9:
                System.out.println("chín ");
                break;
        }
    }
}
