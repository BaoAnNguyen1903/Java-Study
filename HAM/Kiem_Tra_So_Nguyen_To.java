package HAM;

import java.util.Scanner;


public class Kiem_Tra_So_Nguyen_To {
    static boolean flag = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        int n = scanner.nextInt();

        boolean c = Kiem_Tra_So_Nguyen_To(n);
        if (c == true) {
            System.out.println(n+ " la so nguyen to");
        }else{
            System.out.println(n+ " khong phai so nguyen to");
        }
    }

    public static boolean Kiem_Tra_So_Nguyen_To (int n){
        if (n == 0) {
            flag = false;
            return flag;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
