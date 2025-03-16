package MANG_2_CHIEU;

import java.util.Scanner;

public class Tim_So_Luong_Phan_Tu_Am {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int n = scanner.nextInt();
        System.out.print("Nhap so cot: ");
        int m = scanner.nextInt();
        int[][]matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Gia tri tai vi tri "+ i + " "+ j + " la: ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("===========================================");

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print(i + " " + j + " la: " + matrix[i][j]);
                    System.out.println(" La gia tri am");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("===========================================");
        System.out.println("Co " + count + " gia tri am");
    }
}
