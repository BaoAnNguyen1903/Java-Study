package MANG;

import java.util.Scanner;

public class Tim_So_Lan_Xuat_Hien_Cua_Cac_Phan_Tu_Trong_Mang {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] countCheck = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gia tri tai vi tri "+i+" la: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]) {
                    count++;
                }
            }
            countCheck[i] = count;
        }

        //int[] arr = {2, 3, 2, 2, 2, 3, 1, 1, 1, 4};
        //int[] cou = {4, 2, 3, 2, 1, 1, 3, 2, 1, 1}

        for (int i = 0; i < countCheck.length; i++) {
            if (countCheck[i] == 1) {
                for (int j = 0; j < countCheck.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.println("Gia tri " + numbers[i] + " xuat hien " + countCheck[j] + " lan");
                        break;
                    }
                }
            }
        }
    }
}
