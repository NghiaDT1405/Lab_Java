import java.util.Scanner;


public class calculator {

    public void add(int a, int b) {
        int kq = a + b;
        System.out.println(kq);
    }

    public void sub(int a, int b){
        int kq = a - b;
        System.out.printf("\n %d x %d = %d", a, b, kq);
    }



    public void  nul(int a, int b){
        int kq = a*b;
        System.out.printf("\n %d x %d = %d", a, b, kq);
    }

    public void div(int a, int b){
        int kq = 0;
        if(b == 0){
            System.out.println("Khong thuc hien duoc phep chia");
        } else  {
            kq = a/b;
            System.out.printf("\n %d x %d = %d", a, b, kq);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator cal = new calculator();
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal.add(a, b);
        cal.sub(a, b);
        cal.div(a, b);
        cal.nul(a, b);
    }
}
