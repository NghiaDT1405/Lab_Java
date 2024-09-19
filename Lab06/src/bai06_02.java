import java.util.Scanner;

public class bai06_02 {
    String arrNhanVien[][] = new String[3][2];

    public void nhapDuLieu() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu" + (i + 1));
            Scanner sc = new Scanner(System.in);
            arrNhanVien[i][0] = sc.nextLine();
            arrNhanVien[i][1] = sc.nextLine();
        }
        System.out.println("Cam on da nhap du lieu");
    }

    public void sapXep() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            for (int j = i+1; j < arrNhanVien[i].length; j++) {
                if (Float.parseFloat(arrNhanVien[j][1]) < Float.parseFloat(arrNhanVien[i][1])) {
                    String temp[][] = new String[1][2];

                    //doi cho
                    temp[0][0] = arrNhanVien[i][0];
                    temp[1][0] = arrNhanVien[i][1];

                    arrNhanVien[j][0] = temp[i][0];
                    arrNhanVien[j][1] = temp[i][1];

                    arrNhanVien[i][0] = temp[0][0];
                    arrNhanVien[i][1] = temp[0][1];
                }
            }
        }
    }

    public void hienThi(){
        for(int i = 0; i < arrNhanVien.length; i++){
            System.out.println(arrNhanVien[i][0]+ "-"+arrNhanVien[i][1]);
        }
    }
    public static void main(String[] args) {
        bai06_02 main = new bai06_02();
        main.nhapDuLieu();
        main.sapXep();
        main.hienThi();
    }


}
