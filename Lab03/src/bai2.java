import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //Khai báo biến
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int n = sc.nextInt();
        //Cách đơn giản:
        //System.out.println(n*(n+1)/2);
        for(int i = 1;i<=n;i++){
            tong += i;
        }
        System.out.println(tong);
    }
}
