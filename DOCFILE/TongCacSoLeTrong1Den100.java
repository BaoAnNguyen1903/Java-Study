package DOCFILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TongCacSoLeTrong1Den100 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        int sum = 0;
        while ((line=br.readLine()) != null) {
            if (Integer.parseInt(line) % 2 != 0) {
                sum = sum + Integer.parseInt(line);
            }
        }
        System.out.println(sum);
    }
}
