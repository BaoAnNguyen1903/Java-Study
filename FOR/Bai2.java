package FOR;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int n = scanner.nextInt();
        int S = 1;
        int gtri = n;
        
        if(n<=0) {
            System.out.println("Nhap sai");
            System.out.print("Vui long nhap lai: ");
        }

        while (n>0) {
            S = S * n--;
        }
        System.out.print("Giai thua cua " + gtri + " la " + S);
    }
}
