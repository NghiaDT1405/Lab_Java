import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm Toán: ");
        double toan = sc.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double ly = sc.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double hoa = sc.nextDouble();

        double tongDiem = toan + ly + hoa;

        if (tongDiem >= 15 && toan >= 4 && ly >= 4 && hoa >= 4) {
            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Học đều các môn");
            } else {
                System.out.println("Học chưa đều các môn");
            }
        } else {
            System.out.println("Thi hỏng");
        }
    }
}
