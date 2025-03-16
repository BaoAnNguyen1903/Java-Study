package DOCFILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class KiemTraSoChiaHetCho5 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Integer> arr = new ArrayList<>();
        String line = null;
        while ((line=br.readLine()) != null) {
            arr.add(Integer.parseInt(line));
        }
        for (int integer : arr) {
            System.out.println(integer);
        }
        System.out.println("so chia het cho 5");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 5 == 0) {
                System.out.print(arr.get(i) + " ");
            }
        }
        System.out.println("");
        System.out.println("so chan");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                System.out.print(arr.get(i) + " ");
            }
        }
        System.out.println(" ");
        System.out.println("So le");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
