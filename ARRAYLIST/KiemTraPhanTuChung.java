package ARRAYLIST;

import java.util.ArrayList;

public class KiemTraPhanTuChung {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(2);
        numberList.add(7);
        numberList.add(15);
        numberList.add(22);
        numberList.add(10);
        numberList.add(7);
        int c = KiemTraPhanTuChung(numberList);
        System.out.println("co " + c + " phan tu chung la");   
    }
    public static int KiemTraPhanTuChung(ArrayList<Integer> numberList){
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {
                if (numberList.get(i)==numberList.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
