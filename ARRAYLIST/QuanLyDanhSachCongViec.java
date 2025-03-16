package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDanhSachCongViec {
    static ArrayList<String> work = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        work.add("1-quetnha-daxong");
        work.add("2-ruachen-chuaxong");
        work.add("3-hocbai-chuaxong");
        work.add("4-tapgym-daxong");
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Marker");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("========================");
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
                    Marker();
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

    public static void Add() {
        System.out.print("input new work (work-trangthai) : ");
        String newWork = scanner.nextLine();
        work.add(newWork);
        System.out.println("ADD SUCCESFULLY!");
    }

    public static void View() {
        for (String string : work) {
            System.out.println(string);
        }
    }

    public static void Marker() {
        for (int i = 0; i < work.size(); i++) {
            String[] workSplit = work.get(i).split("-");
            if (workSplit[2].contains("daxong")) {
                System.out.println(workSplit[0] + "-" + workSplit[1] + "-" + workSplit[2]);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            String[] workSplit = work.get(i).split("-");
            if (workSplit[2].contains("chuaxong")) {
                System.out.println(workSplit[0] + "-" + workSplit[1] + "-" + workSplit[2]);
            }
        }
        System.out.println("ban da hoan thanh them bao nhieu cong viec");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.print("Nhap so cong viec sau khi da xong: ");
            String num = scanner.nextLine();
            for (int j = 0; j < work.size(); j++) {
                String[] workSplit = work.get(j).split("-");
                if (workSplit[0].equals(num)) {
                    workSplit[2] = "daxong";
                    String newWork = workSplit[0] + "-" + workSplit[1] + "-" + workSplit[2];
                    work.set(j, newWork);
                    break;
                }
            }
            
        }
        for (int i = 0; i < work.size(); i++) {
            String[] workSplit = work.get(i).split("-");
            if (workSplit[2].contains("daxong")) {
                System.out.println(workSplit[0] + "-" + workSplit[1] + "-" + workSplit[2]);
            }
        }

    }

    public static void Delete() {
        System.out.print("input work you wanna delete: ");
        String input = scanner.nextLine();
        for (int i = 0; i < work.size(); i++) {
            if (work.get(i).contains(input)) {
                work.remove(i);
            }
        }
        System.out.println("DELETE SUCCESFULLY!");
    }
}
