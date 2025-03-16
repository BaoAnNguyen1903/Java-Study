package ARRAYLIST;

import java.util.ArrayList;

public class KiemTraPhanTuChung2Array {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(2);
        numberList.add(7);
        ArrayList<Integer> numberList2 = new ArrayList<>();
        numberList2.add(11);
        numberList2.add(2);
        numberList2.add(7);
        int c = KiemTraPhanTuChung2Array(numberList, numberList2);
        System.out.println("co " + c + " phan tu chung");   
    }
    public static int KiemTraPhanTuChung2Array(ArrayList<Integer> numberList, ArrayList<Integer> numberList2 ){
        int count = 0;
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = 0; j < numberList2.size(); j++) {
                if (numberList.get(i)==numberList2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
