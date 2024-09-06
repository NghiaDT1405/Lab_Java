import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GeneralManager {
    private final ArrayList<VietNamImportPrice> vietnamProducts = new ArrayList<>();
    private final ArrayList<ThaiLandImportPrice> thailandProducts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Phương thức nhập sản phẩm Việt Nam
    public void inputVietnamProducts(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm Việt Nam thứ " + (i + 1));
            VietNamImportPrice product = new VietNamImportPrice();
            product.input();
            vietnamProducts.add(product);
        }
    }

    // Phương thức nhập sản phẩm Thailand
    public void inputThailandProducts(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm Thái Lan thứ " + (i + 1));
            ThaiLandImportPrice product = new ThaiLandImportPrice();
            product.input();
            thailandProducts.add(product);
        }
    }

    // Phương thức trình bày sản phẩm
    public void displayAllProducts() {
        System.out.println("\nSản phẩm từ Việt Nam:");
        for (VietNamImportPrice product : vietnamProducts) {
            product.display();
        }

        System.out.println("\nSản phẩm từ Thái Lan:");
        for (ThaiLandImportPrice product : thailandProducts) {
            product.display();
        }
    }

    // Phương thức sắp xếp và hiển thị sản phẩm theo tên
    public void sortAndDisplayProducts() {
        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.addAll(vietnamProducts);
        allProducts.addAll(thailandProducts);

        // sắp xếp theo tên
        allProducts.sort(Comparator.comparing(Product::getProdName));

        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp theo tên:");
        for (Product product : allProducts) {
            product.display();
        }
    }

    // Phương thức hiển thị giá bán
    public void displaySalePrices() {
        System.out.println("\nGiá bán của sản phẩm tại Việt Nam:");
        for (VietNamImportPrice product : vietnamProducts) {
            product.display();
        }

        System.out.println("\nGiá bán của sản phẩm tại Thái Lan:");
        for (ThaiLandImportPrice product : thailandProducts) {
            product.display();
        }
    }

    // Phương thức tìm kiếm theo giá thành
    public void searchBySalePrice(float salePrice) {
        boolean found = false;
        System.out.println("\nTìm kiếm sản phẩm có giá bán là: " + salePrice);

        for (VietNamImportPrice product : vietnamProducts) {
            if (product.calculateSalePrice() == salePrice) {
                product.display();
                found = true;
            }
        }

        for (ThaiLandImportPrice product : thailandProducts) {
            if (product.calculateSalePrice() == salePrice) {
                product.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào với giá bán này.");
        }
    }

    // Hàm main
    public static void main(String[] args) {
        GeneralManager manager = new GeneralManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập thông tin sản phẩm cho Việt Nam");
            System.out.println("2. Nhập thông tin sản phẩm cho Thái Lan");
            System.out.println("3. Hiển thị tất cả sản phẩm");
            System.out.println("4. Sắp xếp và hiển thị sản phẩm theo tên");
            System.out.println("5. Hiển thị giá bán của sản phẩm");
            System.out.println("6. Tìm kiếm sản phẩm theo giá bán");
            System.out.println("7. Thoát");
            System.out.print("Chọn lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sản phẩm cho Việt Nam: ");
                    int nVN = sc.nextInt();
                    sc.nextLine();
                    manager.inputVietnamProducts(nVN);
                    break;
                case 2:
                    System.out.print("Nhập số lượng sản phẩm cho Thái Lan: ");
                    int nTH = sc.nextInt();
                    sc.nextLine();
                    manager.inputThailandProducts(nTH);
                    break;
                case 3:
                    manager.displayAllProducts();
                    break;
                case 4:
                    manager.sortAndDisplayProducts();
                    break;
                case 5:
                    manager.displaySalePrices();
                    break;
                case 6:
                    System.out.print("Nhập giá bán để tìm kiếm: ");
                    float salePrice = sc.nextFloat();
                    manager.searchBySalePrice(salePrice);
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 7);

        sc.close();
    }
}
