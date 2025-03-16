package DOCFILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class KiemTraSoAmstrong {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Integer> arr = new ArrayList<>();
        String line = null;
        while ((line=br.readLine()) != null) {
            arr.add(Integer.parseInt(line));
        }

        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int count = 0;
            int number = arr.get(i);
            int n = number;
            while (number != 0) {
                number = number / 10;
                count++;
            }
            number = n;
            while (number != 0) {
                int so = number % 10;
                sum = sum + (int) Math.pow(so, count);
                number = number / 10;
            }
            if (sum == arr.get(i)) {
                System.out.print(n + " la so amtrong" + "\n");
            }else{
                System.out.print(n + " khong phai so amstrong" + "\n");
            }
        }
    }
}
