package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class KiemTraTenHScoTonTai {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> nameStudent = new ArrayList<>();
        nameStudent.add("AN");
        nameStudent.add("VINH");
        nameStudent.add("TUAN");
        KiemTraTenHScoTonTai(nameStudent);
        
    }
    public static void KiemTraTenHScoTonTai(ArrayList<String> nameStudent){
        System.out.print("Nhap vao ten HS: ");
        String name = scanner.nextLine();
        boolean flag = false;
        
        for (int i = 0; i < nameStudent.size(); i++) {
            if (nameStudent.get(i).equalsIgnoreCase(name)) {
                flag = true;
                break;
            }
        }
        
        if (flag) {
            System.out.println("Ten hoc sinh " + name + " co ton tai trong danh sach");
        } else {
            System.out.println("Ten hoc sinh " + name + " khong ton tai trong danh sach");
        }
    }
}
