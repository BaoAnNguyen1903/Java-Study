package MANG;

import java.util.Scanner;

public class Tim_Phan_Tu_Lon_Thu_K_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gia tri tai vi tri "+i+" la: ");
            numbers[i] = scanner.nextInt();
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhap K: ");
        int K = scanner2.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = 0;
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Gia tri lon thu K la: " +numbers[numbers.length-K]);
    }
}