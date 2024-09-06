import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự màu (R, G, B, K): ");
        char color = sc.next().charAt(0);

        switch (color) {
            case 'R':
            case 'r':
                System.out.println("RED");
                break;
            case 'G':
            case 'g':
                System.out.println("GREEN");
                break;
            case 'B':
            case 'b':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
        }
    }
}
