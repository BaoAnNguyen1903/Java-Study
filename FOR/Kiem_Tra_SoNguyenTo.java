package FOR;

import java.util.Scanner;

public class Kiem_Tra_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        boolean flag = true;
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.print(number+" la so nguyen to");
        }else{
            System.out.print(number+" khong phai so nguyen to");
        }
    }
}
