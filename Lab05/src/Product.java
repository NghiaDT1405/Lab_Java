import java.util.Scanner;

public class Product {
    private String prodId;           // Mã sản phẩm
    private String prodName;         // Tên sản phẩm
    private String manufacturer;     // Nhà sản xuất
    private float producerPrice;     // Giá sản xuất

    public Product() {
    }

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    // Getters and Setters
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    // Phương thức nhập xuất thông tin sản phẩm
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        prodId = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        prodName = scanner.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        manufacturer = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        producerPrice = scanner.nextFloat();
    }

    // Method to display product details
    public void display() {
        System.out.println("ID sản phẩm: " + prodId);
        System.out.println("Tên sản phẩm: " + prodName);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Giá thành sản phẩm: " + producerPrice);
        System.out.println("Giá bán sản phẩm: " + calculateSalePrice());
    }

    // Method to calculate the sale price
    public float calculateSalePrice() {
        return producerPrice + 0.05f * producerPrice;  // lãi 5%
    }
}

