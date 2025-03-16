package MANG;

import java.util.Scanner;

public class Tinh_Trung_Binh_Cong_Cua_Cac_Phan_Tu_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        int thuong = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gia tri tai vi tri "+i+" la: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        thuong = sum/n;

        System.out.println(thuong);
    }
}
