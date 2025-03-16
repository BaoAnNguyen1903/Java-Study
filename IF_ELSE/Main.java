package IF_ELSE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dob;
        int year = 2024;

        // Vòng lặp yêu cầu nhập đúng
        do {
            System.out.print("Nhập vào năm sinh: ");
            dob = scanner.nextInt();
            if (dob <= 0 || dob > year) {
                System.out.println("Năm sinh không hợp lệ. Vui lòng nhập lại!");
            }
        } while (dob <= 0 || dob > year);

        int tuoi = year - dob;
        System.out.println("Số tuổi là: " + tuoi);

        // Kiểm tra tuổi trưởng thành
        if (tuoi >= 18) {
            System.out.println("Tuổi vị thành niên");
        } else {
            System.out.println("Chưa đủ tuổi");
        }

        scanner.close();
    }
}
