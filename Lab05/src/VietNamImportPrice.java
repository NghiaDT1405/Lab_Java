import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported; // Thuế nhập khẩu

    public VietNamImportPrice() {
        super();
    }

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    // Getter and Setter
    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input() {
        super.input(); // Call phương thức input từ Product
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thuế nhập khẩu: ");
        taxImported = scanner.nextFloat();
    }

    @Override
    public void display() {
        super.display(); // Call the display method of Product
        System.out.println("Thuế nhập khẩu: " + taxImported);
        System.out.println("Giá bán tại Việt Nam: " + calculateSalePrice());
    }

    @Override
    public float calculateSalePrice() {
        float importedPrice = getProducerPrice();
        return importedPrice + taxImported * importedPrice + 0.10f * (importedPrice + taxImported * importedPrice);
    }
}
