package MANG;

import java.util.Scanner;

public class Kiem_Tra_Mang_Doi_Xung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap gia tri tai phan tu thu "+i+ " la :");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length/2; i++) {           
            if (arr[i] != arr[arr.length-1-i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.print("Doi xung");
        }else{
            System.out.print("Khong doi xung");
        }
    }
}
