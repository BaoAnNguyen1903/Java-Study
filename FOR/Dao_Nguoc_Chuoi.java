package FOR;

import java.util.Scanner;

public class Dao_Nguoc_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String chuoi = scanner.nextLine();//Tuan
        
        for (int i = chuoi.length()-1; i>=0; i--) {
            char kyTu = chuoi.charAt(i);
            System.out.print(kyTu);
        }
    }
}
