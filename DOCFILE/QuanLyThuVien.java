package DOCFILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        ReadFile();
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Save");
            System.out.println("6.Exit");
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
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    Save();
                    break;
                case 6:
                    System.out.println("Thankiuuu!!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static void ReadFile() throws Exception{
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line=br.readLine()) != null) {
            arr.add(line);
        }
        br.close();
    }
    public static void Add(){
        System.out.print("input new book (ID-Name-Author-Number): ");
        String book = scanner.nextLine();
        arr.add(book);
        System.out.println("ADD SUCCESFULLY!");
    }
    public static void View(){
        for (String string : arr) {
            System.out.println(string);
        }
    }
    public static void Update(){
            System.out.println("1.Update ID");
            System.out.println("2.Update Name");
            System.out.println("3.Update Author");
            System.out.println("4.Update Number");
            System.out.print("Nhap lua chon cua ban: ");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1:
                    UpdateID();
                    break;
                case 2:
                    UpdateName();
                    break;
                case 3:
                    UpdateAuthor();
                    break;
                case 4:
                    UpdateNumber();
                    break;
        }
    }
    public static void UpdateID(){
        System.out.print("input ID: ");
        String input = scanner.nextLine();
        System.out.print("input new ID:");
        String output = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] bookSplit = arr.get(i).split("-");
            if (bookSplit[0].equals(input)) {
                bookSplit[0] = output;
                String newBook = bookSplit[0] + "-" + bookSplit[1] + "-" + bookSplit[2] + "-" + bookSplit[3];
                arr.set(i, newBook);
            }
        }
        System.out.println("UPDATE SUCCESFULLY!");
    }
    public static void UpdateName(){
        System.out.print("input ID: ");
        String input = scanner.nextLine();
        System.out.print("input new name: ");
        String output = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] bookSplit = arr.get(i).split("-");
            if (bookSplit[0].equals(input)) {
                bookSplit[1] = output;
                String newBook = bookSplit[0] + "-" + bookSplit[1] + "-" + bookSplit[2] + "-" + bookSplit[3];
                arr.set(i, newBook);
            }
        }
        System.out.println("UPDATE SUCCESFULLY!");
    }
    public static void UpdateAuthor(){
        System.out.print("input ID: ");
        String input = scanner.nextLine();
        System.out.print("input new author: ");
        String output = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] bookSplit = arr.get(i).split("-");
            if (bookSplit[0].equals(input)) {
                bookSplit[2] = output;
                String newBook = bookSplit[0] + "-" + bookSplit[1] + "-" + bookSplit[2] + "-" + bookSplit[3];
                arr.set(i, newBook);
            }
        }
        System.out.println("UPDATE SUCCESFULLY!");
    }
    public static void UpdateNumber(){
        System.out.print("input ID: ");
        String input = scanner.nextLine();
        System.out.print("input new number: ");
        String output = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] bookSplit = arr.get(i).split("-");
            if (bookSplit[0].equals(input)) {
                bookSplit[3] = output;
                String newBook = bookSplit[0] + "-" + bookSplit[1] + "-" + bookSplit[2] + "-" + bookSplit[3];
                arr.set(i, newBook);
            }
        }
        System.out.println("UPDATE SUCCESFULLY!");
    }
    public static void Delete(){
        System.out.print("input ID to delete: ");
        String input = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] bookSplit = arr.get(i).split("-");
            if (bookSplit[0].equals(input)) {
                arr.remove(i);
            }
        }
    }
    public static void Save() throws Exception{
        FileWriter fw = new FileWriter("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < arr.size(); i++) {
            bw.write(arr.get(i) + "\n");
        }
        bw.close();
        System.out.println("SAVE SUCCESFULLY!!");
    }
}
