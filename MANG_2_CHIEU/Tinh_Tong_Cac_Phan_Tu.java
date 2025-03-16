package MANG_2_CHIEU;

import java.util.Scanner;

public class Tinh_Tong_Cac_Phan_Tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int n = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int m = scanner.nextInt();
        int[][]matrix = new int[n][m];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Gia tri tai vi tri "+ i + " "+ j + " la: ");
                matrix[i][j] = scanner.nextInt();
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
