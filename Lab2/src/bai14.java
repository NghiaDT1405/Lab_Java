import java.util.Scanner;

public  class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chỉ số cũ và chỉ số mới
        System.out.print("Nhập chỉ số cũ: ");
        int chiSoCu = scanner.nextInt();

        System.out.print("Nhập chỉ số mới: ");
        int chiSoMoi = scanner.nextInt();

        if (chiSoMoi < chiSoCu) {
            System.out.println("Chỉ số mới không được nhỏ hơn chỉ số cũ!");
            return;
        }

        int soDienTieuThu = chiSoMoi - chiSoCu;
        int dinhMuc = 50;
        int tienDinhMuc = dinhMuc * 230;
        int tienVuotMuc = 0;

        if (soDienTieuThu > dinhMuc) {
            int vuotMuc = soDienTieuThu - dinhMuc;

            if (vuotMuc <= 50) {
                tienVuotMuc = vuotMuc * 480;
            } else if (vuotMuc <= 100) {
                tienVuotMuc = 50 * 480 + (vuotMuc - 50) * 700;
            } else {
                tienVuotMuc = 50 * 480 + 50 * 700 + (vuotMuc - 100) * 900;
            }
        }

        int tienThueBao = 1000;
        int tongTien = tienDinhMuc + tienVuotMuc + tienThueBao;

        // Xuất kết quả
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Tiền trả định mức: " + tienDinhMuc + " đồng");
        System.out.println("Tiền trả vượt định mức: " + tienVuotMuc + " đồng");
        System.out.println("Tổng tiền phải trả: " + tongTien + " đồng");
    }
}
