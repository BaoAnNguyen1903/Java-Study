package IF_ELSE;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so gio lam viec: ");
        double time = scanner.nextDouble();
        double tienLuong = time * 15;

        if(time <= 0){
            System.out.print("Nhap lai: ");
        }else{
            if(time < 40){
                System.out.print("Tien luong la: " + tienLuong);
            }else{
                if(time > 40){
                    double lamThem = ((time - 40) * 30) + (40 * 15);
                    System.out.print("Tien luong la: " + lamThem);
                }
            }
        }
    }
}
