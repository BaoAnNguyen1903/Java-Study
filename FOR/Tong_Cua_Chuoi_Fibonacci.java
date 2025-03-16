package FOR;

import java.util.Scanner;

public class Tong_Cua_Chuoi_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        long n = scanner.nextLong();
        long f1 = 0;
        long f2 = 1;
        long f = f1 + f2;
        int count = 0;
        long sum = 1;

        while (count < n) {    
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            sum = sum + f;
            count++;
        }
        System.out.println(sum);
    }
}
