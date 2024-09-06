import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        String tenSinhVien;
        int tuoi;
        float diemThiLyThuyet;
        float diemThiThucHanh;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten");
        tenSinhVien = input.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = input.nextInt();
        System.out.println("Nhap diem ly thuyet");
        diemThiLyThuyet = input.nextFloat();
        System.out.println("Nhap diem thuc hanh");
        diemThiThucHanh = input.nextFloat();

        float diemTrungBinh = (diemThiLyThuyet+diemThiThucHanh)/2;

        System.out.println("Chao ban: " + tenSinhVien+"_"+tuoi+"tuoi");
        System.out.println("Diem trung binh: " + diemTrungBinh);

    }
}
