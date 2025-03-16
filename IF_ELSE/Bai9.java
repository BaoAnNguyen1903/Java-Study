package IF_ELSE;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao phep tinh: ");
        char kytu = scanner.next().charAt(0);
        double S = 0;

        switch (kytu) {
            case '+':
                S = a + b;
                System.out.print("Dap an la: " + S);
                break;
            case '-':
                S = a - b;
                System.out.print("Dap an la: " + S);
                break;
            case '*':
                S = a * b;
                System.out.print("Dap an la: " + S);
                break;
            case '/':
                S = a / b;
                System.out.print("Dap an la: " + S);
                break;
        }
    }
}
