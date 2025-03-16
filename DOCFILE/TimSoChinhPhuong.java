package DOCFILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class TimSoChinhPhuong {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Integer> arr = new ArrayList<>();
        String line = null;
        while ((line=br.readLine()) != null) {
            arr.add(Integer.parseInt(line));
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % Math.sqrt(arr.get(i)) == 0) {
                System.out.println(arr.get(i));
            }
        }
    }
}
