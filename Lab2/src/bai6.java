import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("a, b, c tạo thành một tam giác.");

            double chuVi = a + b + c;
            double p = chuVi / 2;  // Nửa chu vi
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));  // Công thức Heron

            System.out.println("Chu vi của tam giác: " + chuVi);
            System.out.println("Diện tích của tam giác: " + dienTich);
        } else {
            System.out.println("a, b, c không tạo thành một tam giác.");
        }
    }
}
