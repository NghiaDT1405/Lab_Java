package BTVN;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so so can nhap");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac so can nhap");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
