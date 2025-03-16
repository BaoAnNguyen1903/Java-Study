package MANG;

import java.util.Scanner;

public class Tong_Cac_Phan_Tu_Trong_Mang {
    public static void main(String[] args) {
        // int[] numbers = {1,2,3,2,1,1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("nhap gia tri tai phan tu thu "+i+ " la: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Mang sau khi in la");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] +" ");
            sum = sum + numbers[i];
        }
        System.out.println();
        System.out.println("Tong cac phan tu trong mang la " +sum);
    }
}
