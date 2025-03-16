package HAM;

import java.util.Scanner;

public class binhPhuongCacSo {
    static int[] arr ;
    static int[] arr2;
    public static void main(String[] args) {
        NhapMang();
       
        int[] c = binhPhuongCacSo();
        System.out.println("--------------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(c[i]);
        }      
    }
    public static void NhapMang(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("gia tri tai vi tri "+i+ " la: ");
            arr[i] = scanner.nextInt();
        }
    }
    public static int[] binhPhuongCacSo(){
        arr2 = new int[arr.length];
        int binhPhuong = 2;
        for (int i = 0; i < arr.length; i++) {
            
            arr2[i] = (int) Math.pow(arr[i], binhPhuong);
        }
        return arr2;
    }
}
