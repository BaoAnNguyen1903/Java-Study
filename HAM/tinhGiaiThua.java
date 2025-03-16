package HAM;

import java.util.Scanner;

public class tinhGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();
        int c = tinhGiaiThua(n);
        System.out.println("Giai thua cua "+n+" la " + c);
    }

    public static int tinhGiaiThua(int n){
        int giaiThua = 0;
        for (int i = 1; i < n; i++) {
            giaiThua = n * (n - 1);
        }
        return giaiThua;
    }
}
