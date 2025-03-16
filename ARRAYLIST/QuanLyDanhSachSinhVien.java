package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDanhSachSinhVien {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> student = new ArrayList<>();    
    public static void main(String[] args) {
        student.add("An-SinhVienXuatSac");
        student.add("Tuan-SinhVienGioi");
        student.add("Vinh-SinhVienXuatSac");
        student.add("Heu-SinhVienKha");
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("==========MENU==========");
            System.out.print("Nhap lua chon cua ban: ");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1:
                    Add();
                    break;
                case 2:
                    View();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    System.out.println("thankiuu!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static void Add(){
        System.out.print("input new student you want to add (student-xeploai) : ");
        String output = scanner.nextLine();
        student.add(output);
        System.out.println("ADD SUCCESSFULLY!");
    }
    public static void View(){
        for (String string : student) {
            System.out.println(string);
        }
    }
    public static void Update(){
        System.out.println("1.Update student");
        System.out.println("2.Update xep loai");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                UpdateStudent();
                break;
            case 2:
                UpdateXepLoai();
                break;
        }
    }
    public static void UpdateStudent(){
        System.out.print("input student you want to update: ");
        String input = scanner.nextLine();
        System.out.print("input new student you want to change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < student.size(); i++) {
            String[] studentSplit = student.get(i).split("-");
            if (studentSplit[0].equalsIgnoreCase(input)) {
                studentSplit[0] = output;
                String newItem = studentSplit[0] + "-" + studentSplit[1];
                student.set(i, newItem);
                break;
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void UpdateXepLoai(){
        System.out.print("input item you want to update: ");
        String input = scanner.nextLine();
        System.out.print("input new xep loai you want to change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < student.size(); i++) {
            String[] studentSplit = student.get(i).split("-");
            if (studentSplit[0].equalsIgnoreCase(input)) {
                studentSplit[1] = output;
                String newItem = studentSplit[0] + "-" + studentSplit[1];
                student.set(i, newItem);
                break;
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void Delete(){
        System.out.print("input name student you want to delete: ");
        String nameStudent = scanner.nextLine();
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).contains(nameStudent)) {
                student.remove(i);
            }
        }
        System.out.println("DELETE SUCCESFULLY!");
    }
}
