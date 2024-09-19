package BTVN;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        //khai bao
        int[] array;
        //Khoi tao kich thuoc mang
        array = new int[10];
        //gan gia tri cho cac phan tu trong mang
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 20;
        array[6] = 30;
        array[7] = 40;
        array[8] = 50;
        array[9] = 30;
        //duyet mang va lay gia tri de hien thi
        System.out.println("\n");
        for(int i =0; i<= 9; i++){
            System.out.printf("%4d",array[i]);
        }
        System.out.println("\n");
    }
}
