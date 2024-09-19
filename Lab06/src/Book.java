import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private int numOfPages;
    private float price;

    public void nhapDuLieu() {
        //Nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap du lieu cho sach");
        System.out.println("Ten sach");
        this.bookName = sc.nextLine();
        System.out.println("\nNha Xuat Ban");
        this.nxb = sc.nextLine();
        System.out.println("\nNam Xuat Ban");
        this.yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.println("\nTac Gia");
        this.author = sc.nextLine();
        System.out.println("\nSo Trang");
        this.numOfPages = sc.nextInt();
        sc.nextLine();
        System.out.println("\nGia");
        this.price = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", nxb=" + nxb + ", yearOfPublish=" + yearOfPublish + ", author="+author+", numOfPages=" + numOfPages + ", price=" + price + "]";
    }
}
