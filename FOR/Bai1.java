package FOR;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int n = scanner.nextInt();

        if(n<=1) {
            System.out.print(n + " khong phai so nguyen to");
        }else{
            if(n==2){
                System.out.print(n + " khong phai so nguyen to");
            }
        }


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(n + " khong phai la so nguyen to");
                break;
            }else{
                System.out.print(n + " la so nguyen to");
                break;
            }
        }
    }
}

