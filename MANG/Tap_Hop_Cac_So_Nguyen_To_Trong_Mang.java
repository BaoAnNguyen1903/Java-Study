package MANG;

import java.util.Scanner;

public class Tap_Hop_Cac_So_Nguyen_To_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] numbers2 = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gia tri tai phan tu thu " + i + ":");
            numbers[i] = scanner.nextInt();
        }   
        
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j ==0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                numbers2[i] = numbers[i];
            }
            if (numbers[i]==2) {
                numbers2[i] = numbers[i];
            }
        }

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] != 0) {
                System.out.println("So nguyen to la : "+numbers2[i]);
            }
        }
    }
}