import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;        // Thuế nhập khẩu
    private float importPriceSupport; // Giá hỗ trợ nhập khẩu

    public ThaiLandImportPrice() {
        super();
    }

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public void input() {
        super.input(); // Call phương thức input từ product
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thuế nhập khẩu: ");
        taxImported = scanner.nextFloat();
        System.out.print("Nhập giá hỗ trợ nhập khẩu: ");
        importPriceSupport = scanner.nextFloat();
    }

    @Override
    public void display() {
        super.display(); // Call display method from Product
        System.out.println("Thuế nập khẩu: " + taxImported);
        System.out.println("Giá hỗ trợ nhập khẩu: " + importPriceSupport);
        System.out.println("Giá bán tại Thái Lan: " + calculateSalePrice());
    }

    @Override
    public float calculateSalePrice() {
        float importedPrice = getProducerPrice();
        return importedPrice
                + taxImported * importedPrice
                - importPriceSupport * importedPrice
                + 0.10f * (importedPrice + taxImported * importedPrice - importPriceSupport * importedPrice);
    }
}
