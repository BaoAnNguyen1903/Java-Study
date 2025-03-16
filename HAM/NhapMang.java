package HAM;

import java.util.Scanner;

public class NhapMang {
    static int[] arr;
    static int[] arr2;
    public static void main(String[] args) {
        nhapMang();
        System.out.println("danh sach so chan");
        danhSachSoChan(arr);
    }
    public static void nhapMang(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        arr = new int[n];
        arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Gia tri tai vi tri thu "+i+" la: ");
            arr[i] = scanner.nextInt();
        }
    }
    public static void danhSachSoChan(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[i] = arr[i];
            }
        }
        for (int i : arr2) {
            if (i != 0) {
                System.out.println(i);
            }    
        }
    }
}
