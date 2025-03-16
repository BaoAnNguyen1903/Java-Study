package HAM;

import java.util.Scanner;

public class tongCacSoTrongDanhSach {
    // static int[] arr = {1, 2 , 3, 4, 5, 6};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Gia tri tai vi tri thu "+i+" la: ");
            arr[i] = scanner.nextInt();
        }
        int c = tongCacSoTrongDanhSach(arr);
        System.out.println(c);
    }

    public static int tongCacSoTrongDanhSach(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
