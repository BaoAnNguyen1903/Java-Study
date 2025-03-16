package FOR;

import java.util.Scanner;

public class Tong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong: ");
        int songuyen = scanner.nextInt();
        int soluongchuso = 0;
        int tong = 0;

        while (songuyen != 0) {
            int S = songuyen%10;
            tong = tong + S;
            songuyen = songuyen/10;
            soluongchuso++;
        }
        System.out.println("So luong chu so: " + soluongchuso);
        System.out.println("Tong la: " + tong);
    }
}
