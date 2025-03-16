package FOR;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so: ");
        int n = scanner.nextInt();
        int S = 0;

        for (int i = 1; i <= n; i++) {
            S = S + i;
        }
        System.out.print("So can tim la: " + S);
    }
    
}
