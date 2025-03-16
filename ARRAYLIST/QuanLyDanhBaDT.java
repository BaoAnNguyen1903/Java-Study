package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDanhBaDT {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> sdt = new ArrayList<>();

    public static void main(String[] args) {
        sdt.add("An-0123");
        sdt.add("Vinh-0000");
        sdt.add("Tuan-1122");
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("========================");
            System.out.print("Nhap lua chon cua ban: ");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1:
                    // Add();
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
                    System.out.println("thankiu!");
                    System.exit(0);
                    break;
            }
        }
    }

    // public static void Add(){
    // System.out.print("input new sdt to add: ");
    // String newSdt = scanner.nextLine();
    // for (int i = 0; i < sdt.size(); i++) {
    // name[i] = sdt[i];
    // }
    // // sdt = newSdt.clone();
    // System.out.println("ADD SUCCESSFULLY");
    // }
    public static void View() {
        for (String string : sdt) {
            System.out.println(string);
        }
    }

    public static void Update() {
        System.out.println("1.Update name");
        System.out.println("2.Update Phone Numbers");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                UpdateName();
                break;
            case 2:
                UpdateSDT();
                break;
        }
    }

    public static void UpdateName() {
        System.out.print("Input name you wanna to update: ");
        String input = scanner.nextLine();
        System.out.print("Input name you wanna to change: ");
        String output = scanner.nextLine();
        for (int i = 0; i < sdt.size(); i++) {
            String[] sdtSplit = sdt.get(i).split("-");// an 0123 /vinh1 0123
            if (sdtSplit[0].equalsIgnoreCase(input)) {
                sdtSplit[0] = output; // vinh1
                String newName = sdtSplit[0] + "-" + sdtSplit[1];
                sdt.set(i, newName);
                break;
            }
        }
        System.out.println("Succesfully");
    }

    public static void UpdateSDT() {
        System.out.print("Input name you wanna to update: ");
        String input = scanner.nextLine();
        System.out.print("Input sdt: ");
        String output = scanner.nextLine();
        for (int i = 0; i < sdt.size(); i++) {
            String[] sdtSplit = sdt.get(i).split("-");
            if (sdtSplit[0].equalsIgnoreCase(input)) {
                sdtSplit[1] = output;
                String newSDT = sdtSplit[0] + "-" + sdtSplit[1];
                sdt.set(i, newSDT);
                break;
            }
        }
        System.out.println("Succesfully");
    }
    public static void Delete(){
        System.out.print("Input name you wanna to delete: ");
        String input = scanner.nextLine();
        for (int i = 0; i < sdt.size(); i++) {
            if (sdt.get(i).contains(input)) {
                sdt.remove(i);
            }
        }
    }
}
