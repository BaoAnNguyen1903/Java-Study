package MANG;

import java.util.Scanner;

public class Tim_Tong_So_Lon_Nhat_Co_Trong_Mang {
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
                int temp = 0;
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        int sum = 0;
        sum = numbers[numbers.length-1] + numbers[numbers.length-2];
        System.out.println(sum);
    }
}
