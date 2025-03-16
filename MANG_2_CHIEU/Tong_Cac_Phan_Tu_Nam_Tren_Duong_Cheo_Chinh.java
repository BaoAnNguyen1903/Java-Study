package MANG_2_CHIEU;

import java.util.Scanner;

public class Tong_Cac_Phan_Tu_Nam_Tren_Duong_Cheo_Chinh {
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
                System.out.print("Gia tri tai vi tri "+ i + " "+ j + " la: ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh la: " +sum);
    }
}
