package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> item = new ArrayList<>();
    public static void main(String[] args) {
        item.add("tivi-dientu");
        item.add("laptop-dientu");
        item.add("chao-dungcunauan");
        item.add("noi-dungcunauan");
        item.add("fpt-rac");
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
        System.out.print("input item you want to add (item-loai) : ");
        String output = scanner.nextLine();
        item.add(output);
        System.out.println("ADD SUCCESSFULLY!");
    }
    public static void View(){
        for (String string : item) {
            System.out.println(string);
        }
    }
    public static void Update(){
        System.out.println("1.Update item");
        System.out.println("2.Update Loai");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                UpdateItem();
                break;
            case 2:
                UpdateLoai();
                break;
        }
    }
    public static void UpdateItem(){
        System.out.print("input item you want to update: ");
        String input = scanner.nextLine();
        System.out.print("input new item you want to change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < item.size(); i++) {
            String[] itemSplit = item.get(i).split("-");
            if (itemSplit[0].equalsIgnoreCase(input)) {
                itemSplit[0] = output;
                String newItem = itemSplit[0] + "-" + itemSplit[1];
                item.set(i, newItem);
                break;
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void UpdateLoai(){
        System.out.print("input item you want to update: ");
        String input = scanner.nextLine();
        System.out.print("input new loai you want to change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < item.size(); i++) {
            String[] itemSplit = item.get(i).split("-");
            if (itemSplit[0].equalsIgnoreCase(input)) {
                itemSplit[1] = output;
                String newItem = itemSplit[0] + "-" + itemSplit[1];
                item.set(i, newItem);
                break;
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void Delete(){
        System.out.print("input item you want to delete: ");
        String input = scanner.nextLine();
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).contains(input)) {
                item.remove(i);
            }
        }
        System.out.println("DELETE SUCCESFULLY!");
    }
}
