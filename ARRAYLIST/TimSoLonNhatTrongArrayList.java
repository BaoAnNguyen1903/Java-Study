package ARRAYLIST;

import java.util.ArrayList;

public class TimSoLonNhatTrongArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(2);
        numberList.add(7);
        numberList.add(15);
        numberList.add(22);
        int c = TimSoLonNhatTrongArrayList(numberList);
        System.out.println("SLN la: " + c);
    }
    public static int TimSoLonNhatTrongArrayList(ArrayList<Integer> numberList){
        int max = 0;
        for (int i = 0; i < numberList.size(); i++) {
            if (max < numberList.get(i)) {
                max = numberList.get(i);
            }
        }
        return max;
    }
}
