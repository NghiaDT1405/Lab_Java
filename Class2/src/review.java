import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        //khai báo và nhập ngày tháng
        int ngay = 0, thang, nam;
        System.out.print("Nhập tháng: ");
        Scanner sc = new Scanner(System.in);
        thang = sc.nextInt();
        System.out.print("Nhập năm: ");
        nam = sc.nextInt();
        //switch case điều kiện xét số ngày của tháng
        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                ngay = 31;
                break;
            case 4: case 6: case 9: case 11:
                ngay = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    ngay = 29;
                } else {
                    ngay = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
                return;
        } //./end switch

        //in ra kết quả
        System.out.println("Tháng " + thang + " năm " + nam + " có " + ngay + " ngày.");
    }
}
