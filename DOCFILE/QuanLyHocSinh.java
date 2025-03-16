package DOCFILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line=br.readLine()) != null) {
            arr.add(line);
        }

        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Save");
            System.out.println("6.Read File");
            System.out.println("7.Exit");
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
                    ReadFile();
                    break;
                case 7:
                    System.out.println("Thankiu!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static void Add(){
        System.out.print("input student (ID-Name-Age-Mark): ");
        String sutdent = scanner.nextLine();
        arr.add(sutdent);
        System.out.println("ADD SUCCESFULLY!");
    }
    public static void View(){
        for (String string : arr) {
            System.out.println(string);
        }
    }
    public static void Update(){
        System.out.println("1.update ID");
        System.out.println("2.update name");
        System.out.println("3.update age");
        System.out.println("4.update mark");
        System.out.println("========================");
        System.out.print("Nhap lua chon cua ban: ");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                updateID();
                break;
            case 2:
                updateName();
                break;
            case 3:
                updateAge();
                break;
            case 4:
                updateMark();
                break;
        }
    }
    public static void updateID(){
        System.out.print("input ID: ");
        String studentID = scanner.nextLine();
        System.out.print("input ID you wanna change: ");
        String newID = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] studentSplit = arr.get(i).split("-");
            if (studentSplit[0].equals(studentID)) {
                studentSplit[0] = newID;
                String newStudent = studentSplit[0] + "-" + studentSplit[1] + "-" + studentSplit[2] + "-" + studentSplit[3];
                arr.set(i, newStudent);
            }
        }
        System.out.println("UPDATE SUCCESFULLY!");
    }
    public static void updateName(){
        System.out.print("input ID: ");
        String studentID = scanner.nextLine();
        System.out.print("input name you wanna change: ");
        String studentName = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] studentSplit = arr.get(i).split("-");
            if (studentSplit[0].equals(studentID)) {
                studentSplit[1] = studentName;
                String newStudent = studentSplit[0] + "-" + studentSplit[1] + "-" + studentSplit[2] + "-" + studentSplit[3];
                arr.set(i, newStudent);
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void updateAge(){
        System.out.print("input ID: ");
        String studentID = scanner.nextLine();
        System.out.print("input age you wanna change: ");
        String studentAge = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] studentSplit = arr.get(i).split("-");
            if (studentSplit[0].equals(studentID)) {
                studentSplit[2] = studentAge;
                String newStudent = studentSplit[0] + "-" + studentSplit[1] + "-" + studentSplit[2] + "-" + studentSplit[3];
                arr.set(i, newStudent);
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void updateMark(){
        System.out.print("input ID: ");
        String studentID = scanner.nextLine();
        System.out.print("input mark you wanna change: ");
        String studentMark = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            String[] studentSplit = arr.get(i).split("-");
            if (studentSplit[0].equals(studentID)) {
                studentSplit[3] = studentMark;
                String newStudent = studentSplit[0] + "-" + studentSplit[1] + "-" + studentSplit[2] + "-" + studentSplit[3];
                arr.set(i, newStudent);
            }
        }
        System.out.println("UPDATE SUCCESSFULLY!");
    }
    public static void Delete(){
        System.out.print("input ID: ");
        String studentID = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains(studentID)) {
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
        System.out.println("SAVE SUCCESSFLLY!");
    }
    public static void ReadFile() throws Exception{
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> student = new ArrayList<>();
        String line = null;
        while ((line=br.readLine()) != null) {
            student.add(line);
        }
        br.close();
        for (String string : student) {
            System.out.println(string);
        }
    }
}
