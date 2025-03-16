package ARRAYLIST;

import java.util.ArrayList;

public class InRaManHinhSoChan {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            numberList.add(i);
        }
        for (Integer integer : numberList) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }
}
