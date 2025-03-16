package MANG;

import java.util.Scanner;

public class Tim_Gia_Tri_Nho_Nhat_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nhap gia tri tai phan tu thu "+i+ " la :");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("So nho nhat  la: " +min);
    }
}
