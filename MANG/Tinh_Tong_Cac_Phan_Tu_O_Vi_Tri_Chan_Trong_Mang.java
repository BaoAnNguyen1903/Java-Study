package MANG;

import java.util.Scanner;

public class Tinh_Tong_Cac_Phan_Tu_O_Vi_Tri_Chan_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gia tri tai vi tri "+i+" la: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
