package FOR;

import java.util.Scanner;

public class demsonguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong: ");
        int songuyen = scanner.nextInt();
        int soluongchuso = 0;

        while (songuyen != 0) {
            songuyen = songuyen/10;
            soluongchuso++;
        }
        System.out.println("So luong chu so: " + soluongchuso);
    }
}
