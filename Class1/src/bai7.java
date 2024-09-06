import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so A va B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A= "+a+" la so lon nhat");
            System.out.println("B= "+b+" la so nho nhat");
        } else {
            System.out.println("B= "+b+" la so lon nhat");
            System.out.println("A= "+a+" la so nho nhat");
        }
    }
}
