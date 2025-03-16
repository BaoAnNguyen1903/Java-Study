package HAM;

public class danhSachChuoiDaiHon5 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "An", "Tuan", "Vinh", "java"};
        String[] c = danhSachChuoiDaiHon5(arr);
        for (int i = 0; i < c.length; i++) {
            if (arr[i].length() >= 5) {
                System.out.println(c[i]);
            }
        }
    }
    public static String[] danhSachChuoiDaiHon5(String[] arr) {
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5) {
                arr2[i]=arr[i];
            }
        }
        return arr2;
    }
}
