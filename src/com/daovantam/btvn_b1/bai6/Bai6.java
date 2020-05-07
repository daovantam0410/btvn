package com.daovantam.btvn_b1.bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        //  Bài 6: Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.

        int thang, nam;
        do {
            System.out.println("Nhập vào tháng: ");
            thang = new Scanner(System.in).nextInt();
            if (thang < 1 || thang > 12){
                System.out.println("Tháng không hợp lệ, Mời bạn nhập lại!");
            }
        }while (thang < 1 || thang > 12);
        do {
            System.out.println("Nhập vào năm: ");
            nam = new Scanner(System.in).nextInt();
            if (nam <= 0) {
                System.out.println("Năm không hợp lệ, Mời bạn nhập lại!");
            }
        } while (nam <= 0);
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("Tháng có 31 ngày");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("Tháng có 30 ngày");
                break;
            }
            case 2:
                if (nam % 4 == 0) {
                    System.out.println("Năm này là năm nhuận,tháng có 29 ngày");
                } else {
                    System.out.println("Tháng có 28 ngày");
                }
                break;
        }
    }
}
