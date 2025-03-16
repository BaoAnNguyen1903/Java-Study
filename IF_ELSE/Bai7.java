package IF_ELSE;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int thang = scanner.nextInt();
        int nam = scanner.nextInt();

        if (thang <= 0 && thang > 12) {
            System.out.println("Ban da nhap sai");
            System.out.println("Nhap lai: ");
        }

        if (thang == 2) {
            System.out.println("Xin vui lap nhap nam: ");
        }

        if (nam <= 0) {
            System.out.println("Ban da nhap sai: ");
            System.out.print("Nhap lai: ");
        }

        if (thang == 2 && ((nam % 4 == 0 && !(nam % 100 == 0)) || nam % 400 == 0)) {
            System.out.println("Nam " + nam + " la nam nhuan");
            System.out.println("thang 2 co 29 ngay");
        }

        if (thang == 2 && ((!(nam % 4 == 0) && nam % 100 == 0) || !(nam % 400 == 0))) {
            System.out.println("Nam " + nam + " khong phai la nam nhuan");
            System.out.println("thang 2 co 29 ngay");
        }

        switch (thang) {
            case 1:
                System.out.println("thang 1 co 31 ngay");
                break;
            case 3:
                System.out.println("thang 3 co 31 ngay");
                break;
            case 4:
                System.out.println("thang 4 co 30 ngay");
                break;
            case 5:
                System.out.println("thang 5 co 31 ngay");
                break;
            case 6:
                System.out.println("thang 6 co 30 ngay");
                break;
            case 7:
                System.out.println("thang 7 co 31 ngay");
                break;
            case 8:
                System.out.println("thang 8 co 31 ngay");
                break;
            case 9:
                System.out.println("thang 9 co 30 ngay");
                break;
            case 10:
                System.out.println("thang 10 co 31 ngay");
                break;
            case 11:
                System.out.println("thang 11 co 30 ngay");
                break;
            case 12:
                System.out.println("thang 12 co 30 ngay");
                break;
        }
    }
}
