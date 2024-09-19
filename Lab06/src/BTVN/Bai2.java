package BTVN;

import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i =0; i<= 9; i++){
            Random rand  = new Random();
            array[i] = rand.nextInt(99);
            System.out.printf("%4d",array[i]);
        }
    }
}
