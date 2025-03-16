package MANG;

import java.util.Scanner;

public class Tim_Cac_Phan_Tu_Trung_Lap_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gia tri tai vi tri "+i+" la: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]) {
                    System.out.println("Phan tu bi trung lap la "+numbers[j]);
                }
            }
        }   
    }
}
