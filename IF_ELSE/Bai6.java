package IF_ELSE;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot nam: ");
        int nam = scanner.nextInt();

        if(nam % 400 == 0) {
            System.out.println("Nam " + nam + " la nam nhuan");
        }else{
            System.out.println("Nam " + nam + " khong phai la nam nhuan");
        }
    }
}
