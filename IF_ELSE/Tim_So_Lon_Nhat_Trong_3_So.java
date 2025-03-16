package IF_ELSE;

import java.util.Scanner;

public class Tim_So_Lon_Nhat_Trong_3_So {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 3 so nguyen: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        if (n > m && n > q) {
            System.out.println(n+ " la so lon nhat");
        }else if (m > n && m > q) {
            System.out.println(m+ " la so lon nhat");
        }else if (q > n && q > m) {
            System.out.println(q+ " la so lon nhat");
        }
    }
}
