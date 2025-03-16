package MANG;

import java.util.Scanner;

// bubble sort
public class Sap_Xep_Mang_Theo_Thu_Tu_Tang_Dan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Gia tri cua mang tai vi tri thu " + i + " la ");
            numbers[i] = scanner.nextInt();
        }

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

        for (int i : numbers) {
            System.out.println("bubble sort: " + i);
        }
    }
}
