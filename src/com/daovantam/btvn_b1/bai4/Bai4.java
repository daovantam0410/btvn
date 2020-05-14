package com.daovantam.btvn_b1.bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Bài tập 4: Một điểm KARAOKE tính tiền khách hàng theo công thức sau:
//
//        • Mỗi giờ trong 3 giờ đầu tiên tính 30 000 đồng/giờ,
//
//        • Mỗi giờ tiếp theo có đơn giá giảm 30% so với đơn giá trong 3 giờ đầu tiên.
//
//        • Ngoài ra nếu thời gian thuê phòng từ 8 – 17 giờ thì được giảm giá 10%.
//
//        Viết chương trình nhập vào giờ bắt đầu, giờ kết thúc và in ra số tiền khách hàng phải trả biết
//
//        rằng 8 ≤ giờ bắt đầu < giờ kết thúc ≤ 24.

        int starttime, endtime, soGioHat;
        do {
            System.out.println("Nhập vào giờ bắt đầu: ");
            starttime = new Scanner(System.in).nextInt();
            System.out.println("Nhập vào giờ kết thúc: ");
            endtime = new Scanner(System.in).nextInt();
            if (starttime < 8 || endtime > 24) {
                System.out.println("Giờ bắt đầu từ 8h và kết thúc đến 24h, Mời bạn nhập lại đúng giờ!");
            }
        } while (starttime < 8 || endtime > 24);

        soGioHat = endtime - starttime;
        System.out.println("Số giờ bạn đã hát là: " + soGioHat + "h");
        float tongTien;
        if (soGioHat >= 1 && soGioHat <= 3) {
            tongTien = (float) soGioHat * 30000;
            System.out.println("Số tiền bạn phải trả là: " + tongTien + " nghìn đồng");
        } else if (soGioHat > 3 && soGioHat < 9) {
            tongTien = (float) (soGioHat * 30000 * 0.7);
            System.out.println("Số tiền bạn phải trả là: " + tongTien + " nghìn đồng");
        } else if (starttime >= 8 && endtime <= 17 && soGioHat == 9) {
            tongTien = (float) ((soGioHat * 30000 * 0.7) * 0.9);
            System.out.println("Số tiền bạn phải trả là: " + tongTien + " nghìn đồng");
        }
    }
}
