package FOR;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                S = i * j; 
                System.out.print(i + "x" + j + "=" + S +'\t');
        }
        System.out.println();
    }
}
}
