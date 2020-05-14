package com.daovantam.btvn_b1.bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Bài tập 3: Viết chương trình tính lương của nhân viên dựa theo thâm niên công tác (TNCT) như sau:
//        Lương = hệ số * lương căn bản, trong đó lương căn bản là 650000 đồng.
//
//        • Nếu TNCT < 12 tháng: hệ số = 1.92
//
//        • Nếu 12 <= TNCT < 36 tháng: hệ số = 2.34
//
//        • Nếu 36 <= TNCT < 60 tháng: hệ số = 3
//
//        • Nếu TNCT >= 60 tháng: hệ số = 4.5

        System.out.println("Nhập vào thâm niên công tác: ");
        int n = new Scanner(System.in).nextInt();
        float salary;
        if (n < 12) {
            salary = (float) (1.92 * 650000);
            System.out.println("Lương = " + salary);
        } else if (n >= 12 && n < 36) {
            salary = (float) (2.34 * 650000);
            System.out.println("Lương = " + salary);
        } else if (n >= 36 && n < 60) {
            salary = (float) 3 * 650000;
            System.out.println("Lương = " + salary);
        } else {
            salary = (float) (4.5 * 650000);
            System.out.println("Lương = " + salary);
        }
    }
}
