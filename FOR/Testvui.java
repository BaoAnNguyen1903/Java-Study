package FOR;

public class Testvui {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int originalNumber = number;
            int sum = 0;
            int numberOfDigits = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber + " la so Armstrong.");
            }
        }
    }
}