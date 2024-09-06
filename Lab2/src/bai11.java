import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số x: ");
        double x = sc.nextDouble();

        System.out.print("Nhập số y: ");
        double y = sc.nextDouble();

        System.out.print("Nhập toán tử (+, -, *, /): ");
        char toanTu = sc.next().charAt(0);

        switch (toanTu) {
            case '+':
                System.out.println("Kết quả: " + (x + y));
                break;
            case '-':
                System.out.println("Kết quả: " + (x - y));
                break;
            case '*':
                System.out.println("Kết quả: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Kết quả: " + (x / y));
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ.");
        }
    }
}
