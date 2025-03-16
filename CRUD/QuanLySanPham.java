package CRUD;

import java.util.Scanner;

public class QuanLySanPham {
    static Scanner scanner = new Scanner(System.in);
    static String[] item  = {"tivi", "but", "ao", "mu"};
    public static void main(String[] args) {
        while (true) {
            System.out.println("=====Menu=====");
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.View");
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
        System.out.print("input new item: ");
        String[] newItem = new String[item.length+1];
        for (int i = 0; i < item.length; i++) {
            newItem[i] = item[i];   
        }
        newItem[newItem.length-1] = scanner.nextLine();
        item = newItem.clone();
        System.out.println("====================");
        System.out.println("INPUT SUCCESSFULLY");
    }
    public static void Search(){
        System.out.print("input item to search: ");
        String n = scanner.nextLine();
        System.out.println("=================");
        for (int i = 0; i < item.length; i++) {
            if (item[i].equals(n)) {
                System.out.println(n+" tai vi tri thu " + (i+1));
            }
        }
    }
    public static void Delete(){
        System.out.println("1.Delete theo ten");
        System.out.println("2.Delete theo vi tri");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                DeleteTheoTen();
                break;
            case 2:
                DeleteTheoViTri();
                break;
        }
    }
    public static void DeleteTheoTen(){
        System.out.print("input name to delete: ");
        String n = scanner.nextLine();
        String[] itemDelete = new String[item.length-1];
        System.out.println("====================");
        int check = 0;
        for (int i = 0; i < item.length; i++) {
            if (!item[i].equals(n)) {
                itemDelete[check] = item[i];
                check++;
            }
        }
        item = itemDelete.clone();
        System.out.println("DELETE SUCCESSFULLY");
    }
    public static void DeleteTheoViTri(){
        System.out.print("input address to delete: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] newItem = new String[item.length-1];
        System.out.println("====================");
        int check = 0;
        for (int i = 0; i < item.length; i++) {
            if (n != i) {
                newItem[check] = item[i];
                check++;
            }
        }
        item = newItem.clone();
        System.out.println("DELETE SUCCESSFULLY");
    }
    public static void View() {
        System.out.println("====================");
        for (String string : item) {
            System.out.println(string);
        }
    }
    public static void Edit(){
        System.out.print("input address to edit: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("input new item you want to change: ");
        String newItem = scanner.nextLine();
        System.out.println("====================");
        for (int i = 0; i < item.length; i++) {
            if (n == i) {
                item[i] = newItem;
            }
        }
        System.out.println("CHANGE SUCCESSFULLY");
    }
}

