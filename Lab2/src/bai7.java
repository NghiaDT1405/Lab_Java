import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();

        System.out.print("Nhập số d: ");
        int d = scanner.nextInt();

        int x = Math.max(a, b);
        int y = Math.max(c, d);
        int max = Math.max(x, y);

        System.out.println("Số lớn nhất trong 4 số là: " + max);
    }
}
