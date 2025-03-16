package HAM;

import java.util.Scanner;

public class daySoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        int n = scanner.nextInt();
        long[] c = daySoFibonacci(n);
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                System.out.println(c[i]);
            }
        }
    }

    public static long[] daySoFibonacci(int n){
        long[] arr = new long[n];
        long f1 = 0;
        long f2 = 1;
        long f = f1 + f2;
        int i=0;
        while (f < n) {
            f = f1 + f2;
            arr[i]=f;
            i++;
            f1 = f2;
            f2 = f;
        }   
        return arr;
    }
}
