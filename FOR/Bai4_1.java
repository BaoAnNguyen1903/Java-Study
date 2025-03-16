package FOR;

public class Bai4_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i ++) {
            int check = i; int count = (int) Math.log10(i) + 1; int sum = 0;
            
            while (check > 0) {
                int du = check % 10;
                sum = sum + (int) Math.pow(du, count);
                check = check / 10;
            }
            
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
