import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        String maSinhVien = sc.nextLine();

        System.out.print("Nhập điểm lý thuyết Java: ");
        double diemLyThuyet = sc.nextDouble();

        System.out.print("Nhập điểm thực hành Java: ");
        double diemThucHanh = sc.nextDouble();

        // Kiểm tra điều kiện
        if (diemLyThuyet < 4) {
            System.out.println("Thi lại lý thuyết");
        } else if (diemThucHanh < 4) {
            System.out.println("Thi lại thực hành");
        } else {
            double diemTrungBinh = (diemLyThuyet + diemThucHanh) / 2;

            if (diemTrungBinh < 4) {
                System.out.println("Sinh viên phải học lại");
            } else if (diemTrungBinh < 7) {
                System.out.println("Sinh viên đạt môn Java");
            } else {
                System.out.println("Sinh viên xuất sắc môn Java");
            }
        }
    }
}
