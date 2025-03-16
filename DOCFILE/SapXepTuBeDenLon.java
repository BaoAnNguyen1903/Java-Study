package DOCFILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class SapXepTuBeDenLon {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        ArrayList<Integer> arr = new ArrayList<>();
        while ((line=br.readLine()) != null) {
            arr.add(Integer.parseInt(line));
        }
        for (int integer : arr) {
            System.out.println(integer);
        }
        System.out.println("Sap Xep");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for (int integer : arr) {
            System.out.println(integer);
        }
    }    
}
