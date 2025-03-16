package FOR;

import java.util.Scanner;

public class TongSoHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        double sohang = scanner.nextInt();
        double sum = 0;

        for (double i = 1; i <= sohang; i++) {
            sum = sum + 1/i;
        }
        System.out.println(sum);
    }
}
