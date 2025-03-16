package MANG;

import java.util.Scanner;

public class Dao_Nguoc_Cac_Phan_Tu_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap gia tri tai phan tu thu "+i+ " la :");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Dao nguoc");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[arr1.length-1-i];
        }

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
