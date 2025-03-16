package CRUD;

import java.util.Scanner;

import javax.lang.model.type.IntersectionType;

public class QuanLySanPham_Split {
    static Scanner scanner = new Scanner(System.in);
    static String[] item = { "tivi-congnghe-100",
            "laptop-congnghe-200",
            "tainghe-congnghe-50",
            "noi-bep-20",
            "chen-bep-2",
            "tulanh-bep-80" };
    public static void main(String[] args) {
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.Edit");
            System.out.println("5.Controll");
            System.out.println("6.View");
            System.out.println("7.Exit");
            System.out.println("========================");
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
                    Edit();
                    break;
                case 5:
                    Controll();
                    break;
                case 6:
                    View();
                    break;
                case 7:
                    System.out.println("thankiuu");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void Add() {
        String[] newItem = new String[item.length + 1];
        System.out.print("input name to add (item-loai-gia): ");
        for (int i = 0; i < item.length; i++) {
            newItem[i] = item[i];
        }
        newItem[newItem.length - 1] = scanner.nextLine();
        item = newItem.clone();
        System.out.println("ADD SUCCESSFULLY");
    }

    public static void Search() {
        System.out.println("1.SearchItem");
        System.out.println("2.SearchLoai");
        System.out.println("3.SearchGia");
        System.out.println("========================");
        System.out.print("Moi nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                SearchItem();
                break;
            case 2:
                SearchLoai();
                break;
            case 3:
                SearchGia();
                break;
        }
    }

    public static void SearchItem() {
        System.out.print("input name to search: ");
        String n = scanner.nextLine();
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (itemSplit[0].equals(n)) {
                System.out.println("item: " + itemSplit[0]);
                System.out.println("loai: " + itemSplit[1]);
                System.out.println("gia: " + itemSplit[2] + "$");
            }
        }
    }

    public static void SearchLoai() {
        System.out.print("input loai to search: ");
        String n = scanner.nextLine();
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (itemSplit[1].equalsIgnoreCase(n)) {
                System.out.println(itemSplit[0] + " " + itemSplit[2] + "$");
            }
        }
    }

    public static void SearchGia() {
        System.out.println("1.item >= hon gia tien");
        System.out.println("1.item <= hon gia tien");
        System.out.print("Moi nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                GiaLon();
                break;
            case 2:
                GiaBe();
                break;
        }
    }

    public static void GiaLon() {
        System.out.print("input gia to search: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (n <= Integer.parseInt(itemSplit[2])) {
                System.out.println(itemSplit[0] + " " + itemSplit[1] + " " + itemSplit[2]);
            }
        }
    }

    public static void GiaBe() {
        System.out.print("input gia to search: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (n >= Integer.parseInt(itemSplit[2])) {
                System.out.println(itemSplit[0] + " " + itemSplit[1] + " " + itemSplit[2]);
            }
        }
    }

    public static void Delete() {
        System.out.print("input name to delete: ");
        String n = scanner.nextLine();
        String[] newItem = new String[item.length - 1];
        int check = 0;
        for (int i = 0; i < item.length; i++) {
            String[] nameSplit = item[i].split("-");
            if (!(nameSplit[0].equals(n))) {
                newItem[check] = item[i];
                check++;
            }
        }
        item = newItem.clone();
        System.out.println("DELETE SUCCESSFULLY");
    }

    public static void Edit() {
        System.out.println("1.Edit item");
        System.out.println("2.Edit loai");
        System.out.println("3.Edit gia");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                item();
                break;
            case 2:
                loai();
                break;
            case 3:
                gia();
                break;
        }
    }

    public static void item() {
        System.out.print("input item: ");
        String input = scanner.nextLine();
        System.out.print("input new item you wanna change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (itemSplit[0].equals(input)) {
                String newItem = output + "-" + itemSplit[1] + "-" + itemSplit[2];
                item[i] = newItem;
            }
        }
    }

    public static void loai() {
        System.out.print("input item: ");
        String input = scanner.nextLine();
        System.out.print("input new loai you wanna change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (itemSplit[0].equals(input)) {
                String newItem = itemSplit[0] + "-" + output + "-" + itemSplit[2];
                item[i] = newItem;
            }
        }
    }

    public static void gia() {
        System.out.print("input item: ");
        String input = scanner.nextLine();
        System.out.print("input new gia you wanna change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            if (itemSplit[0].equals(input)) {
                String newItem = itemSplit[0] + "-" + itemSplit[1] + "-" + output;
                item[i] = newItem;
            }
        }
    }

    public static void Controll() {
        System.out.println("1.Sap xep tu be den lon");
        System.out.println("2.Sap xep tu lon den be");
        System.out.print("Moi nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                BetoLon();
                break;
            case 2:
                LontoBe();
                break;
        }
    }
    public static void BetoLon(){
        String[] newItem = new String[item.length];
        for (int i = 0; i < newItem.length; i++) {
            for (int j = i + 1; j < newItem.length; j++) {
                if (Integer.parseInt((item[i].split("-"))[2])>Integer.parseInt((item[j].split("-"))[2])) {
                    String chua = item[j];
                    item[j] = item[i];
                    item[i] = chua;
                }
            }
        }
        for (String string : item) {
            System.out.println(string);
        }
    }
    public static void LontoBe(){
        String[] newItem = new String[item.length];
        for (int i = 0; i < newItem.length; i++) {
            for (int j = i + 1; j < newItem.length; j++) {
                if (Integer.parseInt((item[i].split("-"))[2])<Integer.parseInt((item[j].split("-"))[2])) {
                    String chua = item[i];
                    item[i] = item[j];
                    item[j] = chua;
                }
            }
        }
        for (String string : item) {
            System.out.println(string);
        }
    }

    public static void View() {
        for (int i = 0; i < item.length; i++) {
            String[] itemSplit = item[i].split("-");
            System.out.println("item: " + itemSplit[0]);
            System.out.println("loai: " + itemSplit[1]);
            System.out.println("gia: " + itemSplit[2] + "$");
            System.out.println();
        }
    }
}
