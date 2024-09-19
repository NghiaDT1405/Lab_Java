package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so so can nhap");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac so can nhap");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i =0; i<= n-1; i++){
            for(int j = i+1; j<= n-1; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("So nho nhat la: "+array[0]);
        System.out.println("So lon nhat la: "+array[n-1]);
    }
}
