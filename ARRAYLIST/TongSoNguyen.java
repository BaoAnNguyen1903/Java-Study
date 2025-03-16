package ARRAYLIST;

import java.util.ArrayList;

public class TongSoNguyen {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numberList.add(i);
        }
        int c = TongSoNguyen(numberList);
        System.out.println("tong la: " + c);
    }
    public static int TongSoNguyen(ArrayList<Integer> numberList){
        int sum = 0;
        for (Integer integer : numberList) {
            System.out.println(integer);
            sum = sum + integer;
        }
        return sum;
    } 
}
