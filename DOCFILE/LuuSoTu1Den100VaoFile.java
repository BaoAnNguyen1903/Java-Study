package DOCFILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class LuuSoTu1Den100VaoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\VSCode\\DOCFILE\\1den100.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 1; i < 101; i++) {
            bw.write(i + "\n");
        }
        bw.close();
    }
}
