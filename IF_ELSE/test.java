package IF_ELSE;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so:");
        int a = scanner.nextInt();
        if(a<=0){
            System.out.println("kxd");       
        }else{
            if(a % 2 == 0) {
                System.out.println("so chan");
            }else{
                System.out.println("so le");
            }
        }
}
}
    
