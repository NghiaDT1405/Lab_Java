import java.util.Scanner;

public class bai4 {
    //Hàm kiểm tra nguyên tố
    static boolean kiemTraNguyenTo(int a){
        if(a == 2|| a== 3) return true;
        for(int i = 3; i<=Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Khai báo và nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số A cần kiểm tra:");
        int a = sc.nextInt();
        //In ra kết quả
        if(kiemTraNguyenTo(a)){
            System.out.println("Số A là số nguyên tố");
        } else {
            System.out.println("Số A không là số nguyên tố");
        }
    }
}
