package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class SapXepTenHocSinh {
    public static void main(String[] args) {
        ArrayList<String> nameStudent = new ArrayList<>();
        nameStudent.add("AN");
        nameStudent.add("VINH");
        nameStudent.add("TUAN");

        SapXepTenHocSinh(nameStudent);
        for (String string : nameStudent) {
            System.out.println(string);
        }
    }
    public static void SapXepTenHocSinh(ArrayList<String> nameStudent){
        Collections.sort(nameStudent);
    }
}
