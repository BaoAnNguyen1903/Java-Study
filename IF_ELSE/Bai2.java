package IF_ELSE;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot ky tu: ");
        char kytu = scanner.next().charAt(0);
        
        if(Character.isUpperCase(kytu)) {
            System.out.println("Ky tu " + kytu + " la chu in hoa");
        }else if(Character.isLowerCase(kytu)) {
            System.out.println("Ky tu " + kytu + " la chu in thuong");
        }else if(Character.isDigit(kytu)) {
            System.out.println("Ky tu " + kytu + " la so");
        }else{
            System.out.println("Ky tu " + kytu + " la ky tu dac biet");
        }
    }
}
