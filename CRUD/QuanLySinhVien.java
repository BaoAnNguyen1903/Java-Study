package CRUD;

import java.util.Scanner;

public class QuanLySinhVien {
    static Scanner scanner = new Scanner(System.in);
    static String[] nameStudent = { "Vinh", "Tuan", "An" };

    public static void main(String[] args) {
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.View");
            System.out.println("5.Edit");
            System.out.println("6.Exit");
            System.out.println("========================");
            System.out.print("Nhap lua chon cua ban: ");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1:
                    Add();
                    break;
                case 2:
                    Search();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    View();
                    break;
                case 5:
                    Edit();
                    break;
                case 6:
                    System.out.println("thankiu!!!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void Add() {
        System.out.print("input name to add: ");
        String[] name = new String[nameStudent.length + 1];
        for (int i = 0; i < nameStudent.length; i++) {
            name[i] = nameStudent[i];
        }
        name[name.length - 1] = scanner.nextLine();
        nameStudent = name.clone();
        System.out.println("ADD SUCCESSFULLY");
    }

    public static void Search() {
        System.out.print("input name to search: ");
        String name = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i].equals(name)) {
                System.out.println(name + " tai vi tri thu " + i);
            }
        }
    }

    public static void Delete() {
        System.out.print("intput name to delete: ");
        String name = scanner.nextLine();
        String[] delete = new String[nameStudent.length - 1];
        int check = 0;
        for (int i = 0; i < nameStudent.length; i++) {
            if (!nameStudent[i].equals(name)) {
                delete[check] = nameStudent[i];
                check++;
            }
        }
        nameStudent = delete.clone();
        System.out.println("DELETE SUCCESFULLY");
    }

    public static void View() {
        for (String string : nameStudent) {
            System.out.println(string);
        }
    }

    public static void Edit() {
        System.out.print("input name to edit: ");
        String name = scanner.nextLine();
        System.out.print("name you wanna to change: ");
        String name2 = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i].equals(name)) {
                nameStudent[i] = name2;    
            }
        }
        System.out.println("EDIT SUCCESFULLY");
    }
}
