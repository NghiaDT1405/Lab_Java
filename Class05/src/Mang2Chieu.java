import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        int row;// = 3;
        int col ;//= 4;
        //khai bao mang
        //int[][] arr = new int[row][col];
        //khai bao va khoi ta gia tri
        int[][] mang = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
        };//Mang co 3 dong va 4 cot
        //In ca phan thu trong mang
        System.out.println("\n Danh sach: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.printf("%4d", mang[i][j]);
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        //Nhap so dong
        System.out.println("Nhap dong");
        row = sc.nextInt();
        //Nhap so cot
        System.out.println("Nhap cot");
        col = sc.nextInt();
        //Khai bao mang
        int[][] arr = new int[row][col];
        System.out.println("Nhap cac gia tri cho cac phan tu trong mang");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        //hien thi gia tri cua mang
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
