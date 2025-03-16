package FOR;

import java.util.Scanner;

public class DaoNguocSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int number = scanner.nextInt();
        int count = 0;
        System.out.print("So dao nguoc la: ");

        while (number > 0) {
            int reverse = number % 10;
            System.out.print(reverse);
            number = number / 10;
        }
    }
}
