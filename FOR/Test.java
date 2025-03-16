package FOR;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so bat ky nguyen duong: ");
        int n = scanner.nextInt();
        int S = 1;

        for (int i = 1; i <= n; i++) {
           S=S*i; 
        }
        System.out.println("Tich cac so tu 1 den n la: " + S);
    }
}
