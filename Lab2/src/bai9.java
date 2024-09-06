import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn 1 để chọn Kéo, 2 để chọn Búa, 3 để chọn Bao:");
        int player = scanner.nextInt();

        // Máy tính chọn ngẫu nhiên
        int comp = (int) (Math.random() * 3) + 1;

        // Hiển thị lựa chọn của người chơi và máy tính
        System.out.println("Người chơi chọn: " + luaChon(player));
        System.out.println("Máy tính chọn: " + luaChon(comp));

        // Kiểm tra kết quả
        if (player == comp) {
            System.out.println("Hòa!");
        } else if ((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2)) {
            System.out.println("Người chơi thắng!");
        } else {
            System.out.println("Máy tính thắng!");
        }
    }

    public static String luaChon(int kq) {
        switch (kq) {
            case 1:
                return "Kéo";
            case 2:
                return "Búa";
            case 3:
                return "Bao";
            default:
                return "Lựa chọn không hợp lệ";
        }
    }
}
