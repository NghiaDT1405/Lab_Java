import java.util.Scanner;

class XeMay {
    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;

    // Nhập thông tin
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên xe máy: ");
        ten = sc.nextLine();

        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();

        System.out.print("Nhập số lượng bánh xe: ");
        soLuongBanhXe = sc.nextInt();
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Tên xe máy: " + ten);
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Số lượng bánh xe: " + soLuongBanhXe);
    }

    // Main
    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        xeMay.nhapThongTin();
        xeMay.hienThiThongTin();
    }
}
