import java.util.Random;

public class bai1 {
    public static void main(String[] args) {
        //khai bao
        int[] array;
        //Khoi tao kich thuoc mang
        array = new int[10];
        //gan gia tri cho cac phan tu trong mang
        array[0] = 10;
        array[5] = 20;
        array[9] = 30;
        //duyet mang va lay gia tri de hien thi
        System.out.println("\n");
        for(int i =0; i<= 9; i++){
            System.out.printf("%4d",array[i]);
        }
        System.out.println("\n");
        //gan gia tri ngau nhien cho cac phan tu trong mag
        for(int i =0; i<= 9; i++){
            Random rand  = new Random();
            array[i] = rand.nextInt(99);
            System.out.printf("%4d",array[i]);
        }

        //sap xep
        for(int i =0; i<= 9; i++){
            for(int j = i+1; j<= 9; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        //in mang da sap xep
        System.out.println("\n");
        for(int i =0; i<= 9; i++){
            System.out.printf("%4d",array[i]);
        }
    }
}
