package BTVN;

import java.util.Scanner;

public class Bai5 {
    public static boolean check(int n){
        if(n <= 1) return false;
        for(int i = 2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

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
            if(check(array[i])){
                System.out.println(array[i]);
            }
        }
    }
}
