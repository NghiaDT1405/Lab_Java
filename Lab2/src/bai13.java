import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giờ làm: ");
        double soGioLam = scanner.nextDouble();

        System.out.print("Nhập lương theo giờ: ");
        double luongGio = scanner.nextDouble();

        double luongTong;

        if (soGioLam <= 40) {
            luongTong = soGioLam * luongGio;
        } else {
            luongTong = 40 * luongGio + (soGioLam - 40) * luongGio * 1.5;
        }

        System.out.println("Tổng tiền lương: " + luongTong);
    }
}
