import java.util.ArrayList;
import java.util.Scanner;

public class bai06_04 {

    ArrayList<Book> lstBook = new ArrayList<>();
    public void nhapDuLieu(){
        System.out.println("So sach muon nhap");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap cuon thu"+(i+1));
            Book book = new Book();
            book.nhapDuLieu();
            lstBook.add(book);
        }
        System.out.println("Xin cam on!");
    }

    public void hienThiDanhSach(){
        System.out.println("So sach trong thu vien: ");
        for(int i = 0;i < lstBook.size(); i++){
            Book get = lstBook.get(i);
            System.err.println((i+1)+" ");
        }
    }

    public  void xoaSach(){
        System.out.println("Nhap so thu tu sach muon xoa");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if(id < lstBook.size()&&id>=0){
            lstBook.remove(id);
        }
    }

    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1.Nhap du lieu");
        System.out.println("2.Hien thi danh sach");
        System.out.println("3.Xoa");
        System.out.println("4.Thoat");
        System.out.println("Vui long nhap tu 1 - > 4");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int choose;
        bai06_04 main = new bai06_04();
        do {
            choose = main.showMenu();
            switch (choose){
                case 1:
                    main.nhapDuLieu();
                    break;
                case 2:
                    main.hienThiDanhSach();
                    break;
                case 3:
                    main.xoaSach();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}
