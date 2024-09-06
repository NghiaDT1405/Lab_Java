import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khao bao bien
        System.out.println("Nhap 3 so nguyen:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //Tim max, min
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        //hien thi
        System.out.printf("\nNum1: %d, Num2:%d,Num3:%d, Max:%d, Min:%d", a, b, c, max, min);

    }
}
