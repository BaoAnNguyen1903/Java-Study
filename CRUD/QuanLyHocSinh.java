package CRUD;

import java.util.Scanner;

public class QuanLyHocSinh {
    static Scanner scanner = new Scanner(System.in);
    static String[] nameStudent = {"Vinh", "Tuan", "An"};
    public static void main(String[] args) {
        while (true) {
            System.out.println("=====Menu=====");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Delete");
            System.out.println("4.Sreach");
            System.out.println("5.Edit");
            System.out.println("6.Exit");
            System.out.println("=================");
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
                    Delete();
                    break;
                case 4:
                    Sreach();
                    break;
                case 5:
                    Edit();
                    break;
                case 6:
                    System.out.println("thankiu!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static void Add() {
        System.out.print("input name: ");
        String[] name = new String[nameStudent.length+1];
        for (int i = 0; i < nameStudent.length; i++) {
            name[i] = nameStudent[i];   
        }
        nameStudent = name.clone();
        System.out.println("INPUT SUCCESSFULLY");
    }
    public static void View() {
        for (String string : nameStudent) {
            System.out.println(string);
        }
    }
    public static void Delete() {
        System.out.print("Input name to delete: ");
        String n = scanner.nextLine();
        String[] name = new String[nameStudent.length-1];
        int check = 0;
        for (int i = 0; i < nameStudent.length; i++) {
            if (!nameStudent[i].equals(n)) {
                name[check] = nameStudent[i];
                check++;
            }
            // }else {
            //     System.out.println("No have name in list");
            //     System.out.println("Reinput: " );
            //     Delete();
            // }
        }
        nameStudent = name.clone();
        System.out.println("DELETE SUCCESSFULLY");
    }
    public static void Sreach() {
        System.out.print("Input name to sreach: ");
        String n = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i].equals(n)) {
                System.out.println(n+" tai vi tri thu " + (i+1));
            }
        }
    }
    public static void Edit(){
        System.out.print("Input name you want to edit: ");
        String n = scanner.nextLine();
        System.out.print("Name you wanna change: ");
        String n2 = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i].equals(n)) {
                nameStudent[i] = n2;
            }
        }
        System.out.println("CHANGE SUCCESSFULLY");
    }
}
