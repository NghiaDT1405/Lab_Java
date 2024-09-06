import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khao bao bien
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        double kq = -b / a;
        //hien thi
        System.out.println("Phương trình có nghiệm x = " + kq);

    }
}