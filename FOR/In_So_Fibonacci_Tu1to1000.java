package FOR;

public class In_So_Fibonacci_Tu1to1000 {
    public static void main(String[] args) {
        long f1 = 0;
        long f2 = 1;
        long f = f1 + f2;
        while (f < 1000) {
            f = f1 + f2;     
            f1 = f2;
            f2 = f;
            System.out.println(f);
        }
    }
}
