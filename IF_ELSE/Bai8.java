package IF_ELSE;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String thungay = scanner.nextLine();

        switch (thungay) {
            case "Monday":
            System.out.print("Tuesday");
                break;
            case "Tuesday":
            System.out.print("Wednesday");
                break;
            case "Wednesday":
            System.out.print("Thursday");
                break;
            case "Thursday":
            System.out.print("Friday");
                break;
            case "Friday":
            System.out.print("Saturday");
                break;
            case "Saturday":
            System.out.print("Sunday");
                break;
            case "Sunday":
            System.out.print("Monday");
                break;
        }
    }
}
