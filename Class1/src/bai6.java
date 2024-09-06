import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen N1 va M1");
        int n_1 = sc.nextInt();
        int m_1 = sc.nextInt();
        System.out.println("Nhap 2 so thuc N2 va M2");
        float n_2 = sc.nextFloat();
        float m_2 = sc.nextFloat();
//        System.out.println("Tong 2 so nguyen M1+N1 = "+(m_1+n_1));
//        System.out.println("Tong 2 so thuc M2+N2 = "+(m_2+n_2));
//        System.out.println("Tong 2 so N1 va N2 = " +(n_2+n_1));

        //Tinh
        int tong2SoNguyen = n_1+m_1;
        float tong2SoThuc = n_2+m_2;
        float tongN1N2 = n_2+n_1;

        //HienThi
        System.out.printf("\n Tong: %d +%d = %d",n_1,m_1,tong2SoNguyen);
        System.out.printf("\n Tong: %.2f +%.2f = %.2f",n_2,m_2,tong2SoThuc) ;
        System.out.printf("\n Tong: %d + %.2f = %.2f",n_1,n_2,tongN1N2);

    }
}
