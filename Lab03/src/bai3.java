import java.util.Scanner;

public class bai3 {
    //Viết hàm tính ước chung lớn nhất
    static int UCLN(int a, int b) {
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //Khai báo biến
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 2 số nguyên n, m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        //In ra kết quả
        System.out.println("Ước chung nhỏ nhất của 2 số là: "+ UCLN(m,n));
        System.out.println("Bội chung nhỏ nhất của 2 số là: "+ (n*m)/UCLN(m,n));
    }
}
