package IF_ELSE;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========MENU=========");
        System.out.println("1.Bun cha");
        System.out.println("2.Pho bo");
        System.out.println("3.Com ga");
        System.out.println("4.Banh mi");
        System.out.print("Nhap lua chon cua ban: ");
        int luaChon = scanner.nextInt();

        switch (luaChon) {
            case 1:
                System.out.println("Ban da chon bun cha.");
                System.out.print("Gia 50k");
                break;
            case 2:
                System.out.println("Ban da chon pho bo.");
                System.out.print("Gia 30k");
                break;
            case 3:
                System.out.println("Ban da chon com ga.");
                System.out.print("Gia 25k");
                break;
            case 4:
                System.out.println("Ban da chon banh mi");
                System.out.print("Gia 20k");
        }
    }
}
