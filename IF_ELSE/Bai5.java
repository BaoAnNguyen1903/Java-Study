package IF_ELSE;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem mon toan: ");
        double toan = scanner.nextDouble();
        System.out.print("Nhap diem mon ly: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhap diem mon hoa: ");
        double hoa = scanner.nextDouble();
        double dtb = (toan + ly + hoa) / 3;
        System.out.println("diem trung binh la: " + dtb);

        if (dtb >= 9.0 && dtb <= 10.0) {
            System.out.println("Hoc sinh xuat sac");
        } else  {
            if (dtb >= 8.0 && dtb <= 8.9) {
                System.out.println("Hoc sinh gioi");
            } else {
                if (dtb >= 7.0 && dtb <= 7.9) {
                    System.out.println("Hoc sinh kha");
                } else {
                    if (dtb >= 6.0 && dtb <= 6.9) {
                        System.out.println("Hoc sinh trung binh");
                    } else {
                        if (dtb >= 5.0 && dtb <= 5.9) {
                            System.out.println("Hoc sinh yeu");
                        } else {
                            if (dtb < 5.0) {
                                System.out.println("Hoc sinh kem");
                            }
                        }
                    }
                }
            }
        }
    }
}
