package ARRAYLIST;

import java.util.ArrayList;

public class InRaSoLuongHocSinh {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("An");
        studentList.add("Vinh");
        studentList.add("Tuan");
        for (String string : studentList) {
            System.out.println(string);
        }
    }
}
