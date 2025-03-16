package HAM;

import java.util.Scanner;

public class Dem_Tu_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao: ");
        String chuoi = scanner.nextLine();
        int c = Dem_Tu_Trong_Chuoi(chuoi);
        System.out.println("Co "+ c+ " chu");
    }
    public static int Dem_Tu_Trong_Chuoi(String chuoi){
        int count = 1;
        if (chuoi.charAt(0)==' '){
            count--;
        }
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == ' ') {
                count++;
            } 
        }
        if (chuoi.charAt(chuoi.length()-1) == ' '){
            count--;
        }
        return count;
    }
}
