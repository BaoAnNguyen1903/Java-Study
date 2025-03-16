package CRUD;

import java.util.Scanner;

public class QuanLyHocSinh_Split {
    static String[] nameStudent = {"Vinh-1", "Tuan-2", "An-3", "Vu-1", "Phuong-2"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=============MENU=============");
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.View");
            System.out.println("5.Edit");
            System.out.println("6.Exit");
            System.out.println("==============================");
            System.out.print("Moi nhap lua chon cua ban: ");
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
                    System.out.println("thankiu!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void Add() {
        String[] name = new String[nameStudent.length + 1];
        System.out.print("input name to add: ");
        for (int i = 0; i < nameStudent.length; i++) {
            name[i] =nameStudent[i];
        }
        name[name.length - 1] = scanner.nextLine();
        nameStudent = name.clone();
        System.out.println("ADD SUCCESSFULLY");
    }

    public static void Search() {
        System.out.println("1.Search theo ten");
        System.out.println("2.Search theo lop");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                SearchTheoTen();
                break;
            case 2:
                SearchTheoLop();
                break;
        }
    }

    public static void SearchTheoTen() {
        System.out.print("input name to search: ");
        String name = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            String[] nameSplit = nameStudent[i].split("-");
            if (nameSplit[0].equals(name)) {
                System.out.println(name+ " hoc lop " + nameSplit[1]);
            }
        }
    }

    public static void SearchTheoLop() {
        System.out.print("input class to search: ");
        String lop = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < nameStudent.length; i++) {
            String[] nameSplit = nameStudent[i].split("-");
            if (nameSplit[1].equals(lop)) {
                sum++;
                System.out.println(nameSplit[0]);
            }
        }
        System.out.println("lop "+ lop + " co "+sum+" hoc sinh" );

    }

    public static void Delete() {
        System.out.print("input name to delete: ");
        String n = scanner.nextLine();
        String[] name = new String[nameStudent.length - 1];
        int check = 0;
        for (int i = 0; i < nameStudent.length; i++) {
            String[] nameSplit = nameStudent[i].split("-");
            if (!(nameSplit[0].equals(n))) {
                name[check] = nameStudent[i];
                check++;
            }
        }
        nameStudent = name.clone();
        System.out.println("DELETE SUCCESSFULLY");
    }

    public static void View() {
        for (int i = 0; i < nameStudent.length; i++) {
            String[] nameStudentSplit = nameStudent[i].split("-");
            System.out.println("Name: "+nameStudentSplit[0]);
            System.out.println("Lop: "+nameStudentSplit[1]);
        }
    }

    public static void Edit() {
        System.out.println("1.Edit name");
        System.out.println("2.Edit class");
        System.out.print("Vui long nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                EditName();
                break;
            case 2:
                EditClass();
                break;
        }
    }
    public static void EditName(){
        System.out.print("input name: ");
        String input = scanner.nextLine();
        System.out.print("input name you wanna change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            String[] nameSplit = nameStudent[i].split("-");
            if (nameSplit[0].equals(input)) {
                //nameSplit[0] = output;
                String name = output + "-" + nameSplit[1];
                nameStudent[i] = name;
            }
        }
    }
    public static void EditClass(){
        System.out.print("input name: ");
        String input = scanner.nextLine();
        System.out.print("input class you wanna change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            String[] nameSplit = nameStudent[i].split("-");
            if (nameSplit[0].equals(input)) {
                String name = nameSplit[0] + "-" + output;
                nameStudent[i]=name;
            }
        }
    }
}
