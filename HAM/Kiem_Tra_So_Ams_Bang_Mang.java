package HAM;

public class Kiem_Tra_So_Ams_Bang_Mang {
    static int[] arr = new int[1001];
    public static void main(String[] args) {
        NhapMang(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = DemSo(arr[i]);
            int amstrong = Kiem_Tra_So_Amstrong(arr[i], count);
            if (amstrong == arr[i]) {
                System.out.println(arr[i] + " la so amstrong");
            }
        }
    }
    public static void NhapMang(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    public static int DemSo(int number){
        int count = 0;
        while (number != 0) {
            number= number / 10;
            count++;
        }
        return count;
    }
    public static int Kiem_Tra_So_Amstrong(int number, int count){
        int sum = 0;
        while (number !=0) {
            int so = number % 10;
            sum = sum + (int) Math.pow(so, count);
            number = number / 10;
        }
        return sum;
    }
}
