package HAM;

import java.util.Scanner;

public class Kiem_Tra_So_Amstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao: ");
        int number = scanner.nextInt();

        int count = DemSo(number);
        int amstrong = Kiem_Tra_So_Amstrong(number, count);

        if (amstrong == number) {
            System.out.println(number + " la so amstrong");
        }else{
            System.out.println(number + " khong phai la so amstrong");
        }
    }

    public static int DemSo(int number){
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
    public static int Kiem_Tra_So_Amstrong(int number, int count){
        int sum = 0;
        while (number !=0) {
            int so = number % 10;
            sum = sum + (int) Math.pow(so, count);
            number = number / 10;
        }
        return sum;
    }
}


