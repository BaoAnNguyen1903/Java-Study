package FOR;

import java.util.Scanner;

public class So_Hoan_Hao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.print(number+" la so hoan hao");
        }else{
            System.out.print(number+" khong phai la so hoan hao");
        }
    }
}
