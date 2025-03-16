package DOCFILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class KiemTraSoHoanHao {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Integer> arr = new ArrayList<>();
        String line = null;
        while ((line=br.readLine()) != null) {
            arr.add(Integer.parseInt(line));
        }
        for (int i = 1; i < arr.size(); i++) {
            int sum = 0;
            for (int j = 1; j < arr.get(i); j++) {
                if (arr.get(i) % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == arr.get(i)) {
                System.out.println(arr.get(i));
            }
        }        
    }
}
