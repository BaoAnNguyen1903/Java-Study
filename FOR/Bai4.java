package FOR;

public class Bai4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n = i; int count = 0; int sum = 0;
            
            while (n > 0) {
                n = n / 10;
                count++;
            }

            n = i;
            while (n > 0) {
                int du = n % 10;
                sum = sum + (int) Math.pow(du, count);
                n = n / 10;
            }
            
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

