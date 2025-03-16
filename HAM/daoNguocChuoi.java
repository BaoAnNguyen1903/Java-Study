package HAM;

import java.util.Scanner;

public class daoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao: ");
        String chuoi = scanner.nextLine();
        String c = daoNguocChuoi(chuoi);
        System.out.println("Dao nguoc chuoi: "+ c);
    }
    public static String daoNguocChuoi(String chuoi){
        String kyTu ="";
        for (int i = chuoi.length()-1; i>=0; i--) {
            kyTu = kyTu + chuoi.charAt(i);
        }
        return kyTu;
    }
}
