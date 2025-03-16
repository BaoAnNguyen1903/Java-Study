package FOR;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int number = scanner.nextInt();
        int n = number;
        int count = 0;
        int sum = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        number = n;
        while (number !=0) {
            int so = number % 10;
            sum = sum + (int) Math.pow(so, count);
            number = number / 10;
        }

        if (sum == n) {
            System.out.print(n + " la so amtrong");
        }else{
            System.out.print(n + " khong phai so amstrong");
        }
    } 
}
